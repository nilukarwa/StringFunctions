import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
    Step 1: Open the browser
    Step 2: enter URL Swiggy
    Step 3: Seach box enter "ahmed"
    Step 4: Select value from dropdown "Ahmedabad Airport(AMD), Hansol, Ahmedabad, Gujaraj, India"
    Step 5: What's on your mind? => Click on Pizza
    Step 6: Right side corner => Click on the filter
    Step 7: Choose Pizzas
    Step 8: Click on the Show Restaurants
    Step 9: Click on the La Milano Pizzeria
    Step 10: Enable Veg only
*/
public class Swiggy {
    public WebDriver driver;

    @BeforeTest
    public void intiationPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void foodOrder() throws InterruptedException {
        String restName = "La Milano Pizzeria";
        driver.get("https://www.swiggy.com");
        //Click on Search box
        WebElement searchBox = driver.findElement(By.id("location"));
        searchBox.sendKeys("ahmed");
        System.out.println("Search is successful");

        driver.findElement(By.xpath("//span[text()='Ahmedabad, Gujarat, India']")).click();
        System.out.println("Ahmedabad City Selected");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        //Dropdown
        WebElement drpdn = driver.findElement(By.xpath("//*[@id='root']/div[1]/header/div/div/div/span[3]"));
        drpdn.click();
        System.out.println("Dropdown open successful");

        Thread.sleep(3000);

        //Send Airport value
        driver.findElement(By.xpath("//*[@id='overlay-sidebar-root']/div/div/div[2]/div/div/div[2]/div[2]/div/input")).sendKeys("Ahmedabad Airport(AMD), Hansol, Ahmedabad, Gujaraj, India");

        System.out.println("Ahmedabad airport is search successfully");

        //Click Airport
        driver.findElement(By.xpath("//div[text()='Ahmedabad Airport (AMD)']")).click();

        System.out.println("Airport address selected successfully");
        Thread.sleep(5000);
        //driver.navigate().refresh();

        //What's on your mind? => Click on Pizza
        System.out.println("What's on your mind? => Click on Pizza");
        WebElement whatsonMindPizza = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='seo-core-layout']/div[2]/div/div[1]/div[2]/div/div[2]/div/div[2]/div/a/div/img"))));
        whatsonMindPizza.click();
        Thread.sleep(5000);

        //Filter
        //driver.findElement(By.xpath("//div[text()='Filter']")).click();

        //Choose Pizzas now not exist
        /*driver.findElement(By.xpath("//*[@id='overlay-sidebar-root']/div/div/div[2]/div/div/div[3]"));
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,900)");
        wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("//*[@id='overlay-sidebar-root']/div/div/div[2]/div/div/div[3]/div[1]/div[2]/label[21]/div/div[1]"))));
        //driver.findElement(By.xpath("//*[@id='overlay-sidebar-root']/div/div/div[2]/div/div/div[3]/div[1]/div[2]/label[21]/div/div[1]")).click();
        driver.findElement(By.xpath("//a[text()='SHOW RESTAURANTS']")).click();
        Thread.sleep(2000);*/

        driver.findElement(By.xpath("//div[text()='La Milano Pizzeria']")).click();
        Thread.sleep(5000);

        String restaurantName = driver.findElement(By.xpath("//div/div[1]/p[text()='La Milano Pizzeria']")).getText();

        if (restName.equalsIgnoreCase(restaurantName))
            System.out.println("We are at correct restaurant");
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}