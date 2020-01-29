package utils;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

public class AllowAppPermissions {
	
	public static AndroidDriver driver;
	
	public static void allowAppPermission() {
		driver.context("NATIVE_APP");
		while(driver.findElements(MobileBy.xpath("//*[@class='android.widget.Button'][1]")) != null)
		{
			driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][1]")).click();
		}
		
	}

}
