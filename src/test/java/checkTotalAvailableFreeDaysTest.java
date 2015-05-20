
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.LeftMenuPage;
import com.steps.loginSteps;
import com.steps.myFreeDaysSteps;
import com.steps.myRequestsSteps;

@RunWith(ThucydidesRunner.class)
public class checkTotalAvailableFreeDaysTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public loginSteps endUser;

	@Steps
	public myRequestsSteps myRequests;

	@Steps
	public myFreeDaysSteps myFreeDays;

	@Steps
	public LeftMenuPage leftMenu;

	@Issue("#WIKI-1")
	@Test
	public void checkAvailableFreeDays() {
		endUser.is_the_home_page();
		endUser.login_With("ramonazmole1", "ramona1");
		endUser.selectVacation();
		leftMenu.selectMyFreeDays();
		myFreeDays.totalAvailableFreeDays();
		String oldValue = myFreeDays.totalAvailableFreeDays();
		System.out.println("Vechea valoare: " + oldValue);
		myRequests.selectMyRequests();
		myRequests.selectPending();
		myRequests.selectApplyButton();
		myRequests.selectStatus(0);
		myRequests.selectWithdraw();
		leftMenu.selectMyFreeDays();
		String newValue = myFreeDays.totalAvailableFreeDays();
		System.out.println("Noua valoare: " + newValue);
		int oldVal = Integer.parseInt(oldValue);
		int newVal = Integer.parseInt(newValue);
		myFreeDays.checkIfFreeDaysAreDifferent(oldVal, newVal);
	}
}
