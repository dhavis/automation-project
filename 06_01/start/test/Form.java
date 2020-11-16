import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", "F:/LinkedinLearning/Chromedriver86/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        driver.findElement(By.id("first-name")).sendKeys("John");
        driver.findElement(By.id("last-name")).sendKeys("Doe");
        driver.findElement(By.id("job-title")).sendKeys("Skier");
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.id("checkbox-1")).click();
        driver.findElement(By.id("select-menu")).click();
        driver.findElement(By.cssSelector("option[value='4']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("03/03/2020");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();


        driver.quit();
    }
}

