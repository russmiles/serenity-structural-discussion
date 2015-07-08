package com.simplicityitself.project.acceptance;

import com.simplicityitself.project.acceptance.pageobjects.InboxPage;
import com.simplicityitself.project.acceptance.pageobjects.LoginPage;
import com.simplicityitself.project.acceptance.steps.ActualTestSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
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
}
