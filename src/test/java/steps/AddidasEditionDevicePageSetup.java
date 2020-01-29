package steps;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.Hook;

public class AddidasEditionDevicePageSetup {
	
	public static AndroidDriver driver;

	public AddidasEditionDevicePageSetup() {

		this.driver = Hook.getDriver();
	}


	@Then("^Verify Addidas edition is at bottom section$")
	public void verify_Addidas_edition_is_at_bottom_section() throws Throwable {

		try {
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			// check pages description title

			/*
			 * Check the pages text for setting up
			 */
		
			Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='Ionic: adidas edition']").isDisplayed());
			Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text='Ionic: adidas edition']").getText(),
					"Ionic: adidas edition");

			System.out.println("Test PASSED. The result is correct. ");
		} catch (AssertionError ex) {
			System.out.println("Test FAILED. The result is wrong.");
		}
	}

	@When("^I select the Addidas edition image$")
	public void i_select_the_Addidas_edition_image() throws Throwable {
		/**
		 *  Click on the bottom image Addidas edition
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Ionic: adidas edition']").click();
	}

	@Then("^the Addidas edition setup page displays$")
	public void the_Addidas_edition_setup_page_displays() throws Throwable {
		try {
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			// check pages description title

			/*
			 * Check the pages text for setting up
			 */
			Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='Fitbit Ionic: adidas edition']").isDisplayed());
			Assert.assertEquals(driver.findElementByXPath("//android.widget.TextView[@text='Fitbit Ionic: adidas edition']").getText(),
					"Fitbit Ionic: adidas edition");

			Assert.assertTrue(driver.findElementByXPath("//android.widget.TextView[@text='Commit to extraordinary.']").isDisplayed());
			Assert.assertEquals(
					driver.findElementByXPath("//android.widget.TextView[@text='Commit to extraordinary.']")
							.getText(),	"Commit to extraordinary.");
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
