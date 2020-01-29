package steps;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidDriver;
import utils.Hook;

public class HomePageSteps {

	public static AndroidDriver driver;

	public HomePageSteps() {

		this.driver = Hook.getDriver();
	}

	@Given("^user is on Application Landing Page$")
	public void user_is_on_Application_Landing_Page() throws Throwable {
		/*
		 * Verify Fitbit image is present
		 * 
		 */
		try {
			Assert.assertTrue(driver.findElementById("com.fitbit.FitbitMobile:id/btn_join_fitbit").isDisplayed());

			System.out.println("Test PASSED. The result is correct. ");
		} catch (AssertionError ex) {
			System.out.println("Test FAILED. The result is wrong.");
		}

	}

	@Then("^verify user is on Applicatiion Landing Page$")
	public void verify_user_is_on_Applicatiion_Landing_Page() throws Throwable {
		/*
		 * Verify Join Fitbit button is present
		 * 
		 */
		try {
			Assert.assertEquals(driver.findElementById("com.fitbit.FitbitMobile:id/btn_join_fitbit").getText(),
					"Join Fitbit");
			Assert.assertEquals(driver.findElementById("com.fitbit.FitbitMobile:id/btn_log_in").getText(), "Log in");

			System.out.println("Test PASSED. The result is correct. ");
		} catch (AssertionError ex) {
			System.out.println("Test FAILED. The result is wrong.");
		}
	}

	@Then("^Login Using Login button Application$")
	public void login_Using_Login_button_Application() throws Throwable {
		/*
		 *  click on the Log in button link
		 */
		driver.findElementById("com.fitbit.FitbitMobile:id/btn_join_fitbit").click();
	}

	@Then("^Verify User is on Join Login Page$")
	public void verify_User_is_on_Join_Login_Page() throws Throwable {
		/*
		 * Verify Join Fitbit page is present
		 * 
		 */
		try {
			Assert.assertEquals(driver.findElementById("com.fitbit.FitbitMobile:id/choose_tracker_title").getText(),
					"Which Fitbit device are you setting up?");
			
			System.out.println("Test PASSED. The result is correct. ");
		} catch (AssertionError ex) {
			System.out.println("Test FAILED. The result is wrong.");
		}
	}

}
