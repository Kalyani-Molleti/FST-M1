import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class activity6two {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/ajax");
        System.out.println("page title is: " + driver.getTitle());
        driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/button")).click();


      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"ajax-content\"]/h1"),"HELLO!"));
        WebElement hello =  driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/h1"));
        System.out.println(" hello text: "+hello.getText());

       wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"ajax-content\"]/h3"),"I'm late!"));
        WebElement late =  driver.findElement(By.xpath("//*[@id=\"ajax-content\"]/h3"));

        System.out.println(" late text: "+late.getText());
        driver.close();




    }

    }
