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


public class NewVacationRequestPage {

	
	@FindBy(css="a[href='http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&amp']")
    private WebElementFacade NewVacationRequest;

//	@FindBy(css="a[href='http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&amp']")
 //   private WebElementFacade NewVacationRequest;
	
	public void SelectNewVacationRequest(){
		NewVacationRequest.click();
	    }
}
