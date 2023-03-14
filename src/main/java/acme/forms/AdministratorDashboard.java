
package acme.forms;

import java.util.Map;

import acme.framework.data.AbstractForm;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdministratorDashboard extends AbstractForm {

	// Serialisation identifier -----------------------------------------------

	protected static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	//Strings represent every role: Assistant, Auditor, Consumer, Lecturer, Provider, Student
	Map<String, Integer>		numberOfPrincipalsByRol;

	Double						peepsWithEmailAndLinkRatio;
	Double						criticalBulletinsRatio;
	Double						nonCriticalBulletinsRatio;

	//Strings represent currencies: EUR, USD, GBP
	Map<String, Double>			averageBudgetOffersByCurrency;
	Map<String, Double>			minimunBudgetOffersByCurrency;
	Map<String, Double>			maximunBudgetOffersByCurrency;
	Map<String, Double>			offersBudgetDeviationByCurrency;

	Double						averageNumberOfNotesOverLastTenWeeks;
	Double						minimunNumberOfNotesOverLastTenWeeks;
	Double						maximunNumberOfNotesOverLastTenWeeks;
	Double						NumberOfNotesDeviationOverLastTenWeeks;

}
