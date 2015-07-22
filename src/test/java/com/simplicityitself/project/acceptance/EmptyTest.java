package com.simplicityitself.project.acceptance;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;

import org.hamcrest.Matcher;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.simplicityitself.project.acceptance.steps.EmptyQuestion;

@RunWith(SerenityRunner.class)
public class EmptyTest {
	
	@Steps
	EmptyQuestion question;
	@Steps Actor actor;
	
	@Test
	@Title("Try out some empty steps")
	public void someEmptySteps ()
	{
		then(actor.seesThat(question), Is.is("Hello"));
	}

	private <T> void then(T actual, Matcher<T> matcher) {
		Assert.assertThat(actual, matcher);
	}

}
