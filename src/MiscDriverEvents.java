import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.KeyEventFlag;

public class MiscDriverEvents extends Baseclass {

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver driver = capabilities();
		// To print the current activity on the app.
		System.out.println(driver.currentActivity());
		
		 //To get the type current app view - Native/Hybrid/Webview
	     System.out.println(driver.getContext());
	    
	     // To get the device orientation
	     System.out.println(driver.getOrientation());
	     
	     //To check if device is locked. Return true if locked, else returns false
	     System.out.println(driver.isDeviceLocked());
	     
	      driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();
	 	  
	      //Press androind device back button
	      driver.pressKey(new KeyEvent(AndroidKey.BACK));   

	}

}
