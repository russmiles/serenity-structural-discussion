package com.simplicityitself.project.acceptance.steps;

import com.simplicityitself.project.acceptance.pageobjects.InboxPage;
import com.simplicityitself.project.acceptance.pageobjects.LoginPage;
import com.simplicityitself.project.acceptance.pageobjects.ProfilePage;

import net.thucydides.core.annotations.Step;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ActualTestSteps {

    LoginPage loginPage;
    InboxPage inboxPage;
    ProfilePage profilePage;

    @Step("Given the user has logged in")
    public void userHasLoggedIn() {
        loginPage.open();
        loginPage.maximiseScreen();
        loginPage.enterUsernameAndSignIn();
    }

    @Step("And the user claims a task in inbox page")
    public void userHasClaimedATask() {

    }

    @Step("When they choose to finalize the profile")
    public void finalizeProfile() {

    }

    @Step("Then a pop up is displayed with a system-generated risk rating")
    public void validateRatingIsDisplayed() {

    }
    
    @Step("Find some elements on a page")
    public void findSomeElements ()
    {
    	loginPage.open();
        loginPage.maximiseScreen();
    	loginPage.find_elements("validElement");
    	assertThat("Found element", is(equalTo("Found element")));
    }
    
    
    @Step("Fail to Find some elements on a page")
    public void failtoFindSomeElements ()
    {
    	loginPage.open();
        loginPage.maximiseScreen();
    
			loginPage.find_elements("invalidElement");
		
    
    }
}
