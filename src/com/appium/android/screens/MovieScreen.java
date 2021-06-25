package com.appium.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import com.appium.utils.*;

public class MovieScreen extends CommonAppiumTest {

	public MovieScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public MobileElement playMovie = (MobileElement) driver.findElementById("in.startv.hotstar:id/play");

	public void playMovie(AppiumDriver<MobileElement> driver) {
		playMovie.click();
	}

}
