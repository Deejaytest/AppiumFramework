import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
public class UIAutomatorClass extends Baseclass {

	public static void main(String[] args) throws MalformedURLException  {

		AndroidDriver driver=capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Syntax for findElementByAndroidUIAutomator 
		//findElementByAndroidUIAutomator("attributename(\"value of attribute\")") 
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//Syntax for checking if any property(clickable, enabled, focused, checked, focuable etc.) is working or not
		//findElementByAndroidUIAutomator("new UiSelector().propertyname(value)")
		System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	}

}
