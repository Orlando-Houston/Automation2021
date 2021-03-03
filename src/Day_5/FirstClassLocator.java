package Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClassLocator {
    public static void main(String[] args) {
        System.setProperty ("webdiver.chrome.driver","C:\\chromedriver_win32 (2)");
        WebDriver driver1=new ChromeDriver ();
        driver1.manage ().window ().maximize ();
        driver1.get ("https://www.bankofamerica.com/");
        driver1.findElement (By.className ("search-query")).sendKeys ("how to make money");

    }
}
