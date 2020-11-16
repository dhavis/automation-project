import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Checkboxes {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:/LinkedinLearning/Chromedriver86/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/checkbox");

        //checkbox 1
        WebElement checkbox1 = driver.findElement(By.id("checkbox-1"));
        checkbox1.click();
        Thread.sleep(1000);

        //checkbox 2
        WebElement checkbox2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
        checkbox2.click();
        Thread.sleep(1000);

        //checkbox 3
        WebElement checkbox3 = driver.findElement(By.xpath("//*[@id=\"checkbox-3\"]"));
        checkbox3.click();
        Thread.sleep(1000);


        driver.quit();
    }
}






