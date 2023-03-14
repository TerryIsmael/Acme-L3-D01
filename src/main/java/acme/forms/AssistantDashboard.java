
package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AssistantDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Double						totalNumberOfTutorials;
	Double						averageTimeOfTutorialsSessions;
	Double						deviationTimeOfTutorialsSessions;
	Double						minimumTimeOfTutorialsSessions;
	Double						maximumTimeOfTutorialsSessions;
	Double						averageTimeOfTutorials;
	Double						deviationTimeOfTutorials;
	Double						minimumTimeOfTutorials;
	Double						maximumTimeOfTutorials;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
