package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://172.22.4.88:9090/vacation")

public class myFreeDaysPage extends PageObject{

	@FindBy(css=" tr[class='section-result'] td:nth-child(2)")
	private WebElementFacade freeDays;
	
	public String checkAvailableFreeDays(){
	return	freeDays.getText();
	} 
	
	public void checkIfFreeDaysAreDifferent(int oldValue, int newValue){
		boolean check=false;
		if(newValue>oldValue){
			check=true;
		}
		Assert.assertTrue("New value is not bigger than old value.", check);
	}
}
