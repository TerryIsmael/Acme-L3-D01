
package acme.entities.auditing_records;

import java.time.Duration;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.audits.Audit;
import acme.framework.data.AbstractEntity;
import acme.framework.helpers.MomentHelper;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class AuditingRecord extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 76)
	protected String			subject;

	@NotBlank
	@Length(max = 101)
	protected String			assessment;

	@NotNull
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				startDate;

	@NotNull
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	protected Date				finishDate;

	@NotNull
	protected Mark				mark;

	@URL
	protected String			link;

	// Derived attributes -----------------------------------------------------


	//TODO: Service restriction: This period must be longer than 1 hour
	@Transient
	public Double getHoursFromPeriod() {
		final Duration duration = MomentHelper.computeDuration(this.startDate, this.finishDate);
		return duration.getSeconds() / 3600.0;
	}

	// Relationships ----------------------------------------------------------


	@NotNull
	@Valid
	@ManyToOne(optional = false)
	protected Audit audit;

}
