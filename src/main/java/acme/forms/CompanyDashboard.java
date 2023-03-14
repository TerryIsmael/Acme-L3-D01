
package acme.forms;

import java.util.List;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CompanyDashboard extends AbstractForm {
	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	List<Integer>				totalNumerberOfPracticaGroupedByMonth;
	Double						avegaragePeriodLengthOfSessionsInPractica;
	Double						deviationPeriodLengthOfSessionsInPractica;
	Double						minimumPeriodLengthOfSessionsInPractica;
	Double						maximumPeriodLengthOfSessionsInPractica;
	Double						avegaragePeriodLengthOfTheirPractica;
	Double						deviationPeriodLengthOfTheirPractica;
	Double						minimumPeriodLengthOfTheirPractica;
	Double						amaximumPeriodLengthOfTheirPractica;
	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
