package FirstDay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstFF {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\IdeaProjects1\\SeleniumProjects1\\geckodriver.exe");

        System.out.println("driver location is:"+System.getProperty("webdriver.gecko.driver"));

        WebDriver driver1 = new FirefoxDriver ();

        driver1.get("https://amazon.com");

    }}
