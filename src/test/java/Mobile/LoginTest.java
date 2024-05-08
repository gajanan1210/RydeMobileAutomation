package Mobile;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class LoginTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("deviceName", "Pixel2");
		capabilities.setCapability("platformname", "Android");
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("app", "/Users/gajananheddure/Desktop/RYDE.apk");
		capabilities.setCapability("platformversion", "9");

		URL url = URI.create("http://127.0.0.1:4723/").toURL();
		AndroidDriver driver = new AndroidDriver(url, capabilities);

		Thread.sleep(5000);

		System.out.println("Application started");

		// click on allow button
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();

		Thread.sleep(15000);

		driver.findElement(By.id("com.rydesharing.ryde:id/btn_login_mobile")).click();

		// click on google button for login

		// driver.quit();
		WebElement number = driver.findElement(By.id("com.rydesharing.ryde:id/et_phone"));

		number.click();

		Thread.sleep(15000);
		number.sendKeys("90126257");

		driver.findElement(By.id("com.rydesharing.ryde:id/btn_get_otp")).click();

		Thread.sleep(5000);

		WebElement otp = driver.findElement(By.id("com.rydesharing.ryde:id/et_pin_1"));

		otp.click();

		Thread.sleep(5000);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a 6-digit OTP:");

		// Read the input from the user
		String userotp = scanner.nextLine();
		System.out.println("User entered OTP: " + userotp);

		// Close the scanner
		scanner.close();
		Thread.sleep(25000);
		otp.clear();

		// Enter each digit of the OTP one by one
		for (int i = 0; i < userotp.length(); i++) {
			char digit = userotp.charAt(i);
			// Convert character to integer value
			int keyCode = digit - '0';
			// Simulate pressing the corresponding key code for the digit
			driver.pressKey(new KeyEvent(AndroidKey.valueOf("DIGIT_" + keyCode)));
			// Add a short delay between pressing each digit
			Thread.sleep(500); // Adjust the sleep duration as needed
		}

		// Enter the OTP into the input field
		// otp.sendKeys(userotp);

	}
}
