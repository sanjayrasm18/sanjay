package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clsname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/sanja/Desktop/voot.html");
	Thread.sleep(2000);
    driver.findElement(By.className("c1")).click();
	}

}
