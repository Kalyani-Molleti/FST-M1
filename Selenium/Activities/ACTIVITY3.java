import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ACTIVITY3  {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://training-support.net/selenium/simple-form");
        String a = driver.getTitle();
        System.out.println("title is: "+a);
        driver.findElement(By.id("firstName")).sendKeys("kalyani");
        driver.findElement(By.id("lastName")).sendKeys("MOLLETI");
        driver.findElement(By.id("email")).sendKeys("molleti.kalyani07@gmail.com");
        driver.findElement(By.id("number")).sendKeys("9875245897");
       Thread.sleep(300);
        driver.findElement(By.className("green")).click();
        Thread.sleep(300);
        driver.close();

    }
    }