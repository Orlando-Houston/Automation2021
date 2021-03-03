package Day_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FırstFF {
    public static void main(String[] args) {
        //location of the driver executable
        System.setProperty ("webdriver.gecko.driver "," C:\\geckodriver.exe");
        System.out.println ("driver location is:"+System.getProperty ("webdriver.gecko.driver "));
        WebDriver driver1=new FirefoxDriver ();
        driver1.get ("https://etsy.com");

    }
}
