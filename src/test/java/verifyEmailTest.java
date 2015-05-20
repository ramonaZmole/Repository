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
import com.tools.EmailCheck;

@RunWith(ThucydidesRunner.class)
public class verifyEmailTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@Steps
	public loginSteps endUser;

	@Steps
	public newVacationRequestSteps newVacationRequestSteps;

	@Steps
	public LeftMenuSteps leftMenu;

	public String user = "ramonazmole1";
	public String pass = "ramona1";
	
	public EmailCheck email;

	@Test
	public void emailCheck() {
		/*endUser.is_the_home_page();
		endUser.login_With(user, pass);
		endUser.selectVacation();
		leftMenu.selectNewVacation();
		newVacationRequestSteps.selectStartDate();
		newVacationRequestSteps.selectEndDate();
		newVacationRequestSteps.selectSickLeaveButton();
		newVacationRequestSteps.selectSaveButton();*/
		
		String host = "mail.evozon.com";// change accordingly
		String mailStoreType = "imap";
		String username = "ramona.zmole@evozon.com";// change accordingly
		String password = "Ramona10.";// change accordingly

		email.check(host, mailStoreType, username, password);
	}
}
