package JUnitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstJUnitClickSendKeys {
    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static  void setUP(){
        baseUrl="https://letskodeit.teachable.com/";
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
    public void  init(){
        driver.navigate ().refresh ();
        System.out.println ("@BeforeEach-refreshd the page");

    }
    @AfterEach
    public void done(){
        driver.navigate ().refresh ();
        System.out.println ("@AfterEach-refresh Page");
    }

    @Test
    public void test1() throws InterruptedException {
        //  driver.findElement (By.xpath ("//a[@href='/sign_in']")).click ();
        System.out.println ("a Test1.clicking directly on login button");
        System.out.println ("entered email");
        Thread.sleep (5000);
        driver.manage ().window ().maximize ();
        driver.findElement (By.xpath ("//label[text()='Email Address']//following-sibling::div/input"))
                .sendKeys ("a.ozder@outlook.com");
        System.out.println ("entered password");
        driver.findElement (By.xpath ("//label[text()='Password']//following-sibling::div/input ")).sendKeys ("1,2,3,4,");
        driver.findElement (By.xpath ("//input[@value='Log In']")).click ();
        // )
    }



    @Test
    public void test2()throws InterruptedException {
        Thread.sleep (5000);
        //  WebElement logIn=driver.findElement (By.xpath ("//a[@href='/sign_in']"));
        //  logIn.click ();
        driver.manage ().window ().maximize ();
        WebElement email = driver.findElement (By.xpath ("//label[text()='Email Address']//following-sibling::div/input"));
        email.sendKeys ("a.ozder@outlook.com");
        WebElement password = driver.findElement (By.xpath ("//label[text()='Password']//following-sibling::div/input "));
        password.sendKeys ("1234");
        WebElement LogIn = driver.findElement (By.xpath ("//label[text()='Password']//following-sibling::div/input "));
        LogIn.click ();
        System.out.println ("test2- clicking on web element  logo");

    }


}
