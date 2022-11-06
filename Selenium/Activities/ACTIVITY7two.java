import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ACTIVITY7two {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(" https://training-support.net/selenium/dynamic-attributes");
        System.out.println("page title is: " + driver.getTitle());
        driver.findElement(By.xpath("(//*[@id=\"dynamic-attributes-form\"]/div/div[1]/input)[2]")).sendKeys("kalyani");

        driver.findElement(By.xpath("(//*[@id=\"dynamic-attributes-form\"]/div/div[2]/input)[2]")).sendKeys("molleti");

        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[3]/input")).sendKeys("molleti");

        driver.findElement(By.xpath("//*[@id=\"dynamic-attributes-form\"]/div/div[4]/input")).sendKeys("molleti.kalyani07@gmail.com");

        driver.findElement(By.xpath("(//*[@id=\"dynamic-attributes-form\"]/div/button)[2]")).click();
        WebElement welcome = driver.findElement(By.xpath("//*[@id=\"action-confirmation\"]"));
        wait.until(ExpectedConditions.visibilityOf(welcome));
        System.out.println("welcome msg: "+welcome.getText());
        driver.close();





    }
}
