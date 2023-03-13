
package acme.entities.enrolment;

import java.beans.Transient;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Enrolment extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Column(unique = true)
	@NotBlank
	@Pattern(regexp = "[A-Z]{1,3}[0-9]{3}")
	protected String			code;

	@NotBlank
	@Length(max = 75)
	protected String			motivation;

	@NotBlank
	@Length(max = 100)
	protected String			goals;

	// Derived attributes -----------------------------------------------------


	@Transient
	//TODO: función derivada
	private static Integer period() {
		/*
		 * Se trata de una propiedad derivada
		 * que va a calcular el periodo de tiempo de una inscripccion
		 * mediante las actividades asociadas a esta.
		 */
		return null;
	}

	// Relationships ----------------------------------------------------------


	@ManyToOne(optional = false)
	protected Course course;

}
