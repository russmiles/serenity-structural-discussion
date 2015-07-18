package com.simplicityitself.project.acceptance.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.At;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
@At(urls={"#HOST/"})
public class LoginPage extends PageObject {

    public void maximiseScreen() {

    }

    public void enterUsernameAndSignIn() {

    }
    
    public void find_elements (String elementId)
    {
    	if (elementId.equals("validElement"))
    			System.out.println("Found Elemment");
    	else
    		
    	throw new IllegalStateException("Illegal State Exception message");
    }
}
