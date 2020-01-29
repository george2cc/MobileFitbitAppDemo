package utils;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Hook {
	private static AndroidDriver<AndroidElement> driver;
	private static WebDriverWait wait;
	
	@After
	public void tearDown() {
		
	//	driver.quit();
	}
	
	@Before()
	public void setUpAppium() throws MalformedURLException {
		// setting up desired capability
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android emulator");
		//caps.setCapability("browserName", "");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIautomator2");

		caps.setCapability("appPackage", "com.fitbit.FitbitMobile");
		caps.setCapability("appActivity", "com.fitbit.FirstActivity");
		caps.setCapability("noReset", false);
		caps.setCapability("autoAcceptAlerts", true);
		// capabilities.setCapability("fullReset", true);

		// initializing driver object
		driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		
		// initializing explicit wait object
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
	}
	
	public static AndroidDriver getDriver() {
		
		return driver;
		
	}
	

}
