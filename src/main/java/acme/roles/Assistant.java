
package acme.roles;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import acme.framework.data.AbstractRole;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Assistant extends AbstractRole {

	protected static final long	serialVersionUID	= 1L;

	@NotNull
	@Length(max = 76)
	protected String supervisor;

	@NotNull
	@Length(max = 101)
	protected String expertises;

	@NotNull
	@Length(max = 101)
	protected String resume;

	protected String link;
}
