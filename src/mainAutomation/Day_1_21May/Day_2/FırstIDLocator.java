package mainAutomation.Day_1_21May.Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FırstIDLocator {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty ("webdriver.chrome.driver ", "C:\\chromedriver.exe");
        //  System.out.println ("driver location is:"+System.getProperty ("webdriver.chrome.driver "));
        WebDriver driver1=new ChromeDriver ();
        driver1.manage ().window ().maximize ();
        driver1.get ("https://www.bankofamerica.com/");
        driver1.findElement(By.id("navChecking")).click ();
        Thread.sleep (3000);

    }}


