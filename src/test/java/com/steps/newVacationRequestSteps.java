package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LeftMenuPage;
import com.pages.NewVacationRequestPage;

public class newVacationRequestSteps extends ScenarioSteps{
LeftMenuPage leftMenu;
NewVacationRequestPage NewVacationRequest;

@Step
public void selectNewVacationRequest(){
	leftMenu.selectNewVacationRequest();
}

@Step
public void selectStartDateButton(){
	NewVacationRequest.selectStartDateButton();
}

}
