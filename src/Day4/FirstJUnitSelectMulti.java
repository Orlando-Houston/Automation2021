package Day4;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

/**
 * it is copy past FirstJUnitBase
 */

public class FirstJUnitSelectMulti {
    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static void setUp() {
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

    @Test

    public void multiaaSelectEach() throws InterruptedException {
        System.out.println (("@multiaaSelectEach- executed test"));
        WebElement multiElement = driver.findElement (By.name ("multiple-select-example"));
        Select sel = new Select (multiElement);
        sel.selectByValue ("peach");
        Thread.sleep (5000);
        sel.selectByVisibleText ("Orange");
        Thread.sleep (5000);
        sel.selectByIndex (0);
    }

    @Test
    public void multiabDeSelectEach() throws InterruptedException {
        System.out.println (("@multi abdeSelectEach- executed test"));
        WebElement multiElement = driver.findElement (By.name ("multiple-select-example"));
        Select sel = new Select (multiElement);
        sel.deselectByValue ("peach");
        Thread.sleep (5000);
        sel.deselectByVisibleText ("Orange");
        Thread.sleep (5000);
        sel.deselectByIndex (0);


    }


    @Test
    public void multiac_getSelected() throws InterruptedException {
        System.out.println (("@multiacSelect All- executed test "));
        WebElement multiElement = driver.findElement (By.id ("multiple-select-example"));
        Select sel = new Select (multiElement);
        List<WebElement> options = sel.getOptions ();//returns a list of Web elements of all option tags inside select
        for (WebElement element : options) {
            System.out.println ("options is " + element.getText ());//get the visible text of the element
            sel.selectByVisibleText (element.getText ());//select using the text of the option tag element
            Thread.sleep (5000);
        }

        sel.deselectByIndex (1);

        //returns a list of elements of all the "selected" option tags inside select
        List<WebElement>selOpts=sel.getAllSelectedOptions ();
        for (WebElement element : selOpts) {
            System.out.println ("selection options is " + element.getText ());//get the visible text of the element
        }
        sel.deselectAll ();
        Thread.sleep (500);
        selOpts=sel.getAllSelectedOptions ();
        System.out.println ("selected options count"+selOpts.size ());
        System.out.println ("is multiple"+sel.isMultiple());

    }
}
