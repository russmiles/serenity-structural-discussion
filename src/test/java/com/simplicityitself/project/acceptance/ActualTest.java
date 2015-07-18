package com.simplicityitself.project.acceptance;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import com.simplicityitself.project.acceptance.pageobjects.InboxPage;
import com.simplicityitself.project.acceptance.pageobjects.LoginPage;
import com.simplicityitself.project.acceptance.steps.ActualTestSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class ActualTest {

    @Managed
    private WebDriver driver;

    private LoginPage loginPage;

    private InboxPage inboxPage;

    @Steps
    ActualTestSteps actualTestSteps;

    @Test
    public void someBDDClearGoalStated() {
        // GIVEN
        actualTestSteps.userHasLoggedIn();
        actualTestSteps.userHasClaimedATask();

        // WHEN
        actualTestSteps.finalizeProfile();

        //THEN
        actualTestSteps.validateRatingIsDisplayed();
    }
    
    @Test
    public void findSomeElemementsOnPage()
    {
    	
    		actualTestSteps.findSomeElements();
			
		
    	
    }
    
    @Test 
    public void failToFindSomeElemementsOnPage()
    {
    	try {
    		System.out.println("**** Should get exception ****");
    		actualTestSteps.failtoFindSomeElements();
			
		
    	} catch (Throwable e) {
			
			assertThat(e.getMessage(), is(equalTo("Illegal State Exception message")));
			System.out.println("**** Should get here ****" + e.getMessage());
			
		}
    	
    }
    
    @Test(expected=IllegalStateException.class) 
    public void failToFindSomeMoreElemementsOnPage()
    {
    	
    		System.out.println("**** Should get exception ****");
    		actualTestSteps.failtoFindSomeElements();
			
		
    	
    	
    }
    
}
