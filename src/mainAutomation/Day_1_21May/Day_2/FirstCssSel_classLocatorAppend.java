package mainAutomation.Day_1_21May.Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCssSel_classLocatorAppend {
    public static void main(String[] args) {
        System.setProperty ("webdiver.chrome.driver","C:\\chromedriver_win32 (2)");
        WebDriver driver1=new ChromeDriver ();
        driver1.manage ().window ().maximize ();
        driver1.get ("https://www.bankofamerica.com/");


//tag .classvalue1.classvalue2.classvalue3 and so on
        driver1.findElement (By.cssSelector ("span.spa-btn.spa-btn--primary.spa-btn--medium.masthead-cta-btn")).click ();

    }
}
