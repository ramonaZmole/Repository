package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class NewVacationRequestPage extends PageObject {

	@FindBy(css = "a[href='http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&amp']")
	private WebElementFacade NewVacationRequest;

	@FindBy(css = "input#_evovacation_WAR_EvoVacationportlet_startDate")
	private WebElementFacade StartDate;

	@FindBy(css = "table[class='dp_daypicker'] tbody tr:nth-child(4) td:nth-child(3)")
	private WebElementFacade StartDate12;

	@FindBy(css = "input#_evovacation_WAR_EvoVacationportlet_saveButton")
	private WebElementFacade SaveButton;

	@FindBy(css = "input#_evovacation_WAR_EvoVacationportlet_endDate")
	private WebElementFacade EndDate;
/*
	@FindBy(css = "table[class='dp_daypicker'] tbody tr:nth-child(6) td:nth-child(2)")
	private WebElementFacade EndDate25;
	*/
	
	@FindBy(css = "select[button#aui_3_4_0_1_369]")
	private WebElementFacade EndDate25;

	@FindBy(css = "div#_evovacation_WAR_EvoVacationportlet_newVacationComment.optionalComment")
	private WebElementFacade CommentButton;

	@FindBy(css = "textarea#_evovacation_WAR_EvoVacationportlet_commentContent")
	private WebElementFacade CommentField;
	
	@FindBy(css = "div#_evovacation_WAR_EvoVacationportlet_newVacationComment.requiredComment")
	private WebElementFacade RequiredCommentButton;
	
	
	@FindBy(css = "input#_evovacation_WAR_EvoVacationportlet_type_CF")
	private WebElementFacade VacationWithoutPaymentButton;

	@FindBy(name = "duration")
	private WebElementFacade DurationAndDomainField;

	@FindBy(name = "institution")
	private WebElementFacade InstitutionNameField;

	@FindBy(css = "input#_evovacation_WAR_EvoVacationportlet_type_CM")
	private WebElementFacade SickLeaveButton;

	@FindBy(css = "input#_evovacation_WAR_EvoVacationportlet_type_CS")
	private WebElementFacade SpecialVacationButton;

	@FindBy(css = " select#_evovacation_WAR_EvoVacationportlet_specialReason")
	private WebElementFacade SpecialVacationMenuButton;

	@FindBy(css = "select[name='specialReason']")
	private WebElementFacade specialVacationMarriage;

	@FindBy(css = "select[name='specialReason']")
	private WebElementFacade specialVacationChildBirth;
	
	@FindBy(css = "select[name='specialReason']")
	private WebElementFacade specialVacationFuneral;
	
	@FindBy(css = "select[name='specialReason']")
	private WebElementFacade specialVacationOther;

	@FindBy(css = "input#_evovacation_WAR_EvoVacationportlet_type_ML")
	private WebElementFacade maternityLeaveButton;
	
	@FindBy(css = "select[name='maternityLeave']")
	private WebElementFacade maternityLeavePrenatal;
	
	@FindBy(css = "select[name='maternityLeave']")
	private WebElementFacade maternityLeaveConcediu;

	public void SelectNewVacationRequest() {
		NewVacationRequest.click();
	}

	public void selectStartDate() {
		StartDate.click();
	}

	public void selectStartDate12() {
		StartDate12.click();
	}

	public void selectSaveButton() {
		SaveButton.click();
	}

	public void selectEndDate() {
		StartDate.click();
	}

	public void selectEndDate25() {
		EndDate25.click();
	}

	public void selectCommentButton() {
		CommentButton.click();
	}
	
	public void selectRequiredCommentButton() {
		RequiredCommentButton.click();
	}

	public void selectCommentField() {
		CommentField.click();
	}

	public void selectVacationWithoutPaymentButton() {
		VacationWithoutPaymentButton.click();
	}

	public void selectDurationAndDomainField() {
		DurationAndDomainField.click();
	}

	public void selectInstitutionNameField() {
		InstitutionNameField.click();
	}

	public void selectSickLeaveButton() {
		SickLeaveButton.click();
	}

	public void selectSpecialVacationButton() {
		element(SpecialVacationButton).waitUntilVisible();
		SpecialVacationButton.click();
	}
	
	public void selectSpecialVacationMarriage(String value) {
		element(specialVacationMarriage).selectByValue(value);
		waitABit(1000);
	}
	
	public void selectSpecialVacationChildBirth(String value) {
		element(specialVacationChildBirth).selectByValue(value);
		waitABit(1000);
	}
	
	public void selectSpecialVacationFuneral(String value) {
		element(specialVacationFuneral).selectByValue(value);
		waitABit(1000);
	}
	
	public void selectSpecialVacationOther(String value) {
		element(specialVacationOther).selectByValue(value);
		waitABit(1000);
	}
	
	public void selectMaternityLeaveButton() {
		element(maternityLeaveButton).waitUntilVisible();
		maternityLeaveButton.click();
	}
	
	public void selectMaternityLeavePrenatal(String value) {
		element(maternityLeavePrenatal).selectByValue(value);
		waitABit(1000);
	}
	
	public void selectMaternityLeaveConcediu(String value) {
		element(maternityLeaveConcediu).selectByValue(value);
		waitABit(1000);
	}
	
}
