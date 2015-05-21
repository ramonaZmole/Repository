package com.steps;

import java.io.IOException;

import javax.mail.MessagingException;

import org.junit.Assert;

import com.tools.EmailCheck;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EmailVerifySteps extends ScenarioSteps {

	EmailCheck email;

	/*
	 * @Step public void emailCheck(String firstName, String startDate, String
	 * endDate, String approver) { email.checkContent(firstName, startDate,
	 * endDate, approver); }
	 */

	@Step
	public void checkContent(String firstName, String startDate, String endDate, String approver, String host, String storeType, String user, String password) throws MessagingException, IOException {
		String body = email.check(host, storeType, user, password);
		String expectedEmail = "Dear " + firstName + ",<br /> <br />   ";
		expectedEmail = expectedEmail
				+ "You have submitted a new Vacation Request.Your holiday interval is: <strong>"
				+ startDate
				+ " -"
				+ endDate
				+ "</strong>.  <br />     Please check if the request was approved before going on holiday, if not please contact your vacation approver, <b>"
				+ approver
				+ "</b>.   <!-- <br/> <br/> Cheers, <br /> The EvoPortal Team--><br/> <br/> Cheers, <br /> The EvoPortal Team";
		boolean check = true;
				
		  if(body==expectedEmail){ check=false; }
		  Assert.assertFalse("Failure: Email is not as expected!", check); }
		 
	}
