package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Dimension;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import utils.Hook;

public class NoFitBitYetPageSetup {
	public static AndroidDriver driver;

	public NoFitBitYetPageSetup() {

		this.driver = Hook.getDriver();
	}

	@When("^the NoDeviceYest menu displays click it$")
	public void the_NoDeviceYest_menu_displays_click_it() throws Throwable {

		/**
		 * Use scroll to move to the precise text label
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
		 * click on the specific device menu
		 */
		AndroidElement elementToClick = (AndroidElement) driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"No Fitbit Yet?\"));");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		/**
		 * Verify text on current menu
		 * 
		 */
		try {
			Assert.assertTrue(
					driver.findElementByXPath("//android.widget.TextView[@text='No Fitbit Yet?']").isDisplayed());
			Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text='No Fitbit Yet?']").getText(),
					"No Fitbit Yet?");

			System.out.println("Test PASSED. The result is correct. ");
		} catch (AssertionError ex) {
			System.out.println("Test FAILED. The result is wrong.");

		}
		elementToClick.click();
	}

	@Then("^Verify Lets Get Started Page$")
	public void verify_Lets_Get_Started_Page() throws Throwable {

	}

}
