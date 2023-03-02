
package acme.entities.tutorialsSessions;

import java.sql.Date;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.enumerates.TutorialSessionType;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class TutorialSession extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long		serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 76)
	protected String				title;

	@NotBlank
	@Length(max = 101)
	protected String				resume;

	protected TutorialSessionType	type;

	protected Date					startDate;

	@URL
	protected String				link;
	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
