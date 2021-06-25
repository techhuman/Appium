package com.appium.tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import com.appium.android.screens.HomeScreen;
import com.appium.android.screens.LanguagesScreen;
import com.appium.android.screens.MovieScreen;
import com.appium.android.screens.OnboardingScreen;
import com.appium.android.screens.SearchMovieScreen;
import com.appium.logger.Log;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTests {

	AppiumDriver<MobileElement> driver;
	private final String CONFIG_FILE_PATH = "config.properties";
	protected File file = new File("");
	// protected File file2 = new File("");
	protected FileInputStream configFis, platformFis;
	Properties configProp = new Properties();
	Properties platformProp = new Properties();
	Properties iOSProp = new Properties();
	Properties configFile;

	@BeforeClass
	public void setUp() throws Exception {
		propertiesFileLoad();
		String devicetype = configProp.getProperty("platform");
		propertiesFileLoad(devicetype);
		System.out.println("entered setup");
		Log.info("--------------------------------------");

		if (devicetype.equalsIgnoreCase("android")) {
			String buildPath = choosebuild(devicetype);
			androidDriver(buildPath);
			Log.info("Android driver created");
		}

		else if (devicetype.equalsIgnoreCase("iOS")) {
			String buildPath = choosebuild(devicetype);
			iOSDriver(buildPath);
			Log.info("iOS driver created");
		}

	}

	/*
	 * @BeforeMethod public void instantiateHelpers(){ String devicetype =
	 * configProp.getProperty("platform"); if
	 * (devicetype.equalsIgnoreCase("android")){ BaseCoreLogic= new
	 * AndroidCoreLogic(driver); } else if (devicetype.equalsIgnoreCase("iOS")){
	 * BaseCoreLogic = new IOSCoreLogic(driver); } }
	 */

	private void propertiesFileLoad() throws Exception {

		try {
			configFis = new FileInputStream(file.getAbsolutePath() + "/" + CONFIG_FILE_PATH);
			configProp.load(configFis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void propertiesFileLoad(String platform) throws Exception {

		try {
			platformFis = new FileInputStream(file.getAbsolutePath() + "/" + platform + "_" + CONFIG_FILE_PATH);
			platformProp.load(platformFis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void testcases() throws Exception {

		OnboardingScreen osa = new OnboardingScreen(driver);

		LanguagesScreen ls = new LanguagesScreen(driver);
		MovieScreen ms = new MovieScreen(driver);
		SearchMovieScreen sms = new SearchMovieScreen(driver);
		HomeScreen hs = new HomeScreen(driver);

		osa.clickChooseLang(driver);
		ls.selectLanguages(driver);
		hs.searchMovie(driver);
		sms.clickMovie(driver);
		ms.playMovie(driver);

	}

	@AfterClass
	public void teardown() {
		// close the app
		driver.quit();
	}

	public String choosebuild(String invokeDriver) {
		String appPath = null;
		if (invokeDriver.equals("android")) {
			appPath = platformProp.getProperty("AndroidAppPath");
			return appPath;
		} else if (invokeDriver.equals("iOS")) {
			appPath = platformProp.getProperty("iOSAppPath");
			return appPath;
		}

		return appPath;
	}

	public synchronized void androidDriver(String buildPath) throws MalformedURLException {
		// File app = new File(buildPath);
		Log.info("....Android Capabilities....");
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		// caps.setCapability("udid", "507154528");
		caps.setCapability("udid", "df908c"); // Give Device ID of your mobile phone
		// connected via USB
		caps.setCapability("platformName", "Android");
		// caps.setCapability("platformVersion", "6.0.0");
		caps.setCapability("platformVersion", "8.1.0");
		caps.setCapability("appPackage", "in.startv.hotstar");
		caps.setCapability("appActivity", "in.startv.hotstar.rocky.launch.splash.SplashActivity");
		// caps.setCapability("appActivity",
		// "in.startv.hotstar.rocky.onboarding.OnBoardingActivity");
		caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + buildPath);
		caps.setCapability("noReset", "true");
		caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");

		// Instantiate Appium Driver
		driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void iOSDriver(String buildPath) throws MalformedURLException {
		File app = new File(buildPath);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "iOS");
		capabilities.setCapability("platformVersion", "8.2");
		capabilities.setCapability("appiumVersion", "1.3.7");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 5s");
		capabilities.setCapability("app", app.getAbsolutePath());
		driver = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

	}

}
