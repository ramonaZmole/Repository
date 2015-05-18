package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LeftMenuPage;
import com.pages.NewVacationRequestPage;

public class newVacationRequestSteps extends ScenarioSteps {
	LeftMenuPage leftMenu;
	NewVacationRequestPage NewVacationRequest;

	@Step
	public void selectNewVacationRequest() {
		leftMenu.selectNewVacation();
	}

	@Step
	public void selectStartDate() {
		NewVacationRequest.selectStartDate();
		waitABit(3000);

	}

	@Step
	public void selectStartDate12() {
		NewVacationRequest.selectStartDate12();
		waitABit(3000);
	}

	@Step
	public void selectEndDate() {
		NewVacationRequest.selectEndDate();
		waitABit(3000);
	}

	@Step
	public void selectEndDate25() {
		NewVacationRequest.selectEndDate25();
		waitABit(3000);
	}

	@Step
	public void selectSaveButton() {
		NewVacationRequest.selectSaveButton();
		waitABit(7000);
	}

	@Step
	public void selectCommentButton() {
		NewVacationRequest.selectCommentButton();
	}
	
	@Step
	public void selectRequiredCommentButton() {
		NewVacationRequest.selectRequiredCommentButton();
	}

	@Step
	public void selectCommentField() {
		NewVacationRequest.selectCommentField();
		waitABit(3000);
	}

	/*
	 * @Step public string writeCommentField(string String){ for(a=0;a<7;a++){
	 * println("1234567890"); } }
	 */
	@Step
	public void selectVacationWithoutPaymentButton() {
		NewVacationRequest.selectVacationWithoutPaymentButton();
	}

	@Step
	public void selectDurationAndDomainField() {
		NewVacationRequest.selectDurationAndDomainField();
	}

	@Step
	public void selectInstitutionNameField() {
		NewVacationRequest.selectInstitutionNameField();
	}

	@Step
	public void selectSickLeaveButton() {
		NewVacationRequest.selectSickLeaveButton();
	}

	@Step
	public void selectSpecialVacationButton() {
		NewVacationRequest.selectSpecialVacationButton();
	}

	
	@Step
	public void selectSpecialVacationMarriage(String value) {
		NewVacationRequest.selectSpecialVacationMarriage(value);
	}
	
	@Step
	public void selectSpecialVacationChildBirth(String value) {
		NewVacationRequest.selectSpecialVacationChildBirth(value);
	}
	
	@Step
	public void selectSpecialVacationFuneral(String value) {
		NewVacationRequest.selectSpecialVacationFuneral(value);
	}
	
	@Step
	public void selectSpecialVacationOther(String value) {
		NewVacationRequest.selectSpecialVacationOther(value);
	}

	@Step
	public void selectMaternityLeaveButton() {
		NewVacationRequest.selectMaternityLeaveButton();
	}
	
	@Step
	public void selectMaternityLeavePrenatal(String value) {
		NewVacationRequest.selectMaternityLeavePrenatal(value);
}
	
	@Step
	public void selectMaternityLeaveConcediu(String value) {
		NewVacationRequest.selectMaternityLeavePrenatal(value);
}
}