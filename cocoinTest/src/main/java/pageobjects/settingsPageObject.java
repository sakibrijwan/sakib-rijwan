package pageobjects;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


import java.util.List;
import java.util.concurrent.TimeUnit;

public class settingsPageObject {

    AndroidDriver driver;
    public settingsPageObject(AndroidDriver driver){
        this.driver=driver;
        int timeOut = 10;
        PageFactory.initElements(new AppiumFieldDecorator(driver,timeOut, TimeUnit.SECONDS), this);

    }

    @AndroidFindBy(id = "com.nightonke.cocoin:id/settings_text")
    public WebElement settings;

    @AndroidFindBy(id = "com.nightonke.cocoin:id/month_limit_enable_button")
    public WebElement monthLimitButton;

    @AndroidFindBy(id = "com.nightonke.cocoin:id/month_expense")
    public WebElement monthExpense;

    @AndroidFindBy(id = "android:id/input")
    public WebElement expenseInput;

    @AndroidFindBy(id ="com.nightonke.cocoin:id/buttonDefaultPositive")
    public WebElement okButton;

    @AndroidFindBy(id ="com.nightonke.cocoin:id/month_color_remind_button")
    public WebElement colorReminderButton;

    @AndroidFindBy(id ="com.nightonke.cocoin:id/warning_expense")
    public WebElement warning;

    @AndroidFindBy(id ="android:id/input")
    public WebElement warningInput;

    @AndroidFindBy(id ="com.nightonke.cocoin:id/month_color_type")
    public WebElement colorOfMonthlyLimit;

    @AndroidFindBy(className = "android.widget.FrameLayout']")
    public List<WebElement> pickColor;

    @AndroidFindBy(className = "android.widget.ImageButton")
    public WebElement topLeftMenu;

    @AndroidFindBy(id ="com.nightonke.cocoin:id/month_forbidden_button")
    public WebElement forbiddenButton;

    @AndroidFindBy(id ="com.nightonke.cocoin:id/account_book_name")
    public WebElement accountBookName;

    @AndroidFindBy(id ="android:id/input")
    public WebElement accountInput;

    @AndroidFindBy(id ="com.nightonke.cocoin:id/change_password_text")
    public WebElement changePasswordLink;

    @AndroidFindBy( xpath="//*[@text='1']")
    public WebElement one;
    @AndroidFindBy( xpath="//*[@text='2']")
    public WebElement two;
    @AndroidFindBy( xpath="//*[@text='3']")
    public WebElement three;
    @AndroidFindBy( xpath="//*[@text='4']")
    public WebElement four;

    @AndroidFindBy(id ="com.nightonke.cocoin:id/sort_tags_text")
    public WebElement sortTag;


    @AndroidFindBy( xpath="//*[@text='Lunch']")
    public WebElement source;
    @AndroidFindBy( xpath="//*[@text='Breakfast']")
    public WebElement destination;

    @AndroidFindBy(id ="com.nightonke.cocoin:id/check")
    public WebElement checkButton;

     public void clickSettings(){
         this.settings.click();
     }

     public void clickEnableLimitButton(){
         this.monthLimitButton.click();
     }

     public void  inputExpense(){
         this.monthExpense.click();
         this.expenseInput.sendKeys("500");
         this.okButton.click();
     }

     public void clickColorRemind(){
         this.colorReminderButton.click();
     }

     public void inputWarningAmount(){
         this.warning.click();
         this.warningInput.sendKeys("400");
         this.okButton.click();
     }

     public void pickColor(){
         this.colorOfMonthlyLimit.click();
        // this.pickColor.get(4).click();
         this.okButton.click();
     }

     public void clickSettingsMenu(){
         this.topLeftMenu.click();
         this.settings.click();
     }

     public void clickForbiddenButotn(){
         this.forbiddenButton.click();
     }

     public void inputAccount(String name) throws InterruptedException {
         this.accountBookName.click();
         Thread.sleep(2000);
         this.accountInput.sendKeys(name);
         this.okButton.click();
     }

     public void clickChangePassword(){
         this.changePasswordLink.click();
     }

     public void changePassword(){
        this.one.click();
        this.two.click();
        this.three.click();
        this.four.click();
    }

    public void newPassword(){
        this.one.click();
        this.one.click();
        this.two.click();
        this.two.click();
    }

    public void clickSortTag(){
         this.sortTag.click();
    }

    public void sort(){
        TouchAction touch=new TouchAction(driver);
        touch.longPress(source,2000).moveTo(destination).release().perform();
        this.checkButton.click();
    }

}
