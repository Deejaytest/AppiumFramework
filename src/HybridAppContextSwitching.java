import java.net.MalformedURLException;
import java.util.Set;

import io.appium.java_client.android.AndroidDriver;

public class HybridAppContextSwitching extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = capabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"WebView\").instance(0))");
		driver.findElementByXPath("//android.widget.TextView[@text='WebView']").click();
		System.out.println(driver.getContext());
		Set<String> contextNames = driver.getContextHandles();
		for(String contextName : contextNames)
		{
		if (contextName.contains("WEBVIEW")){
			System.out.println(contextName);
            driver.context(contextName);
          }
        }
		driver.findElementByXPath("//android.view.View[@text='Hello World! - 1']").click();


	}

}
