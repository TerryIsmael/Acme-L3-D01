/*
 * SignUpTest.java
 *
 * Copyright (C) 2012-2023 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.testing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SignUpTest extends TestHarness {

	@ParameterizedTest
	@CsvFileSource(resources = "/sign-up/positive.csv", encoding = "utf-8", numLinesToSkip = 1)
	public void test100Positive(final String username, final String password, final String name, final String surname, final String email) {
		super.signUp(username, password, name, surname, email);
		super.signIn(username, password);
		super.signOut();
		super.checkLinkExists("Sign in");
	}

	public void test200Negative() {
		// TODO
	}

	public void test300Hacking() {
		// TODO
	}
}
