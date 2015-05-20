

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.LeftMenuSteps;
import com.steps.loginSteps;
import com.steps.myRequestsSteps;
import com.steps.newVacationRequestSteps;

@RunWith(ThucydidesRunner.class)
public class checkPendingSickLeaveTest {
	
	@Managed(uniqueSession = true)
	
	public WebDriver webdriver;
	public Pages pages;

	@Steps
	public loginSteps endUser;

	@Steps
	public newVacationRequestSteps newVacationRequestSteps;
	
	@Steps
	public LeftMenuSteps leftMenu;
//	
	@Steps
	public myRequestsSteps myRequest;
	
	@Test
	public void checkPendingSickLeave() {
		endUser.is_the_home_page();
		endUser.login_With("ramonazmole1", "ramona1");
		endUser.selectVacation();
//		leftMenu.selectNewVacation();
//		newVacationRequestSteps.selectStartDate();
//		newVacationRequestSteps.selectEndDate();
//		newVacationRequestSteps.selectSickLeaveButton();
//		newVacationRequestSteps.selectSaveButton();
		leftMenu.selectMyRequests();
		myRequest.selectSickLeave();
		//myRequest.selectPending();
		myRequest.selectApplyButton();
		myRequest.printStatuses();
		myRequest.VerifyStatus("pending");
	
			}
}
