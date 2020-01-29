package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.Hook;

public class VersaDevicePageSetup {

	public AndroidDriver driver;

	public VersaDevicePageSetup() {

		this.driver = Hook.getDriver();
	}

	
	@When("^I click on Versa menu label$")
	public void i_click_on_Versa_menu_label() throws Throwable {
		/**
		 * click on the specific device menu
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Versa']").click();
	}

	@Then("^Verify I on Versa Page is displayed$")
	public void verify_I_on_Versa_Page_is_displayed() throws Throwable {

		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		try {
			
	// check pages description title
			
			/*
			 * Check the pages text
			 */	
			Assert.assertTrue(driver.findElementById("com.fitbit.FitbitMobile:id/txt_description_title").isDisplayed());
			Assert.assertEquals(
					driver.findElementByXPath("//android.widget.TextView[@text='Fitbit Versa']").getText(),
					"Fitbit Versa");
			
			Assert.assertTrue(driver.findElementById("com.fitbit.FitbitMobile:id/txt_description_body").isDisplayed());
			Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text='Live your best life with Versa.']").getText(),
					"Live your best life with Versa.");
			
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
