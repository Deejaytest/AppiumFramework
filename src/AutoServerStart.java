import java.io.IOException;

public class AutoServerStart {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Process p = Runtime.getRuntime().exec("\"C:\\Program Files\\nodejs\\node.exe\" \"C:\\Users\\c-deepak.jindal\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js\" --no-reset --local-timezone");
//		Runtime.getRuntime().exec("cmd /c \"C:\\Users\\c-deepak.jindal\\eclipse-workspace\\AppiumTut\\appiumstart.bat");
		Thread.sleep(10000L);
//		C:\\Users\\c-deepak.jindal\\AppData\\Roaming\\npm\\node_modules\\appium

	}

}
