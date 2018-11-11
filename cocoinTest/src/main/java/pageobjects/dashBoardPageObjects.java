package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class dashBoardPageObjects {

    AndroidDriver driver;
    public dashBoardPageObjects(AndroidDriver driver){
        this.driver=driver;
        int timeOut = 10;
        PageFactory.initElements(new AppiumFieldDecorator(driver,timeOut, TimeUnit.SECONDS), this);

    }

    @AndroidFindBy(id ="com.nightonke.cocoin:id/expanse")
    public WebElement expense;


    @AndroidFindBy(xpath ="//*[@text='YESTERDAY']")
    public WebElement yesterdayLink;

    @AndroidFindBy(xpath ="//*[@text='THIS WEEK']")
    public WebElement thisWeekLink;

    @AndroidFindBy(xpath ="//*[@resource-id='com.nightonke.cocoin:id/all']")
    public WebElement buttonAll;

    @AndroidFindBy(xpath ="//*[@resource-id='android:id/button1']")
    public WebElement buttonGet;

    public void clickYesterday(){
        this.yesterdayLink.click();
    }

    public void clickThisWeek(){
        this.thisWeekLink.click();
    }

    public void clickButtonAll(){
        this.buttonAll.click();
    }

    public void clickButtonGet(){
        this.buttonGet.click();
    }

    public void swapDay(){
        this.clickYesterday();
        this.clickThisWeek();
        this.clickButtonAll();
        this.clickButtonGet();
    }

    //        driver.findElement(By.xpath("//*[@text='YESTERDAY']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@text='THIS WEEK']")).click();
//        driver.findElement(By.xpath("//*[@resource-id='com.nightonke.cocoin:id/all']")).click();
//        driver.findElement(By.xpath("//*[@resource-id='android:id/button1']")).click();
}
