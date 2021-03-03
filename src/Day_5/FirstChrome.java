package Day_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstChrome {
    public static void main(String[] args) {
        //location of the driver executable
        System.setProperty ("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
        //  System.out.println ("driver location is:"+System.getProperty ("webdriver.chrome.driver "));
        WebDriver driver1=new ChromeDriver ();
        driver1.get ("https://etsy.com");

    }
}
