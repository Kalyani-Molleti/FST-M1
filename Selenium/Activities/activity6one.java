import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity6one {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("page title is: "+driver.getTitle());
        WebElement u = driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]"));
        u.click();
        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        u.click();
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        checkbox.click();
        Thread.sleep(5000);





        driver.close();
    }

}
