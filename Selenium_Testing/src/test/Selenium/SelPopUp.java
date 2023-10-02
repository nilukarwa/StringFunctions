import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SelPopUp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://demo.guru99.com/popup.php");

        String pageTitle = driver.getTitle();
        System.out.println("The Current Page Title: " + pageTitle);

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        /*Thread.sleep(5000);

        driver.get("https://demo.guru99.com/popup.php");*/

        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        String newPageTitle = driver.getTitle();
        System.out.println("The Landing Page Title: " + newPageTitle);
        if (pageTitle.equals(newPageTitle))
            driver.quit();
        else {
            driver.findElement(By.name("emailid")).sendKeys("gaurav.3n@gmail.com");
        }
    }
}