import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SelAlerts {
    public static void main(String []args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://demo.guru99.com/test/delete_customer.php");

        String pageTitle=driver.getTitle();
        System.out.println("The WebPage Title: "+pageTitle);
        driver.findElement(By.name("cusid")).sendKeys("50924");
        driver.findElement(By.name("submit")).submit();

        Alert alt=driver.switchTo().alert();

        String altMsg=driver.switchTo().alert().getText();

        System.out.print("Alert Message: "+altMsg);

        Thread.sleep(3000);

        alt.accept();

        Thread.sleep(5000);

        driver.findElement(By.name("cusid")).sendKeys("50924");
        driver.findElement(By.name("submit")).submit();

        alt=driver.switchTo().alert();

        Thread.sleep(5000);

        alt.dismiss();

        driver.close();
    }
}