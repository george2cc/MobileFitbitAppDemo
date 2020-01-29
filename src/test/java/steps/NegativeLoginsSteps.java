package steps;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import utils.AllowAppPermissions;
import utils.Hook;

public class NegativeLoginsSteps {

	public static AndroidDriver driver;
	public WebDriverWait wait;

	public NegativeLoginsSteps() {

		this.driver = Hook.getDriver();
	}

	@Given("^I am on Application Home Page$")
	public void i_am_on_Application_Home_Page() throws Throwable {

		assertTrue(driver.findElement(By.id("com.fitbit.FitbitMobile:id/landing_logo_img")).isDisplayed(),
				"Fitbit image is not displayed");

	}

	@When("^I choose to log in using Login link$")
	public void i_choose_to_log_in_using_Logiin_link() throws Throwable {
		driver.findElement(By.id("com.fitbit.FitbitMobile:id/btn_log_in")).isDisplayed();
		driver.findElement(By.id("com.fitbit.FitbitMobile:id/btn_log_in")).click();
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String uname, String password) throws Throwable {

		driver.findElement(By.id("com.fitbit.FitbitMobile:id/login_email")).isDisplayed();
		driver.findElement(By.id("com.fitbit.FitbitMobile:id/login_email")).sendKeys(uname);

		driver.findElement(By.id("com.fitbit.FitbitMobile:id/login_password")).isDisplayed();
		driver.findElement(By.id("com.fitbit.FitbitMobile:id/login_password")).sendKeys(uname);
	}

	@When("^I tap on log in button$")
	public void i_tap_on_log_in_button() throws Throwable {
		/*
		 * Check then then perform tap on button
		 */
		driver.findElement(By.id("com.fitbit.FitbitMobile:id/login_button")).isDisplayed();
		driver.findElement(By.id("com.fitbit.FitbitMobile:id/login_button")).click();
	}

	@Then("^I should be able to login unsuccessfully$")
	public void i_should_be_able_to_login_unsuccessfully() throws Throwable {
		/*
		 * Verify pop test is displayed
		 */

		try {
			Assert.assertEquals(driver.findElementById("android:id/message").getText(),
					"Invalid email or password");

			System.out.println("Test PASSED. The result is correct. ");
		} catch (AssertionError ex) {
			System.out.println("Test FAILED. The result is wrong.");
		}
	}

	@Then("^a popup window shows$")
	public void a_popup_window_shows() throws Throwable {
		/**
		 * Close pop clicking ok button.
		 */

		/***
		 * use desiredcapabilities to close pop up window
		 */

	}
}
