import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class FileUpload {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:/LinkedinLearning/Chromedriver86/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/fileupload");

        WebElement fileUploadField = driver.findElement(By.id("file-upload-field"));
        fileUploadField.sendKeys("F:\\LinkedinLearning\\selenium-essntial-training\\Ex_Files_Selenium_EssT\\Exercise Files\\04_05\\start\\test\\file-to-upload.png");
        fileUploadField.sendKeys(Keys.RETURN);

        Thread.sleep(1000);

        driver.quit();
    }
}
