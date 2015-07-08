package com.simplicityitself.project.acceptance.steps;

import com.simplicityitself.project.acceptance.pageobjects.InboxPage;
import com.simplicityitself.project.acceptance.pageobjects.LoginPage;
import com.simplicityitself.project.acceptance.pageobjects.ProfilePage;
import net.thucydides.core.annotations.Step;

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
}
