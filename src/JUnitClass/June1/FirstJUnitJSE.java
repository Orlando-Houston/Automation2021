package JUnitClass.June1;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

@TestMethodOrder (MethodOrderer.Alphanumeric.class)

public class FirstJUnitJSE {
    static WebDriver driver;
    static String baseUrl;
    static JavascriptExecutor jse;
    @BeforeAll
    public static void setUp(){

        baseUrl = "https://www.bankofamerica.com/";
        System.setProperty("webdriver.gecko.driver","C:\\IJProjs\\NAAutoBoot\\geckodriver.exe");
        driver = new FirefoxDriver ();
        //  driver.manage().window().maximize();
        //   driver.get(baseUrl);

        jse=(JavascriptExecutor)  driver;
        // jse.executeScript ("window.location='https://letskodeit.teachable.com/p/practice'");
        jse.executeScript ("window.location=arguments[0]",baseUrl);
        System.out.println("@BeforeAll - initiated and navigated to web page");


    }
    @AfterAll
    public static void tearDown(){
        System.out.println (("@AfterAll- executed once After all test methods in this class"));

    }
    @BeforeEach
    public  void init(){
        System.out.println (("@BeforeEach- executed once before all test methods in this class"));

    }
    @AfterEach
    public  void done(){
        System.out.println (("@AfterAll- executed once after all test methods in this class"));

    }
    @Test
    public  void clicking() throws InterruptedException {//replacement of driver click
        Thread.sleep (5000);
        WebElement checking=driver.findElement (By.xpath ("//a[@aria-controls='navCheckingContent']"));
        jse.executeScript ("argument[0].click();",checking);
        System.out.println (("@Test1- executed test"));

    }
    @Test
    public  void sendKeys() throws InterruptedException {//replacement of driver sendKeys
        WebElement onlineId=driver.findElement (By.xpath ("//input[@aria-labelledby='labelForonlineId1']"));
        jse.executeScript ("arguments[0].value='tester1'",onlineId);
        Thread.sleep (5000);
        jse.executeScript ("arguments[0].value=arguments[1]",onlineId,   "tester2");

        System.out.println (("@Test2- executed "));

    }
    @Test
    public  void scrollBy() throws InterruptedException {
        Thread.sleep (10000);
        jse.executeScript ("window.scrollBy(0,1800)");//scroll down
        Thread.sleep (5000);
        jse.executeScript ("window.scrollBy(0,-1000)");//scroll up
        Thread.sleep (5000);

        System.out.println (("@Test3- executed "));

    }
    public  void scrollView() throws InterruptedException {
        Thread.sleep (20000);
        // WebElement showMore=driver.findElement (By.xpath ("//a[text()='Online Banking Service Agreement']"));
        WebElement agree=
                (WebElement)jse.executeScript ("return document.getElementById(argument[0])","footer_bofa_online_banking_service_agreement");
        jse.executeScript ("arguments[0].scrollIntoView(true)",agree);
        Thread.sleep (5000);

        System.out.println (("@Test4- executed "));

    }
    public void windowSize()throws InterruptedException{//return window size
        Thread.sleep (20000);
        long height=(Long)jse.executeScript ("return window.innerHeight");
        long wight=(Long)jse.executeScript ("return window.innerWight");
        System.out.println ("Window dimensions are:"+height+"x"+wight);
        jse.executeScript ("window.scrollBy(0,arguments[0])",height-150);
    }

}
