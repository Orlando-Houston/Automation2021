package JUnitClass.Day4;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
/**
 * it is copy past FirstJUnitBase
 */

public class FirstJUnitSelectDrop {
    static WebDriver driver;
    static String baseUrl;
    @BeforeAll
    public static void setUp(){
        baseUrl="https://letskodeit.teachable.com/p/practice";
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

    @Test
    public  void dropSelectEach() throws InterruptedException {
        System.out.println (("@dropSelectEach- executed test"));
        WebElement dropElement=driver.findElement (By.id ("carselect"));
        Select sel=new Select (dropElement);
        sel.selectByValue ("honda");
        Thread.sleep (5000);
        sel.selectByVisibleText ("BMW");
        Thread.sleep (5000);
        sel.selectByIndex (1);





    }
    @Test
    public  void dropSelectAll() throws InterruptedException {
        System.out.println (("@dropSelect All- executed test "));
        WebElement dropElement=driver.findElement (By.id ("carselect"));
        Select sel=new Select (dropElement);
        List<WebElement> options=sel.getOptions ();//returns a list of Web elements of all option tags inside select
        for (WebElement element:options) {
            System.out.println ("options is " + element.getText ());//get the visible text of the element
            sel.selectByVisibleText (element.getText ());//select using the text of the option tag element
            Thread.sleep (5000);
        }
    }
}
