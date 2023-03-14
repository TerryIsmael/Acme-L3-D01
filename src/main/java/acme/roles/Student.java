
package acme.roles;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Student extends AbstractRole {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 75)
	protected String			statement;

	@NotBlank
	@Length(max = 100)
	protected String			strongFeatures;

	@NotBlank
	@Length(max = 100)
	protected String			weakFeatures;

	@URL
	protected String			link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
