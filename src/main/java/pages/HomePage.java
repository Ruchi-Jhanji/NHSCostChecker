package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//@FindBy(id="next-button")
	//private WebElement startbtn;
	
	//used xpath for demonstration purpose; ID locator could be used as well
	
	@FindBy(xpath="//input[@class='button button-get-started']")
	private WebElement startbtn;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void startjourney( )
	{
		startbtn.click();
	}
}