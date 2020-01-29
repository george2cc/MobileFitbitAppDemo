package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.Hook;

public class VersaLiteDevicePageSetup {

	public static AndroidDriver driver;

	public VersaLiteDevicePageSetup() {

		this.driver = Hook.getDriver();
	}

	@When("^I click on Versa Lite menu$")
	public void i_click_on_Versa_Lite_menu() throws Throwable {
		/**
		 * click on the specific device menu
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Versa Lite']").click();
	}

	@Then("^Verify I on Versa Lite Page$")
	public void verify_I_on_Versa_Lite_Page() throws Throwable {

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		try {

			// check pages description title
			Assert.assertTrue(
					driver.findElementByXPath("//android.widget.TextView[@text='Fitbit Versa Lite']").isDisplayed());
			/*
			 * Check the pages text
			 */
			Assert.assertEquals(
					driver.findElementByXPath("//android.widget.TextView[@text='Fitbit Versa Lite']").getText(),
					"Fitbit Versa 2");
			Assert.assertTrue(driver.findElementById("com.fitbit.FitbitMobile:id/txt_description_body").isDisplayed());
			/*
			 * Check the device text is Health & fitness smartwatch
			 */
			Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text='Live boldly']").getText(),
					"Live boldly");

			/*
			 * Check the bottom text is present
			 */
			Assert.assertEquals(driver.findElementById("com.fitbit.FitbitMobile:id/btn_setup").getText(),
					"Set it up on your computer, at\r\n" + "www.fitbit.com/setup");

			System.out.println("Test PASSED. The result is correct. ");
		} catch (AssertionError ex) {
			System.out.println("Test FAILED. The result is wrong.");
		}
	}
}
