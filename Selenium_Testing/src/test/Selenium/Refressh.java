import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Refressh {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("I am writing my first test case");

        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.toolsqa.com/");
//        driver.close();

        /*Thread.sleep(10000);
//        driver.get("https://www.toolsqa.com/");
        //Web Page Refresh using Navigate.refresh method
        driver.navigate().refresh();
        System.out.println("Refresh happened through Navigate's Refressh method");

        Thread.sleep(4000);
        //Web Page Refresh using driver.get method
        driver.get(driver.getCurrentUrl());
        System.out.println("Refresh happened through driver's getCurrentUrl method");

        Thread.sleep(5000);
        //Web Page Refresh using Navigate.to method
        driver.navigate().to(driver.getCurrentUrl());
        System.out.println("Refresh happened through Navigate's to method");*/

        Thread.sleep(6000);
        //Web Page Refresh using sendKeys method
        driver.findElement(By.xpath("//div[3]//input[@name=\"keyword\"]")).sendKeys(Keys.F5);
        System.out.println("Refresh happened through driver's send-keys method using Keys.F5");

        Thread.sleep(7000);
        //Web Page Refresh using sendKeys method
        driver.findElement(By.xpath("//div[3]//input[@name=\"keyword\"]")).sendKeys("\uE035");
        System.out.println("Refresh happened through driver's send-keys method using ASCII values for F5 key");
        driver.close();
    }
}