
package acme.forms;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LecturerDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	Double						totalNumberOfLectures;
	Double						avegarageLearningTimeOfLectures;
	Double						deviationLearningTimeOfLectures;
	Double						minimumLearningTimeOfLectures;
	Double						maximumLearningTimeOfLectures;
	Double						avegarageLearningTimeOfCourses;
	Double						deviationLearningTimeOfCourses;
	Double						minimumLearningTimeOfCourses;
	Double						maximumLearningTimeOfCourses;
	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
