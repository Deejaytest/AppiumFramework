import java.net.MalformedURLException;

import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Gestures_Tap extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {

		  AndroidDriver driver =capabilities();
		  driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		  
		  //Code to perform tap operation
		  //Syntax
		  //new TouchAction<>(driver).longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element))).release().perform();
		  
	}

}

