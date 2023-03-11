
package acme.entities.courseLectures;

import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import acme.entities.courses.Course;
import acme.entities.lectures.Lecture;
import acme.framework.data.AbstractEntity;
@Getter
@Setter
@Entity
public class CourseLecture extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	protected Lecture			lecture;

	@NotNull
	@Valid
	@ManyToOne(optional = false)
	protected Course			course;

}
