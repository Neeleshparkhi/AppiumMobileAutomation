package tests;

import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Baseclass {

	public AppiumDriver<MobileElement> driver;
	
	@BeforeTest
	public void setup()
	{
		
		try {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
//		cap.setCapability("deviceName","Moto G5 Plus");
//		cap.setCapability("udid","ZY2242V57T");
//		//cap.setCapability("platformName","Android");
//		cap.setCapability("platformVersion","8.1.0");
//		cap.setCapability(CapabilityType.BROWSER_NAME, "Android");
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Moto G5 Plus");
		cap.setCapability(MobileCapabilityType.UDID, "ZY2242V57T");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		
		driver = new AppiumDriver<MobileElement>(url,cap); //parent driver
		//driver = new AndroidDriver<MobileElement>(url,cap); //child driver Android
		//driver = new IOSDriver<MobileElement>(url,cap); //chile driver for IOS 
		
		}catch(Exception exp)
		{
			//System.out.println("Cause is: " + exp.getCause());
			//System.out.println("Message is :"+ exp.getMessage());
			exp.printStackTrace();
		}
	}
	
	@Test
	public void Browseropen()
	{
		System.out.println("Configuration is correct and browser started");
	}
	
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver.quit();
	}
	
	
}
