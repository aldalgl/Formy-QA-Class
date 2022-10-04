import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:/Downloads/SeleniumTraining/chromedriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");

        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        newTabButton.click(); //then use method getwindowhandle to use the original window even the window is switch to another window

        String originalHandle = driver.getWindowHandle();
        //use for loop to be able to iterate two tab and switch back to original tab
        for (String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);//switch to another tab
        }
        //switch to original tab
        driver.switchTo().window(originalHandle);
        driver.quit();
    }
}
