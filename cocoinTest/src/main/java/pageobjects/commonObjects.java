package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sakib on 11/11/2018.
 */
public class commonObjects {

    AndroidDriver driver;

    @AndroidFindBy(xpath = "//*[@resource-id='com.nightonke.cocoin:id/content_hamburger']")
    public WebElement topLeftMenu;

    @AndroidFindBy(className="android.widget.ImageButton")
    public WebElement topMenu;

    public commonObjects(AndroidDriver driver){
        this.driver=driver;
        int timeOut = 10;
        PageFactory.initElements(new AppiumFieldDecorator(driver,timeOut, TimeUnit.SECONDS), this);
    }

    public void clickLeftMenu(){
        this.topLeftMenu.click();
    }

    public void clickTopMenu(){
        this.topMenu.click();
    }


}
