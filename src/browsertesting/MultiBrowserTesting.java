package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {
    // Declaration of variables
    static String browser = "Chrome";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

    // open the URL into Browser
        driver.get(baseUrl);
    // maximise the browser
        driver.manage().window().maximize();
    //Give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    // Get and print the Title of the page
        System.out.println(" The title: " + driver.getTitle());
    //Get the Current URL
        System.out.println(" Current URL: " + driver.getCurrentUrl());
    // Get the page source
        System.out.println("Page Source: " + driver.getPageSource());
    //Find the Username field and Type the Username
        driver.findElement(By.id("username")).sendKeys("herokuapp");
    // Find the Passworld field and Type the Password
        driver.findElement(By.id("password")).sendKeys("xyz123");

    // close the driver
        driver.close();

}


}
