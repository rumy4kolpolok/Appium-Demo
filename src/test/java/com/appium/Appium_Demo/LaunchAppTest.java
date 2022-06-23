package com.appium.Appium_Demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class LaunchAppTest {

	//private static final String ImmutableMap = null;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "android");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "0A091FDD4009R3");
		//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		//cap.setCapability("chromeOptions", ImmutableMap.of("w3c", false));
		
		cap.setCapability("appPackage", "app.kismyo.vpn");
		cap.setCapability("appActivity", "app.kismyo.activity.SplashActivity");
		
		//cap.setCapability("chromeOptions", ImmutableMap.of());
		//cap.setCapability("automationName", "UIAutomator2");
		
		AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:5677/wd/hub"), cap);
		//driver.get("https://www.google.com");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//driver.findElement(By.id("com.google.android.calculator:id/digit_8"));
	}

}
