
package acme.entities.lectures;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.URL;

import acme.entities.enumerates.Type;
import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Lecture extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Length(max = 75)
	protected String			title;

	@NotBlank
	@Length(max = 100)
	protected String			abstraction;

	//Positive, not null
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
