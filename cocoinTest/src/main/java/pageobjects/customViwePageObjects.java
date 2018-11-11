package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class customViwePageObjects {
    AndroidDriver driver;
    public customViwePageObjects(AndroidDriver driver){
        this.driver=driver;
        int timeOut = 10;
        PageFactory.initElements(new AppiumFieldDecorator(driver,timeOut, TimeUnit.SECONDS), this);

    }

    @AndroidFindBy(id ="com.nightonke.cocoin:id/custom_text")
    public WebElement customViewLink;

    @AndroidFindBy(id ="com.nightonke.cocoin:id/button")
    public WebElement calButton;

    @AndroidFindBy(id ="com.nightonke.cocoin:id/ok")
    public WebElement okButton;


    public void clickcustomViewLink(){
        this.customViewLink.click();
    }
    public void clickCal(){this.calButton.click();}
    public void clickOkButton(){this.okButton.click();}

    public void checkAmountInCurrnetDate() throws InterruptedException {
        this.clickCal();
        Thread.sleep(1000);
        this.clickOkButton();
        this.clickOkButton();
    }


}
