package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage extends AbstractPage{

	public GooglePage(WebDriver driver) {
		super(driver);
	}
	
	public void openSite(){
		driver.get("http://www.google.com.br/seach");
	}
	
	public void searchBySummary(String summary){
		printText("lst-ib", summary);
		click("//button[@name='btnG']");
	}
	
	public boolean hasResuts(){
		boolean hasValue = false;
		if(driver.findElement(By.xpath("")).isDisplayed()){
			hasValue = true;
		}
		
		return hasValue;
	}
}
