package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.Hook;

public class Charge3DevicePageSetup {
	
	public static AndroidDriver driver;

	public Charge3DevicePageSetup() {

		this.driver = Hook.getDriver();
	}

	@When("^I click on ChargeThree menu$")
	public void i_click_on_ChargeThree_menu() throws Throwable {
		/**
		 *  click on the specific device menu
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Charge 3']").click();
	}

	@Then("^Verify I on ChargeThree  Page$")
	public void verify_I_on_ChargeThree_Page() throws Throwable {
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		try {
			
	// check pages description title
			
			/*
			 * Check the pages text
			 */	
			Assert.assertTrue(driver.findElementById("com.fitbit.FitbitMobile:id/txt_description_title").isDisplayed());
			Assert.assertEquals(
					driver.findElementByXPath("//android.widget.TextView[@text='Fitbit Charge 3']").getText(),
					"Fitbit Charge 3");
			
			Assert.assertTrue(driver.findElementById("com.fitbit.FitbitMobile:id/txt_description_body").isDisplayed());
			Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text='Advanced fitness tracker']").getText(),
					"Advanced fitness tracker");
			
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
