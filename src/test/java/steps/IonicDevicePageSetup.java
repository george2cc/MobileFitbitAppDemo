package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.Hook;

public class IonicDevicePageSetup {

	public static AndroidDriver driver;

	public IonicDevicePageSetup() {

		this.driver = Hook.getDriver();
	}

	@When("^I click on Ionic menu$")
	public void i_click_on_Ionic_menu() throws Throwable {

		/**
		 * click on the specific device menu
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Ionic']").click();
	}

	@Then("^Verify Ionic device is at top section$")
	public void verify_Ionic_device_is_at_top_section() throws Throwable {

		try {
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			// check pages description title

			/*
			 * Check the pages text for setting up
			 */
		
			Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='Ionic']").isDisplayed());
			Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text='Ionic']").getText(), "Ionic");

			System.out.println("Test PASSED. The result is correct. ");
		} catch (AssertionError ex) {
			System.out.println("Test FAILED. The result is wrong.");
		}
	}

	@When("^I select the Ionic image$")
	public void i_select_the_Ionic_image() throws Throwable {

		driver.findElementByXPath("//android.widget.TextView[@text='Ionic']").click();
	}

	@Then("^Verify the Ionic setup page displays$")
	public void Verify_the_Ionic_setup_page_displays() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			// check pages description title

			/*
			 * Check the pages text for setting up
			 */
			Assert.assertTrue(driver.findElementById("com.fitbit.FitbitMobile:id/txt_description_title").isDisplayed());
			Assert.assertEquals(driver.findElementById("com.fitbit.FitbitMobile:id/txt_description_title").getText(),
					"Fitbit Ionic");

			Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='The watch designed for your life.']").isDisplayed());
			Assert.assertEquals(
					driver.findElementByXPath("//android.widget.TextView[@text='The watch designed for your life.']")
							.getText(),	"The watch designed for your life.");
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
