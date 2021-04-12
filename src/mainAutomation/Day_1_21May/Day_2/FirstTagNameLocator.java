package mainAutomation.Day_1_21May.Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTagNameLocator {
    public static void main(String[] args) {
        System.setProperty ("webdiver.chrome.driver","C:\\chromedriver_win32 (2)");
        WebDriver driver1=new ChromeDriver ();
        driver1.manage ().window ().maximize ();
        driver1.get ("https://www.bankofamerica.com/");
        driver1.findElement (By.tagName ("a")).click ();
        //#id value
        driver1.findElement (By.cssSelector ("#NAV_BUSINES_ADVANTAGE")).click();
        //tag# value
        driver1.findElement (By.cssSelector ("a#NAV_BUSINES_ADVANTAGE")).click ();

    }


}
