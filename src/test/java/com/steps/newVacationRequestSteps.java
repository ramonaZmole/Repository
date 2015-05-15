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
	leftMenu.selectNewVacation();
}

@Step
public void selectStartDate(){
	NewVacationRequest.selectStartDate();
	waitABit(3000);

}

@Step
public void selectStartDate12(){
	NewVacationRequest.selectStartDate12();
	waitABit(3000);
}	

@Step
public void selectEndDate(){
	NewVacationRequest.selectEndDate();
	waitABit(3000);
}

@Step
public void selectEndDate25(){
	NewVacationRequest.selectEndDate25();
	waitABit(3000);
}

@Step
public void selectSaveButton(){
	NewVacationRequest.selectSaveButton();
	waitABit(7000);
	}	


}