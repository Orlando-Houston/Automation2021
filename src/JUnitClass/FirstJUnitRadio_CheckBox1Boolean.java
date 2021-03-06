package JUnitClass;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstJUnitRadio_CheckBox1Boolean {
    static WebDriver driver;
    static String baseUrl;

    boolean benzSelected;
    boolean bmwSelected;
    boolean hondaSelected;

    @BeforeAll
    public static void setUP() {
        baseUrl = "https://letskodeit.teachable.com/p/practice";
        System.setProperty ("webdriver.chrome.driver","C:\\Users\\chromedriver.exe");
        driver = new ChromeDriver ();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        System.out.println("@BeforeAll - initiated and navigated to web page");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
        System.out.println("@AfterAll - closed browser session");
    }

    @BeforeEach
    public void init() {

        System.out.println("@BeforeEach - refreshed the page");
    }

    @AfterEach
    public void done() {
        //  driver.navigate().refresh();
        System.out.println("@AfterEach - refreshed the page");
    }

    @Test
    public void test1() {
        driver.findElement(By.xpath ("//input[@id='benzradio']")).click ();
        System.out.println("@Test1 - click  radio button");
        driver.findElement(By.xpath ("//input[@id='bmwradio']")).click ();
        System.out.println("@Test1 - click  bmv button");
        driver.findElement(By.xpath ("//input[@id='hondaradio']")).click ();
        System.out.println("@Test1 - click honda  button");



        boolean benzSelected = driver.findElement(By.xpath ("//input[@id='benzradio']")).isSelected ();
        boolean bmwSelected=driver.findElement(By.xpath ("//input[@id='bmwradio']")).isSelected ();
        boolean hondaSelected= driver.findElement(By.xpath ("//input[@id='hondaradio']")).isSelected ();

        System.out.println (" Radio benzSelected"+benzSelected);
        System.out.println ("Radio bmwSelected"+bmwSelected);
        System.out.println ("Radio hondaSelected"+hondaSelected);


    }
/*
    @Test
    public void CheckBoxTest() throws InterruptedException {
        Thread.sleep(3000);
        WebElement bmwCheckButton= driver.findElement (By.xpath ("//input[@id='bmwcheck']"));
        System.out.println("@Test2 - click  check button");
        WebElement benzCheckButton1= driver.findElement (By.xpath ("//input[@id='benzcheck']"));
        WebElement hondaCheckButton2= driver.findElement (By.xpath ("//input[@id='hondacheck']"));
        bmwCheckButton.click ();
        Thread.sleep (3000);
        benzCheckButton1.click ();
        Thread.sleep(3000);
        hondaCheckButton2.click ();
        Thread.sleep(3000);
        bmwCheckButton.click ();
        Thread.sleep (3000);
        benzCheckButton1.click ();
        Thread.sleep(3000);
        hondaCheckButton2.click ();
        Thread.sleep(3000);
        //ikinci tekrarda unchechkd yapiyorsun
    }

 */
}
