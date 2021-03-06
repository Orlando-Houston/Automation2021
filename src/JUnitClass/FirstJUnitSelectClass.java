package JUnitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class FirstJUnitSelectClass {
    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static void setUP() {
        baseUrl = "https://letskodeit.teachable.com/p/practice";
        System.setProperty ("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
        driver = new ChromeDriver ();
        driver.manage ().window ().maximize ();
        driver.get (baseUrl);
        System.out.println ("@Before all -initiated and navigated to web page");


    }

    @AfterAll
    public static void tearDown() {
        driver.quit ();
        System.out.println ("@AfterAll-closed browser session");
    }

    @BeforeEach
    public void init() {
        driver.navigate ().refresh ();
        System.out.println ("@BeforeEach-refreshd the page");

    }

    @AfterEach
    public void done() {
        driver.navigate ().refresh ();
        System.out.println ("@AfterEach-refresh Page");
    }

    @Test
    public void dropSelectEach() throws InterruptedException {
        WebElement dropElm = driver.findElement (By.id ("carselect"));
        Select sel = new Select (dropElm);
        sel.selectByValue ("honda");
        Thread.sleep (3000);
        sel.selectByVisibleText ("Benz");
        Thread.sleep (3000);
        sel.selectByIndex (0);

    }


    @Test
    public void dropSelectAll() throws InterruptedException {
        WebElement dropElm = driver.findElement (By.id ("carselect"));
        Select sel = new Select (dropElm);
        List<WebElement> opts = sel.getOptions ();
        for (WebElement elm : opts) {
            System.out.println ("Option is" + elm.getText ());

        }
    }
}
