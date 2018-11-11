package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class listViewPageObject {

    AndroidDriver driver;
    public listViewPageObject(AndroidDriver driver){
        this.driver=driver;
        int timeOut = 10;
        PageFactory.initElements(new AppiumFieldDecorator(driver,timeOut, TimeUnit.SECONDS), this);

    }

    @AndroidFindBy(id ="com.nightonke.cocoin:id/list_text")
    public WebElement listView;

    public void clickListView(){
        this.listView.click();
    }

}
