package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sakib on 11/11/2018.
 */
public class addExpensePageObjects {

    AndroidDriver driver;
//    WebDriverWait wait;

    public addExpensePageObjects(AndroidDriver driver){
        this.driver=driver;
        int timeOut = 10;
        PageFactory.initElements(new AppiumFieldDecorator(driver,timeOut,TimeUnit.SECONDS), this);

    }

   // By lunch= By.xpath("//*[@text='Lunch']");
    //public WebElement lunch=findElement(By.xpath("//*[@text='Lunch']"));

    @AndroidFindBy(xpath = "//*[@text='Lunch']")
    public WebElement lunch;

    @AndroidFindBy(xpath="//*[@text='1']")
    public WebElement one;

    @AndroidFindBy(xpath="//*[@text='0']")
    public WebElement zero;

    @AndroidFindBy(xpath = "//*[@resource-id='com.nightonke.cocoin:id/icon']")
    public List<WebElement> allButtons;



    public void clickLunch(){
       // wait.until(ExpectedConditions.presenceOfElementLocated(this.lunch));
        this.lunch.click();
    }

    public void clickOne(){
        this.one.click();
    }

    public void clickZero(){
        this.zero.click();
    }

    public void clickTick(){
        this.allButtons.get(1).click();
    }

    public void addLunch(){
        this.clickLunch();
        this.clickOne();
        this.clickZero();
        this.clickZero();
        this.clickTick();
    }

    //.get(1).click();

//    driver.findElementByXPath("//*[@resource-id='com.nightonke.cocoin:id/content_hamburger']").click();
//    Thread.sleep(1000);
//    @AndroidFindBy(xpath("//*[@text='1']")).click();
//    @AndroidFindBy(xpath("//*[@text='2']")).click();
//    @AndroidFindBy(xpath("//*[@text='3']")).click();
//    @AndroidFindBy(xpath("//*[@text='4']")).click();
}
