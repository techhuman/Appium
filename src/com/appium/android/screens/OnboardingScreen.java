package com.appium.android.screens;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import com.appium.utils.*;

public class OnboardingScreen extends CommonAppiumTest {

	public OnboardingScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}

	public MobileElement clicklang = (MobileElement) driver.findElement(By.id("in.startv.hotstar:id/ic_next"));

	public void clickChooseLang(AppiumDriver<MobileElement> driver) {
		clicklang.click();

	}

}

//public By chooseLanguages = By.id("in.startv.hotstar:id/ic_next");
// public By contentID = By.id("android:id/content");
/*
 * public void clickContent() { //
 * onboardingscreen.waitForVisibility(onboardingscreen.chooseLanguages); //
 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
 * 
 * chooseLangButton.click();
 * 
 * }
 */

/*
 * MobileElement el2 = (MobileElement) driver.findElementByXPath(
 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.ImageView"
 * ); el2.click(); MobileElement el3 = (MobileElement)
 * driver.findElementByXPath(
 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.FrameLayout[2]/android.widget.ImageView"
 * ); el3.click(); MobileElement el4 = (MobileElement)
 * driver.findElementByXPath(
 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.support.v7.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.FrameLayout[2]/android.widget.ImageView"
 * ); el4.click(); MobileElement el5 = (MobileElement)
 * driver.findElementById("in.startv.hotstar:id/button_click_feedback");
 * el5.click(); MobileElement el6 = (MobileElement)
 * driver.findElementByAccessibilityId("Search"); el6.click(); MobileElement el7
 * = (MobileElement) driver.findElementById("in.startv.hotstar:id/search_text");
 * el7.sendKeys("Babu"); try { Thread.sleep(3000); } catch (InterruptedException
 * e) { // TODO Auto-generated catch block e.printStackTrace(); } MobileElement
 * el8 = (MobileElement) driver.findElementByXPath(
 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout[1]"
 * ); el8.click(); try { Thread.sleep(1000); } catch (InterruptedException e) {
 * // TODO Auto-generated catch block e.printStackTrace(); } MobileElement el9 =
 * (MobileElement) driver.findElementById("in.startv.hotstar:id/play");
 * el9.click();
 */