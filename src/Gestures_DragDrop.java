import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Gestures_DragDrop extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByXPath("//android.widget.TextView[@index='7']").click();
		TouchAction t = new TouchAction(driver);
		WebElement from = driver.findElementByXPath("//android.view.View[@index='1']"); // Get the path of current postion
		WebElement to = driver.findElementByXPath("//android.view.View[@index='4']"); // Get the path of desired position
		int leftX = to.getLocation().getX();
		int rightX = leftX + to.getSize().getWidth();
		int middleX = (rightX + leftX) / 2;
		
		int upperY = to.getLocation().getY();
		int lowerY = upperY + to.getSize().getHeight();
		int middleY = (upperY + lowerY) / 2;
		t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(from)).withDuration(Duration.ofSeconds(3))).moveTo(PointOption.point(middleX, middleY)).release().perform();
		  
		
	}

}
