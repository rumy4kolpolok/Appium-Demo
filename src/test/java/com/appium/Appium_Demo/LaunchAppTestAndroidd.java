package com.appium.Appium_Demo;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class LaunchAppTestAndroidd {

	//private static final String ImmutableMap = null;

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("clearSystemFiles", true);
		cap.setCapability("appium:automationName", "XCUITest"); 
		cap.setCapability("appium:platformName", "iOS");
		cap.setCapability("showXcodeLog", true);
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 8 TDC");
		cap.setCapability(MobileCapabilityType.UDID, "196ce764ceb6b605b3dcbb8b06d51a510929c087");
		//196ce764ceb6b605b3dcbb8b06d51a510929c087 - iPhone 8.
		cap.setCapability("platformVersion", "16.7");
		cap.setCapability(CapabilityType.BROWSER_NAME, "safari");
		
		AppiumDriver<MobileElement> driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	}

}
