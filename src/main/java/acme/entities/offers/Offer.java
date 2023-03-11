
package acme.entities.offers;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.components.accounts.Administrator;
import acme.framework.components.datatypes.Money;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Offer extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotNull
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				instantiationMoment;

	@NotBlank
	@Length(max = 75)
	protected String			heading;

	@NotBlank
	@Length(max = 100)
	protected String			summary;

	//TODO: restriction: start date must be at least 1 day after it's instantiation date
	@NotNull
	@Future
	@Temporal(TemporalType.DATE)
	protected Date				availabilityStart;

	//TODO: restriction: period must be at least one week long
	@NotNull
	@Future
	@Temporal(TemporalType.DATE)
	protected Date				availabilityEnd;

	@NotNull
	@Valid
	protected Money				price;

	@URL
	protected String			link;

	// Relationships ----------------------------------------------------------

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	protected Administrator		administrator;

}
