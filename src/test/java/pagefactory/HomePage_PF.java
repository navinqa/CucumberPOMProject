package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

    @FindBy(id="logout")
    WebElement btnLogout;
    WebDriver driver=null;
    public HomePage_PF(WebDriver driver)
    {
        this.driver=driver;
        //PageFactory.initElements(driver, PageFactory.class);
        PageFactory.initElements(driver,this);
    }
    public boolean checkLogoutIsDisplayed()
    {
        return true;
    }

}
