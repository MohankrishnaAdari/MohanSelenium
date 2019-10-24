package Com.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public void url(){
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://google.com/");
	}
}
