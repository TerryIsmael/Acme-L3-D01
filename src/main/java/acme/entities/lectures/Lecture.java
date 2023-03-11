
package acme.entities.lectures;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import acme.entities.enumerates.Type;
import acme.framework.data.AbstractEntity;
@Getter 
@Setter
@Entity
public class Lecture extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			abstract_;

	@NotNull
	protected Double			learningTime;

	@NotBlank
	@Length(max = 100)
	protected String			body;

	@NotNull
	protected Type				type;

	@URL
	protected String			link;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
