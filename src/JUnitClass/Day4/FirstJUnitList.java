package JUnitClass.Day4;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstJUnitList {
    static WebDriver driver;
    static String baseUrl;

    @BeforeAll
    public static  void setUP(){
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
    public void radiosButtons() throws InterruptedException {

        List<WebElement> elementList=driver.findElements (By.xpath ("//div[@id='radio-btn-example']//input"));
        for (WebElement  buttonListElm:elementList){
            buttonListElm.click ();
            System.out.println ("radio button is selected:"+buttonListElm.isSelected ());
            Thread.sleep (5000);
        }
    }
    @Test
    public void checkBoxes()throws InterruptedException{
        Thread.sleep (5000);
        List<WebElement> elementList=driver.findElements (By.xpath ("//legend[text()='Checkbox Example']/following-sibling::label/input"));
        for (WebElement  buttonListElm:elementList){
            buttonListElm.click ();
            System.out.println ("checkButton is selected:"+buttonListElm.isSelected ());
            Thread.sleep (5000);
        }

    }
    @Test
    public void webTable()throws InterruptedException{
        Thread.sleep (5000);
        List<WebElement> elementListHead=driver.findElements (By.xpath ("//table[@class='table-display']//th"));
        List<WebElement> elementListAuthor=driver.findElements (By.xpath ("//table[@class='table-display']//td[1]"));
        List<WebElement> elementListCourse=driver.findElements (By.xpath ("//table[@class='table-display']//td[2]"));
        List<WebElement> elementListPrice=driver.findElements (By.xpath ("//table[@class='table-display']//td[3]"));
        List<WebElement> elementListLocation=driver.findElements (By.xpath ("//table[@class='table-display']//td[4]"));
        for (WebElement  listHead:elementListHead) {
            System.out.println ("WebTable Header is:" + listHead.getText ());
        }
        for (WebElement authorList:elementListAuthor){
            System.out.println ("webTable authorList:"+authorList.getText ());
        }
        for (WebElement courseOfList:elementListCourse){
            System.out.println ("webTable authorList:"+courseOfList.getText ());
        }
        for (WebElement priceOfList:elementListPrice){
            System.out.println ("webTable authorList:"+priceOfList.getText ());
        }
        int headSize=elementListHead.size();
        System.out.println ("header element size:"+headSize);
        if (headSize>0){
            for (WebElement listHead:elementListHead){
                System.out.println ("Table header is:"+listHead.getText ());
            }
        }
        else{
            System.out.println ("Header element not found");
        }
        int locationSize=elementListLocation.size ();
        System.out.println ("Location element size:"+locationSize);

        if (locationSize>0){
            for (WebElement locationEle:elementListLocation){
                System.out.println ("4th column is:"+locationEle.getText ());
            }
        } else{
            System.out.println ("4th column element not found");
        }


    }

}
