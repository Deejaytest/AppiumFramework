import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
public class Gestures_LongPress extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver driver =capabilities();
		  driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		  driver.findElementByXPath("//android.widget.TextView[@index='8']").click();
		  driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		  WebElement MyElement = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']")); 
		  //Code for long press
		  //Syntax
		  //new TouchAction<>(driver).longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element)).withDuration(Duration.ofSeconds(Seconds))).release().perform();
		  TouchAction t = new TouchAction(driver);
		  t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(MyElement)).withDuration(Duration.ofSeconds(3))).release().perform();

	}

}
