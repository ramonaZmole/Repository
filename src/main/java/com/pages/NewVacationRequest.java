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


public class NewVacationRequest {

	
	@FindBy(css="a[href='http://172.22.4.88:9090/vacation?p_p_id=evovacation_WAR_EvoVacationportlet&amp;p_p_lifecycle=0&amp;p_p_state=normal&amp;p_p_mode=view&amp;p_p_col_id=column-1&amp;p_p_col_count=1&amp;_evovacation_WAR_EvoVacationportlet_backURL=%2Fvacation%3Fp_p_id%3Devovacation_WAR_EvoVacationportlet%26p_p_lifecycle%3D0%26p_p_state%3Dnormal%26p_p_mode%3Dview%26p_p_col_id%3Dcolumn-1%26p_p_col_count%3D1%26_evovacation_WAR_EvoVacationportlet_backURL%3D%252Fvacation%26_evovacation_WAR_EvoVacationportlet_menuItem%3Dnew-request&amp;_evovacation_WAR_EvoVacationportlet_menuItem=new-request"><i class="icon-asterisk"></i>New Vacation Request]")
    private WebElementFacade userName;
}
