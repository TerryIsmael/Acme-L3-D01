
package entities.auditing_records;

public enum Mark {

	A_PLUS("A+"), A("A"), B("B"), C("C"), F("F"), F_MINUS("F-");


	private String value;


	private Mark(final String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.value;
	}
}
