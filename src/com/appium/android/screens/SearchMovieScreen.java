package com.appium.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import com.appium.utils.*;

public class SearchMovieScreen extends CommonAppiumTest {

	public SearchMovieScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public MobileElement clickMovie = (MobileElement) driver.findElementByXPath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout[1]");

	public void clickMovie(AppiumDriver<MobileElement> driver) {
		clickMovie.click();

	}

}
