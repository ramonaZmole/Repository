package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LeftMenuPage;
import com.pages.myFreeDaysPage;
import com.pages.myRequestsPage;

public class myFreeDaysSteps {
		LeftMenuPage leftMenu;
		myFreeDaysPage myFreeDays;
		
		@Step
		public String totalAvailableFreeDays(){
			return myFreeDays.checkAvailableFreeDays();
		}
		
		@Step
		public void checkIfFreeDaysAreDifferent(int oldValue, int newValue){
			myFreeDays.checkIfFreeDaysAreDifferent(oldValue, newValue);
		}
}
