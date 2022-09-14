import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Hooks extends Driverhelper{
    private Driverhelper base;

    public Hooks(Driverhelper base) {
        this.base = base;
    }


    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
//       System.setProperty("webdriver.chrome.driver",
//                    "C:\\Users\\joeea\\Downloads\\chromedriver_win32\\chromedriver.exe");
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
    }


    @After
    public void TearDown() throws IOException {
        base.driver.close();
        base.driver.quit();
    }
}
