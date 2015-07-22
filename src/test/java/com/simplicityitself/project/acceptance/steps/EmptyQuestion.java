package com.simplicityitself.project.acceptance.steps;

import com.simplicityitself.project.acceptance.Actor;

import net.thucydides.core.annotations.Step;

public class EmptyQuestion implements Question<String> {
	
	 	@Step("Given the user performed a step")
	    public String answeredBy(Actor actor) {
		 return "Hello";
	 }

//		private void someHackyMethod() {}

}
