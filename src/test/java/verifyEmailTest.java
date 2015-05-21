import java.io.IOException;

import javax.mail.MessagingException;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.CalendarPage;
import com.steps.EmailVerifySteps;
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

	@Steps
	public EmailVerifySteps emailSteps;

	public String user = "ramonazmole1";
	public String pass = "ramona1";
	public String startDate="/1/2015";
	public String endDate="6/2/2015";
	public String approver="Flaviu Moldovan";
	public String firstName="Ramona";
			
	public EmailCheck email;

	@Test
	public void emailCheck() throws MessagingException, IOException {
		
		  endUser.is_the_home_page(); 
		  endUser.login_With(user, pass);
		  endUser.selectVacation(); 
		  leftMenu.selectNewVacation();
		  newVacationRequestSteps.setStartDate(8,5,2015); 
		  newVacationRequestSteps.setEndDate(8, 5,2015); 
		  newVacationRequestSteps.selectVacationWithoutPaymentButton();
		  newVacationRequestSteps.selectSaveButton();
		 
		String host = "mail.evozon.com";// change accordingly
		String mailStoreType = "imap";
		String username = "ramona.zmole@evozon.com";// change accordingly
		String password = "Ramona10.";// change accordingly
		//email.check(host, mailStoreType, username, password);
		emailSteps.checkContent(firstName, startDate, endDate, approver, host, mailStoreType, username, password); //check the content of the email
	}
}
