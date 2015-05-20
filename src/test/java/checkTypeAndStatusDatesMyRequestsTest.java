

import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.loginSteps;
import com.steps.myRequestsSteps;

@RunWith(ThucydidesRunner.class)


public class checkTypeAndStatusDatesMyRequestsTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	//public Pages pages;
	
	@Steps
	public loginSteps login;
	
	@Steps
	public myRequestsSteps myRequests;
	
	@Issue("#WIKI-1")
	@Test
	public void check_specialVacation_dates_from_myRequests(){
		login.is_the_home_page();
		login.login_With("RamonaZmole1", "ramona1");
		login.selectVacation();
		myRequests.selectMyRequests();
		myRequests.selectSpecialVacation();
		myRequests.selectPending();
		myRequests.selectApplyButton();
		myRequests.checkIfTypeIsPresent("Special Vacation");
		myRequests.checkIfStatusIsPresent("Pending");
		
	}
	
}
