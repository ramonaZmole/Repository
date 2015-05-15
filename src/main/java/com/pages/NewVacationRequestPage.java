package com.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;

import java.util.List;

import static ch.lambdaj.Lambda.convert;


public class NewVacationRequestPage extends PageObject{

	
	@FindBy(css="a[href='http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&amp']")
    private WebElementFacade NewVacationRequest;

    @FindBy(css="input#_evovacation_WAR_EvoVacationportlet_startDate")
    private WebElementFacade StartDate;
	
    @FindBy(css="table[class='dp_daypicker'] tbody tr:nth-child(4) td:nth-child(3)")
    private WebElementFacade StartDate12;
    
    @FindBy(css="input#_evovacation_WAR_EvoVacationportlet_saveButton")
    private WebElementFacade SaveButton;
    
    @FindBy(css="input#_evovacation_WAR_EvoVacationportlet_endDate")
    private WebElementFacade EndDate;
    
    @FindBy(css="table[class='dp_daypicker'] tbody tr:nth-child(6) td:nth-child(2)")
    private WebElementFacade EndDate25;
    
    @FindBy(css="input#_evovacation_WAR_EvoVacationportlet_newVacationComment")
    private WebElementFacade CommentField;
    
        
	public void SelectNewVacationRequest(){
		NewVacationRequest.click();
	    }
	
	public void selectStartDate(){
		StartDate.click();
	    }
	
	public void selectStartDate12(){
		StartDate12.click();
	}
	
	public void selectSaveButton(){
		SaveButton.click();
	}
	
	public void selectEndDate(){
		StartDate.click();
	    }
	
	public void selectEndDate25(){
		EndDate25.click();
	    }
	
	public void selectSComment(){
		StartDate.click();
	    }
}
