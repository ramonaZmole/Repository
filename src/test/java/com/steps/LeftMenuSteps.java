package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LeftMenuPage;

public class LeftMenuSteps extends ScenarioSteps{

	
	LeftMenuPage leftMenuPage;
	
	@Step
	public void selectMyRequests(){
		leftMenuPage.selectMyRequests();
	}
	
	@Step
	public void selectNewVacation(){
		leftMenuPage.selectNewVacation();
	}
}
