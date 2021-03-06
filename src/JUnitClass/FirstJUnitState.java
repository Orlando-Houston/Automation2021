package JUnitClass;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJUnitState {
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
    public void  init(){
        driver.navigate ().refresh ();
        System.out.println ("@BeforeEach-refreshd the page");

    }
    @AfterEach
    public void done(){
        driver.navigate ().refresh ();
        System.out.println ("@AfterEach-refresh Page");
    }
    @BeforeEach
    public void clickCheckIn(){
        driver.findElement (By.cssSelector ("#hotel-checkin-hp-hotel")).click ();

    }
    @Test
    public void enabledDate() throws InterruptedException {
        Thread.sleep(5000);
        performEnableClick("//button[(@data-day='17' and @data-month='6') or (starts-with(@aria-label,'Jun 17'))]");
        Thread.sleep(5000);
    }

    @Test
    public void disabledDate() throws InterruptedException {
        Thread.sleep(5000);
        performEnableClick("//button[text()=' 1']/span[text()='June']/parent::button");
        Thread.sleep(5000);
    }

    private void performEnableClick(String locat) {
        WebElement datefield = driver.findElement (By.xpath (locat));
        boolean enabl = datefield.isEnabled ();
        if (enabl) {
            datefield.click ();
            System.out.println ("@disabledDate - clicking on enabled date");
        } else {
            System.out.println ("@disabledDate - date field disabled");
        }
    }}
