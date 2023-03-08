
package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuditorDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Double						totalNumberOfAudits;
	Double						averageNumberOfAuditingRecords;
	Double						deviationOfAuditingRecords;
	Double						minimunNumberOfAuditingRecords;
	Double						maximunNumberOfAuditingRecords;
	Double						averageTimeOfAuditingRecords;
	Double						timeDeviationOfAuditingRecords;
	Double						minimunTimeOfAuditingRecords;
	Double						maximunTimeOfAuditingRecords;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
