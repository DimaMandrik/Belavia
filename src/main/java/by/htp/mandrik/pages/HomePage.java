package by.htp.mandrik.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage{
	private final Logger logger = LogManager.getRootLogger();
	private final String BASE_URL = "https://belavia.by/home/";
	
	@FindBy(xpath = "//*[@id='next-trigger']")
	private WebElement buttonFind1;
	
	@FindBy(xpath = "//*[@id='step-2']/div[4]/div/button")
	private WebElement buttonFind;
	
	public HomePage(WebDriver driver){
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public void enterLocations(){
		buttonFind1.click();
		
		String jS1 = "var s= document.getElementById('OriginLocation_Combobox');s.type = 'visible';s.value = 'MSQ';";
		((JavascriptExecutor) driver).executeScript(jS1);
		
		String jS2 = "var s= document.getElementById('OriginLocation');s.type = 'visible';s.value = 'MSQ';";
		((JavascriptExecutor) driver).executeScript(jS2);
		
		String jS3 = "var s= document.getElementById('DestinationLocation_Combobox');s.type = 'visible';s.value = 'AER';";
		((JavascriptExecutor) driver).executeScript(jS3);
		
		String jS4 = "var s= document.getElementById('DestinationLocation');s.type = 'visible';s.value = 'AER';";
		((JavascriptExecutor) driver).executeScript(jS4);
		
		logger.info("Destinations are entered");
	}

	public void enterDates(){
		String jS1 = "var s= document.getElementById('DepartureDate');s.type = 'visible';s.value = '2016-12-26';";
		((JavascriptExecutor) driver).executeScript(jS1);
		
		String jS2 = "var s= document.getElementById('DepartureDate_Datepicker');s.type = 'visible';s.value = '26.12.2016';";
		((JavascriptExecutor) driver).executeScript(jS2);
		
		String jS3 = "var s= document.getElementById('ReturnDate');s.type = 'visible';s.value = '2017-01-01';";  
		((JavascriptExecutor) driver).executeScript(jS3);
		
		String jS4 = "var s= document.getElementById('ReturnDate_Datepicker');s.type = 'visible';s.value = '01.01.2017';";  
		((JavascriptExecutor) driver).executeScript(jS4);
		
		logger.info("Dates is entered and Find is clicked");
	}
	
	public void clickFind(){
		buttonFind.click();
		logger.info("Find is clicked");
	}

	@Override
	public void openPage(){
		driver.navigate().to(BASE_URL);
	}
}