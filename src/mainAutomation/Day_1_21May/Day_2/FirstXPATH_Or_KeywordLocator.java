package mainAutomation.Day_1_21May.Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstXPATH_Or_KeywordLocator {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty ("webdriver.chrome.driver ", "C:\\chromedriver.exe");
        //  System.out.println ("driver location is:"+System.getProperty ("webdriver.chrome.driver "));
        WebDriver driver1=new ChromeDriver ();
        driver1.manage ().window ().maximize ();
        driver1.get ("https://www.bankofamerica.com/");
        driver1.findElement(By.xpath ("//span[text()='Get started' " +
                "or text()='Click to get started'" +
                " or text()='Open account'" +
                "or text()='See options']")).click ();

        Thread.sleep (3000);

    }}

