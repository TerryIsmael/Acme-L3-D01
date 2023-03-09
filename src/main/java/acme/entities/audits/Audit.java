
package acme.entities.audits;

import javax.persistence.Entity;

import acme.framework.data.AbstractEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Audit extends AbstractEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long serialVersionUID = 1L;

}
