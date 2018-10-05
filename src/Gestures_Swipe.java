import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Gestures_Swipe extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver= capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@index='6']").click();
		driver.findElementByXPath("//android.widget.TextView[@index='1']").click();  
		driver.findElementByXPath("//*[@content-desc='9']").click();  
		TouchAction t = new TouchAction(driver);
		WebElement from = driver.findElementByXPath("//*[@content-desc='15']"); // Get the path of current postion
		WebElement to = driver.findElementByXPath("//*[@content-desc='45']"); // Get the path of desired position
		int leftX = to.getLocation().getX();
		int rightX = leftX + to.getSize().getWidth();
		int middleX = (rightX + leftX) / 2;
		
		int upperY = to.getLocation().getY();
		int lowerY = upperY + to.getSize().getHeight();
		int middleY = (upperY + lowerY) / 2;
		//Actual code for swipe functionality - Longpress at a point for x seconds >> then move to desired position >> release
		t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(from)).withDuration(Duration.ofSeconds(2))).moveTo(PointOption.point(middleX, middleY)).release().perform();
	
}
}