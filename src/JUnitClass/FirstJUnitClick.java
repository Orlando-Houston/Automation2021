package JUnitClass;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstJUnitClick {
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
    public void test1(){
        driver.findElement (By.cssSelector ("a.navbar-brand.header-logo")).click ();
        System.out.println ("aTest1.clicking directly");
    }
    @Test
    public void test2()throws InterruptedException{
        Thread.sleep (5000);
        WebElement logo=driver.findElement (By.cssSelector ("a.navbar-brand.header-logo"));
        logo.click ();
        System.out.println ("test2- clicking on web element  logo");
    }
}
