package by.htp.mandrik.steps;

import org.openqa.selenium.WebDriver;

import by.htp.mandrik.driver.DriverSingleton;
import by.htp.mandrik.pages.HomePage;

public class Steps
{
	private WebDriver driver;

	//private final Logger logger = LogManager.getRootLogger();

	public void initBrowser()
	{
		driver = DriverSingleton.getDriver();
	}

	public void closeDriver()
	{
		driver.quit();
	}

	public void findTickets()
	{
		HomePage homePage = new HomePage(driver);
		homePage.openPage();
		homePage.enterLocations();
		homePage.enterDates();
		homePage.clickFind();
		homePage.clickCalendar();
	}

	/*public boolean isLoggedIn(String username)
	{
		LoginPage loginPage = new LoginPage(driver);
		return (loginPage.getLoggedInUserName().trim().toLowerCase().equals(username));
	}

	public boolean createNewRepository(String repositoryName, String repositoryDescription)
	{
		MainPage mainPage = new MainPage(driver);
		mainPage.clickOnCreateNewRepositoryButton();
		CreateNewRepositoryPage createNewRepositoryPage = new CreateNewRepositoryPage(driver);
		String expectedRepoName = createNewRepositoryPage.createNewRepository(repositoryName, repositoryDescription);
		return expectedRepoName.equals(createNewRepositoryPage.getCurrentRepositoryName());
	}

	public boolean currentRepositoryIsEmpty()
	{
		CreateNewRepositoryPage createNewRepositoryPage = new CreateNewRepositoryPage(driver);
		return createNewRepositoryPage.isCurrentRepositoryEmpty();
	}*/

}
