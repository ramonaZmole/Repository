package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.4.88:9090/vacation")
public class myRequestsPage extends PageObject {

	@FindBy(css = "[value='Apply']")
	private WebElementFacade apply;

	@FindBy(css = "input[value='APPROVED'][type='checkbox']")
	private WebElementFacade approved;

	@FindBy(css = "input[type='checkbox'][value='SPECIAL_VACATION']")
	private WebElementFacade specialVacation;

	@FindBy(css = "input[type='checkbox'][value='PENDING']")
	private WebElementFacade pending;

	public void applyButton() {
		apply.click();
	}

	public void selectAproved() {
		approved.click();
	}

	public void selectSpecialVacation() {
		specialVacation.click();
	}

	public void selectPending() {
		pending.click();
	}
}
