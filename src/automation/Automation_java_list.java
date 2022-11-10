package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_java_list {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\my new drive\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		 
		driver.get("http://127.0.0.1:5503/index.html");
		driver.manage().window().maximize();

//		String myTitle = driver.getTitle();
//		System.out.println(myTitle);
//		List <WebElement> myListOfOptions = driver.findElements(By.tagName("option"));		
//		for(int i=0;i<myListOfOptions.size();i++){
//			System.out.println(myListOfOptions.get(i).getText());
//		} 

		String ourTitle=driver.getTitle();
		System.out.println(ourTitle);
		List <WebElement> optionList = driver.findElements(By.tagName("option"));
		for(int i=0; i<optionList.size();i++) {
			System.out.println(optionList.get(i).getText());
		}
		
	}

}
