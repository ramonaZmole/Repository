package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LeftMenuPage;
import com.pages.myRequestsPage;

public class myRequestsSteps extends ScenarioSteps{
LeftMenuPage leftMenu;
myRequestsPage myRequests;

@Step
public void selectMyRequests(){
	leftMenu.selectMyRequests();
}

@Step
public void selectApproved(){
	myRequests.selectAproved();
}

@Step
public void selectApplyButton(){
	myRequests.applyButton();
}


}