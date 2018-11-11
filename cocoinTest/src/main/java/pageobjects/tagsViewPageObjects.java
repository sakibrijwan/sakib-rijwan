package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class tagsViewPageObjects {
    AndroidDriver driver;
    public tagsViewPageObjects(AndroidDriver driver){
        this.driver=driver;
        int timeOut = 10;
        PageFactory.initElements(new AppiumFieldDecorator(driver,timeOut, TimeUnit.SECONDS), this);

    }

    @AndroidFindBy(id ="com.nightonke.cocoin:id/tag_text")
    public WebElement tagsViewLink;

    public void clicktagsViewLink(){
        this.tagsViewLink.click();
    }


}
