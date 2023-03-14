
package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Integer						totalActivities;
	Double						averageTotalTime;
	Double						deviationTotalTime;
	Integer						minTotalTime;
	Integer						maxTotalTime;
	Double						averageLearningTime;
	Double						deviationLearningTime;
	Integer						minLearningTime;
	Integer						maxLearningTime;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
