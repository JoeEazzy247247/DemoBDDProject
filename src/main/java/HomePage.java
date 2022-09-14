import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][.='Elements']") private WebElement elements;

    @FindBy(xpath = "//*[@class='main-header']") private WebElement headerText;


    public void ClickElement(){elements.click();}

    public String GetheaderTxt(){
        return headerText.getText();
    }
}
