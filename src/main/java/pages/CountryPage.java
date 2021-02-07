package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountryPage {
	@FindBy(id="label-wales")
	private WebElement walesoptn;
	
	//@FindBy (id="next-button")
	//private WebElement nxtbtn;
	
	//used xpath for demonstration purpose; ID locator could be used as well
	
	@FindBy (xpath="//input[@type='submit']")
	private WebElement nxtbtn;
	
	public CountryPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void countryjrney()
	{
		walesoptn.click();
		nxtbtn.click();
	}
}