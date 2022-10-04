import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:/Downloads/SeleniumTraining/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name")); //then use method move to element provide action class
        Actions actions = new Actions(driver);
        actions.moveToElement(name);
        name.sendKeys("Alda LG");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("17/09/2020");

        driver.quit();
    }
}
