package com.appium.android.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import com.appium.utils.*;

public class LanguagesScreen extends CommonAppiumTest {

	public LanguagesScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public MobileElement kannada = (MobileElement) driver.findElementByXPath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.ImageView");

	public MobileElement hindi = (MobileElement) driver.findElementByXPath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.widget.ImageView");

	public MobileElement english = (MobileElement) driver.findElementByXPath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout[2]/android.widget.ImageView");

	public MobileElement nextButton = (MobileElement) driver
			.findElementById("in.startv.hotstar:id/button_click_feedback");

	public void selectLanguages(AppiumDriver<MobileElement> driver) {
		kannada.click();
		hindi.click();
		english.click();
		nextButton.click();

	}

}
