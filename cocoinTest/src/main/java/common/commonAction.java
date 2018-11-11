package common;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Dimension;

/**
 * Created by Sakib on 11/11/2018.
 */
public class commonAction {
    public void swaipAction(AndroidDriver driver) throws InterruptedException {
        Dimension size = driver.manage().window().getSize();
        System.out.println(size);
        int startx = (int) (size.width * 0.90);
        int endx = (int) (size.width * 0.10);
        int starty = size.height / 6;
        System.out.println("Start swipe operation");
        Thread.sleep(4000);
        driver.swipe(startx, starty, endx, starty, 1000);
        Thread.sleep(2000);
        System.out.println("Start swipe operation2");
        driver.swipe(startx, starty, endx, starty, 1000);
        Thread.sleep(2000);
        driver.swipe(startx, starty, endx, starty, 1000);
        Thread.sleep(2000);
        driver.swipe(startx, starty, endx, starty, 1000);
        Thread.sleep(2000);
    }
}
