

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
import com.steps.newVacationRequestSteps;
@RunWith(ThucydidesRunner.class)

public class NewVacationRequestTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

//    @ManagedPages(defaultUrl = "http://172.22.4.88:9090/login")
    public Pages pages;

    @Steps
    public loginSteps endUser;
    
        
    @Steps
    public newVacationRequestSteps newVacationRequestSteps;
    

    @Issue("#WIKI-1")
    @Test
    public void specialVacationRequest() {
        endUser.is_the_home_page();
		endUser.login_With("ramonazmole1", "ramona1");
		endUser.selectVacation();
		newVacationRequestSteps.selectNewVacationRequest();
		
		newVacationRequestSteps.selectStartDate();
	    newVacationRequestSteps.selectStartDate12();
		//newVacationRequestSteps.selectEndDate();
		//newVacationRequestSteps.selectEndDate25();
		
		
		/*newVacationRequestSteps.selectVacationWithoutPaymentButton();
		newVacationRequestSteps.selectDurationAndDomainField();
		newVacationRequestSteps.selectInstitutionNameField();
		newVacationRequestSteps.selectSickLeaveButton();
		
		newVacationRequestSteps.selectSpecialVacationButton();
		
		newVacationRequestSteps.selectSpecialVacationMarriage("MARRIAGE");
		newVacationRequestSteps.selectSpecialVacationChildBirth("CHILD_BIRTH");
		newVacationRequestSteps.selectSpecialVacationFuneral("FUNERAL");
		newVacationRequestSteps.selectSpecialVacationOther("OTHER");
		
		newVacationRequestSteps.selectRequiredCommentButton();
		newVacationRequestSteps.selectCommentField();
		
		newVacationRequestSteps.selectMaternityLeaveButton();
		newVacationRequestSteps.selectMaternityLeavePrenatal("MATERNITY_SICK_LEAVE");
		newVacationRequestSteps.selectMaternityLeaveConcediu("CIC");
		newVacationRequestSteps.selectDurationAndDomainField();
		newVacationRequestSteps.selectInstitutionNameField();
		newVacationRequestSteps.selectCommentButton();
		//newVacationRequestSteps.selectCommentField();*/
		
		newVacationRequestSteps.selectSaveButton();
    }
} 