import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;

public class gesture_Scroll extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver driver = capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		//Code to perform the scroll- remember the android API function to be used here
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Popup Menu\").instance(0))");
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Views\").instance(0))");
		System.out.println("branch test");
		System.out.println("branch1 test");
		System.out.println("branch2 test");



		
	}

}
