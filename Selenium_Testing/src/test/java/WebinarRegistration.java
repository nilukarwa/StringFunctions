import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebinarRegistration {
    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.lambdatest.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeAsyncScript("window.scrollBy(0,7000)");
        //Thread.sleep(5000);
        driver.findElement(By.xpath("//a[text()=\"Register for Free \"]")).click();

        /*WebDriverWait wait= new WebDriverWait(driver,10);
        WebElement regBtn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=\"Register for Free \"]")));
        regBtn.click();*/
        driver.quit();
    }
}