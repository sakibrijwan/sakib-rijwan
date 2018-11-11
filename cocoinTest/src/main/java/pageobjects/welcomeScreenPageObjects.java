package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sakib on 11/11/2018.
 */
public class welcomeScreenPageObjects {
    AndroidDriver driver;

    @AndroidFindBy(xpath = "//*[@text='1']")
    public WebElement one;
    @AndroidFindBy(xpath = "//*[@text='2']")
    public WebElement two;
    @AndroidFindBy(xpath = "//*[@text='3']")
    public WebElement three;
    @AndroidFindBy(xpath = "//*[@text='4']")
    public WebElement four;

    public welcomeScreenPageObjects(AndroidDriver driver){
        this.driver=driver;
        int timeOut = 10;
        PageFactory.initElements(new AppiumFieldDecorator(driver,timeOut, TimeUnit.SECONDS), this);
    }

    public void clickOne(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='1']")));
        this.one.click();
    }
    public void clickTwo(){
        this.two.click();
    }
    public void clickThree(){
        this.three.click();
    }
    public void clickFour(){
        this.four.click();
    }

    public void enterPassword() throws InterruptedException {
        Thread.sleep(2000);
        this.clickOne();
        this.clickTwo();
        this.clickThree();
        this.clickFour();
    }
}
