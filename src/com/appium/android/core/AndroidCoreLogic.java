package com.appium.android.core;

import org.openqa.selenium.WebDriver;

import com.appium.android.screens.OnboardingScreen;
import com.appium.base.core.BaseCoreLogic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


/**
 * contains all methods of android app
 */
public class AndroidCoreLogic extends BaseCoreLogic {
    OnboardingScreen onboardingScreen;


    public AndroidCoreLogic(AppiumDriver<MobileElement> driver) {
    	onboardingScreen = new OnboardingScreen(driver);
    }

   
    
    

	@Override
	public void verifyEndTOEnd() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}




}

