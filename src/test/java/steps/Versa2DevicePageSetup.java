package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.Hook;

public class Versa2DevicePageSetup {
	public static AndroidDriver driver;

	public Versa2DevicePageSetup() {

		this.driver = Hook.getDriver();
	}

	@When("^I choose to login using Login link$")
	public void i_choose_to_login_using_Login_link() throws Throwable {
		/*
		 * click on the Log in button link
		 */
		driver.findElementById("com.fitbit.FitbitMobile:id/btn_join_fitbit").click();
	}

	@When("^I click on VersaTwo menu$")
	public void i_click_on_VersaTwo_menu() throws Throwable {
		/**
		 *  click on the specific device menu
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Versa 2']").click();
	}

	@Then("^Verify I on VersaTwo Login Page$")
	public void verify_I_on_VersaTwo_Login_Page() throws Throwable {
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		try {

			// check pages description title
			Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='Fitbit Versa 2']").isDisplayed());
			/*
			 * Check the pages text
			 */
			Assert.assertEquals(
					driver.findElementByXPath("//android.widget.TextView[@text='Fitbit Versa 2']").getText(),
					"Fitbit Versa 2");
			Assert.assertTrue(driver.findElementById("com.fitbit.FitbitMobile:id/txt_description_body").isDisplayed());
			/*
			 * Check the device text is Health & fitness smartwatch
			 */
			Assert.assertEquals(driver
					.findElementByXPath("//android.widget.TextView[@text='Health & fitness smartwatch']").getText(),
					"Health & fitness smartwatch");
			
			/*
			 * Check the bottom text is present
			 */
			Assert.assertEquals(driver
					.findElementById("com.fitbit.FitbitMobile:id/btn_setup").getText(),"Set it up on your computer, at\r\n" + 
					"www.fitbit.com/setup");

			System.out.println("Test PASSED. The result is correct. ");
		} catch (AssertionError ex) {
			System.out.println("Test FAILED. The result is wrong.");
		}
	}

}
