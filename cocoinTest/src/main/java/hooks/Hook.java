package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Sakib on 11/11/2018.
 */
public class Hook {

    public AndroidDriver<AndroidElement> driver;

    @Before
    public void setup() throws MalformedURLException {

        //AndroidDriver<AndroidElement> driver;

        // TODO Auto-generated method stub
        File appDir = new File("aut");
        File app = new File(appDir, "CoCoin.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Appium");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.print("Hello");
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    public void setDriver(AndroidDriver driver){
        this.driver=driver;
    }

    public AndroidDriver getDriver(){
        return driver;
    }
}
