package runTest;

import common.commonAction;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.remote.MobileCapabilityType;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import pageobjects.*;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Sakib on 11/11/2018.
 */
public class StepDefinition {


    private AndroidDriver driver;

//    public void StepDefinition(){
//        this.driver= Hook.getDriver();
//    }

    @Before
    public void setup() throws MalformedURLException {

        //AndroidDriver<AndroidElement> driver;
        // TODO Auto-generated method stub
        File appDir = new File("aut");
        File app = new File(appDir, "CoCoin.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Appium2");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }


    @When("^I launch CoCoin app$")
    public void run() throws InterruptedException {

        commonAction common= new commonAction();
        common.swaipAction(driver);

        welcomeScreenPageObjects wc=new welcomeScreenPageObjects(driver);
        wc.enterPassword();
        wc.enterPassword();

//        addExpensePageObjects expense=new addExpensePageObjects(driver);
//        expense.addLunch();
    }

    @Then("^Welcome screen appears$")
    public void Welcome_screen_appears()  {
        // Express the Regexp above with the code you wish you had
       System.out.print("Application launched");
       // throw new PendingException();
    }


    @When("^I add Lunch as expense$")
    public void I_add_Lunch_as_expense()  {
        // Express the Regexp above with the code you wish you had
        addExpensePageObjects expense=new addExpensePageObjects(driver);
        expense.addLunch();
        //throw new PendingException();
    }

    @And("^Add amount to click save$")
    public void Add_amount_to_click_save()  {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @Then("^Lunch is added to the expense list$")
    public void Lunch_is_added_to_the_expense_list()  {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }


    @When("^I click on left menu$")
    public void I_click_on_left_menu()  {
        // Express the Regexp above with the code you wish you had
        commonObjects common=new commonObjects(driver);
        common.clickLeftMenu();

       // throw new PendingException();
    }

    @Then("^Left menu expands$")
    public void Left_menu_expands()  {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @Given("^The Password screen$")
    public void The_Password_screen()  {
        // Express the Regexp above with the code you wish you had
        //throw new PendingException();
    }

    @When("^Password is entered$")
    public void Password_is_entered() throws Throwable {
        // Express the Regexp above with the code you wish you had
        welcomeScreenPageObjects wc=new welcomeScreenPageObjects(driver);
        wc.enterPassword();
        //throw new PendingException();
    }

    @Then("^Dashboard appears$")
    public void Dashboard_appears()  {
        // Express the Regexp above with the code you wish you had
//        throw new PendingException();
    }

    @When("^Top Left Menu is tapped$")
    public void Top_Left_Menu_is_tapped()  {
        // Express the Regexp above with the code you wish you had
        commonObjects common=new commonObjects(driver);
        common.clickTopMenu();
       // throw new PendingException();
    }

    @Then("^Left menu appears$")
    public void Left_menu_appears()  {
        // Express the Regexp above with the code you wish you had
       // throw new PendingException();
    }

    @And("^I click on settings$")
    public void iClickOnSettings()  {
        // Write code here that turns the phrase above into concrete actions
      settingsPageObject settings=new settingsPageObject(driver);
      settings.clickSettings();
        //  throw new PendingException();
    }

    @And("^Enable month limit$")
    public void enableMonthLimit()  {
        // Write code here that turns the phrase above into concrete actions
        settingsPageObject settings=new settingsPageObject(driver);
        settings.clickEnableLimitButton();
        //throw new PendingException();
    }

    @And("^Limit the monthly expense$")
    public void clickOnMonthLimit()  {
        // Write code here that turns the phrase above into concrete actions
        settingsPageObject settings=new settingsPageObject(driver);
        settings.inputExpense();
        //throw new PendingException();
    }

    @And("^Tap color remind button$")
    public void tapColorRemindButton()  {
        // Write code here that turns the phrase above into concrete actions
        settingsPageObject settings=new settingsPageObject(driver);
        settings.clickColorRemind();
      //  throw new PendingException();
    }

    @And("^Input amount to warn$")
    public void inputAmountToWarn()  {
        // Write code here that turns the phrase above into concrete actions
        settingsPageObject settings=new settingsPageObject(driver);
        settings.inputWarningAmount();
        //throw new PendingException();
    }

    @And("^Scroll to bottom$")
    public void scrollToBottom() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Remind color\"));");
        //throw new PendingException();
    }

    @And("^Pick a color$")
    public void pickAColor() {
        // Write code here that turns the phrase above into concrete actions
        settingsPageObject settings=new settingsPageObject(driver);
        settings.pickColor();
        //throw new PendingException();
    }

    @And("^Tap month forbidden button$")
    public void tapMonthForbiddenButton() {
        // Write code here that turns the phrase above into concrete actions
        driver.pressKeyCode(AndroidKeyCode.BACK);
        settingsPageObject settings=new settingsPageObject(driver);
        settings.clickSettingsMenu();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Forbidden coCoinRecord money when out of limit\"));");
        settings.clickForbiddenButotn();
    }

    @And("^Change account book name$")
    public void changeAccountBookName() throws IOException, ParseException {
        // Write code here that turns the phrase above into concrete actions
        driver.pressKeyCode(AndroidKeyCode.BACK);
        settingsPageObject settings=new settingsPageObject(driver);
        settings.clickSettingsMenu();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Name of account book\"));");

        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("src/test/resources/features/testData.json"));
        JSONObject jsonObject = (JSONObject) obj;
        String name = (String) jsonObject.get("accountName");

        try {
            settings.inputAccount(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //throw new PendingException();
    }

    @And("^Change password$")
    public void changePassword() {
        // Write code here that turns the phrase above into concrete actions
        driver.pressKeyCode(AndroidKeyCode.BACK);
        settingsPageObject settings=new settingsPageObject(driver);
        settings.clickSettingsMenu();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Change password\"));");
        settings.clickChangePassword();
        settings.changePassword();
        settings.changePassword();
        settings.newPassword();
    }

    @And("^Sort by tags$")
    public void sortByTags() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
         driver.pressKeyCode(AndroidKeyCode.BACK);
         Thread.sleep(1000);
         driver.pressKeyCode(AndroidKeyCode.BACK);
         settingsPageObject settings=new settingsPageObject(driver);
         settings.clickSettingsMenu();
         driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sort Tags\"));");
         settings.clickSortTag();
         settings.sort();
    }

    @When("^swap into current address$")
    public void swapIntoCurrentAddress(){
        dashBoardPageObjects dashboard=new dashBoardPageObjects(driver);
        dashboard.swapDay();
    }

    @Then("^View expense 100 USD in this week$")
    public void viewExpenseInThisWeek() throws InterruptedException {
        dashBoardPageObjects dashboard=new dashBoardPageObjects(driver);
        WebElement result=dashboard.expense;
        Thread.sleep(1000);
        Assert.assertEquals(result.getText(),"$100 ");
    }

    @When("^I click on Custom Link$")
    public void iClickOnCustomLink() {
        driver.pressKeyCode(AndroidKeyCode.BACK);
        customViwePageObjects customView=new customViwePageObjects(driver);
        customView.clickcustomViewLink();

    }

    @And("^View Current Expenses$")
    public void viewCurrentExpances() throws InterruptedException {
        customViwePageObjects customView=new customViwePageObjects(driver);
        customView.checkAmountInCurrnetDate();
    }

    @Then("^Current Expenses should be viewed by date$")
    public void currentExpensesShouldBeViewdByDate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //Assert
    }

    @After
    public void tearDown(){
        driver.quit();
    }


}
