import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Datepicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:/LinkedinLearning/Chromedriver86/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/datepicker");

        WebElement datefield = driver.findElement(By.id("datepicker"));
        datefield.sendKeys("03/03/2021");
        datefield.sendKeys(Keys.RETURN);

        Thread.sleep(1000);
        driver.quit();
    }
}