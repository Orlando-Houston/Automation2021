package JUnitClass.June1;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;

public class FirstJUnitJHandleJavaScrpt {
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
    public  void test1() throws InterruptedException {//replacement of driver click
        Thread.sleep (5000);
        // String currHandle=driver.getWindowHandle ();
        //System.out.println ("@Test1- current Window Handle before clicking:"+currHandle);
        String parentHandle=driver.getWindowHandle ();
        driver.findElement (By.id ("openwindow")).click ();
        // driver.findElement (By.xpath ("//input[@placeholder='Find a course]")).sendKeys ("some course");
        Thread.sleep (5000);
        // currHandle=driver.getWindowHandle ();
        // System.out.println ("@Test- current window handle after clicking:"+currHandle);
        System.out.println ("@Test- current window handle after clicking:"+parentHandle);

        //return all window handles for window open by driver
        Set<String> handles=  driver.getWindowHandles ();
        System.out.println ("Number of windows:"+handles.size());
        for (String handle:handles){
            if(handle.equals (parentHandle)){
                System.out.println ("handle is parent handle"+handle);
            }
            else{
                System.out.println ("handle is child handle"+handle);
            }



        }

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

    }}


