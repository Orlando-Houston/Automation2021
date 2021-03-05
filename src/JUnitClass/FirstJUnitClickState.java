package JUnitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstJUnitClickState {

    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static  void setUP(){
        baseUrl="https://www.expedia.com/";
        System.setProperty ("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
        driver=new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.get (baseUrl);
        System.out.println ("@Before all -initiated and navigated to web page");


    }
    @AfterAll
    public static void tearDown(){
        driver.quit ();
        System.out.println ("@AfterAll-closed browser session");
    }

    @BeforeEach
    public void clickCheckIn(){
        driver.findElement (By.xpath ("//*[@id='hotel-checkin-hp']")).click ();
        System.out.println ("aTest1.clicking on check in");
    }

    @Test
    public void enableDate()throws InterruptedException{
        Thread.sleep (5000);
        WebElement dateField=driver.findElement (By.xpath ("//button[@data-day='31' and @data-month='5' or(star-with@aria-label,'June 31'))]"));
        boolean enabldate=dateField.isEnabled ();
        if (enabldate){
            dateField.click ();
        }else{
            System.out.println ("@enabledate- date field disabled");
        }


        driver.findElement (By.xpath ("//button[@data-stid='apply-date-picker']")).click ();
        Thread.sleep (5000);
        System.out.println ("test2- clicking on enabled button");
    }
    @Test
    public void disableTest()throws InterruptedException{
        Thread.sleep (5000);
        WebElement dateField=driver.findElement (By.xpath ("//button[@data-day='31' and @data-month='4' or(star-with@aria-label,'May 31'))]"));
        dateField.click ();
        System.out.println ("test2- clicking on disabled date");
    }

}
