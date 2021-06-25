package com.appium.ios.core;

import org.openqa.selenium.WebDriver;

//import com.appium.android.screens.OnboardingScreen;
import com.appium.base.core.BaseCoreLogic;
import com.appium.ios.screens.OnboardingScreen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


/**
 * contains all methods of android app
 */
public class IOSCoreLogic extends BaseCoreLogic {
    OnboardingScreen onboardingScreen;


    public IOSCoreLogic(AppiumDriver<MobileElement> driver) {
    	onboardingScreen = new OnboardingScreen();
    }

   
    
    

	@Override
	public void verifyEndTOEnd() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}




}

