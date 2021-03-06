package JUnitClass;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class FirstJUnitMultipleSelectClass {
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
    public void amulti1SelectEach() throws InterruptedException {
        WebElement multElm = driver.findElement (By.name ("multiple-select-example"));
        Select sel = new Select (multElm);
        sel.selectByValue ("apple");
        Thread.sleep (3000);
        sel.selectByVisibleText ("Orange");
        Thread.sleep (3000);
        sel.selectByIndex (2);
        Thread.sleep (3000);


    }


    @Test
    public void multi2DeSelectAll() throws InterruptedException {

        WebElement multElm = driver.findElement (By.name ("multiple-select-example"));
        Select sel = new Select (multElm);

        sel.deselectByValue ("apple");
        Thread.sleep (3000);
        sel.deselectByVisibleText ("Orange");
        Thread.sleep (3000);
        sel.deselectByIndex (2);


    }
    @Test
    public void multi3SelectAll() throws InterruptedException {
        WebElement dropElm = driver.findElement (By.id ("carselect"));
        Select sel = new Select (dropElm);
        List<WebElement> opts = sel.getOptions ();
        for (WebElement elm : opts) {
            System.out.println ("Option is" + elm.getText ());

            sel.selectByVisibleText (elm.getText ());
            Thread.sleep (3000);

        }
    }}



