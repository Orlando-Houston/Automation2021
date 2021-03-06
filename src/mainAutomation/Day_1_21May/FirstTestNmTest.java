package mainAutomation.Day_1_21May;
package main.java;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class FirstTestNmTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\IJProjs\\NAAutoBoot\\chromedriver.exe");
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void firstTetsNm() {
        driver.get("https://www.amazon.com/");
        driver.manage().window().setSize(new Dimension(1551, 842));
        {
            WebElement element = driver.findElement(By.cssSelector(".nav-logo-link"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.cssSelector(".hm-icon")).click();
        driver.findElement(By.cssSelector("li:nth-child(2) > .hmenu-item > div")).click();
        driver.findElement(By.cssSelector(".hmenu-visible > li:nth-child(3) > .hmenu-item")).click();
        {
            WebElement element = driver.findElement(By.linkText("Channels"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("stationary");
        driver.findElement(By.id("issDiv4")).click();
        {
            WebElement element = driver.findElement(By.id("nav-link-prime"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.close();
    }

}
