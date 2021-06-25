package com.appium.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import com.appium.utils.*;

public class HomeScreen extends CommonAppiumTest {

	public HomeScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public MobileElement search = (MobileElement) driver.findElementByAccessibilityId("Search");

	MobileElement enterSearch = (MobileElement) driver.findElementById("in.startv.hotstar:id/search_text");

	public void searchMovie(AppiumDriver<MobileElement> driver) {

		search.click();
		enterSearch.sendKeys();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
