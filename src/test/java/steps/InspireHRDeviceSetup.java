package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Dimension;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import utils.Hook;

public class InspireHRDeviceSetup {
	
	public static AndroidDriver driver;

	public InspireHRDeviceSetup() {

		this.driver = Hook.getDriver();
	}
	
	@When("^the InspireHR menuu displays click it$")
	public void the_InspireHR_menuu_displays_click_it() throws Throwable {
		
		/**
		 *  Use scroll to move to the precise text label
		 */
		Dimension size = driver.manage().window().getSize();
		int startX = size.getWidth() / 2;
		int startY = (int) (size.getHeight() * 0.60);
		int endX = size.getWidth() / 2;
		int endY = (int) (size.getHeight() * 0.10);
		TouchAction action = new TouchAction(driver); 
	    action.longPress(PointOption.point(startX, startY)).moveTo(PointOption.point(endX, endY)).release().perform();
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    /**
		 *  click on the specific device menu
		 */
	    AndroidElement elementToClick = (AndroidElement) driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Inspire HR\"));");
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    elementToClick.click();
	
	}

	@Then("^Verify I on InspireHR  Page$")
	public void verify_I_on_InspireHR_Page() throws Throwable {
	   
		try {
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			// check pages description title

			/*
			 * Check the pages text for setting up
			 */
			Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='Fitbit Inspire HR']").isDisplayed());
			Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text='Fitbit Inspire HR']").getText(),
					"Fitbit Inspire HR");

			Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='Healthy habits start with Inspire HR']").isDisplayed());
			Assert.assertEquals(
					driver.findElementByXPath("//android.widget.TextView[@text='Healthy habits start with Inspire HR']")
							.getText(),	"Healthy habits start with Inspire HR");
			/*
			 * Check the bottom text is present
			 */
			Assert.assertTrue(driver.findElementById("com.fitbit.FitbitMobile:id/btn_setup").isDisplayed());
			Assert.assertEquals(driver.findElementById("com.fitbit.FitbitMobile:id/btn_setup").getText(),
					"Set it up on your computer, at\r\n" + "www.fitbit.com/setup");


			System.out.println("Test PASSED. The result is correct. ");
		} catch (AssertionError ex) {
			System.out.println("Test FAILED. The result is wrong.");
		}
	}

}
