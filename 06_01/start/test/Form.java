import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:/Downloads/SeleniumTraining/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");
        //Text-fields
        driver.findElement(By.id("first-name")).sendKeys("Alda");
        driver.findElement(By.id("last-name")).sendKeys("LG");
        driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
        //RadioButton
        driver.findElement(By.id("radio-button-2")).click();
        //CheckBox
        driver.findElement(By.id("checkbox-2")).click();
        //DropDownMenu
        driver.findElement(By.cssSelector("option[value='1']")).click();
        //Date
        driver.findElement(By.id("datepicker")).sendKeys("17/09/2022");
        driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
        //Button
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();

        driver.quit();
    }
}
