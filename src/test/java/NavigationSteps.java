import com.sun.tools.javac.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;


public class NavigationSteps extends Driverhelper {

    private Driverhelper _helper;
    HomePage homePage;
    private String url = "https://demoqa.com";
    public NavigationSteps(Driverhelper _helper) {
        this._helper = _helper;
        homePage = new HomePage(_helper.driver);
    }

    @Given("I am on demoqa site")
    public void IamOnDemoQASite(){
       _helper.driver.get(url);
       _helper.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
   }

   @When("I click Elements")
    public void IclickElements(){
       homePage.ClickElement();
   }

   @Then("I am on Elements page")
    public void IamonElementspage(){
       homePage.GetheaderTxt();
       Assert.check(homePage.GetheaderTxt().equals("Elements"));
   }
}
