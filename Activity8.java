
    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class Activity8 {
        public static void main(String args[]) {
            WebDriver driver = new FirefoxDriver();
            driver.get("https://alchemy.hguy.co/lms");

            driver.findElement(By.xpath("//a[text()='Contact']")).click();

            WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
            WebElement name = driver.findElement(By.xpath("//input[@id='wpforms-8-field_0']"));
            WebElement subject = driver.findElement(By.xpath("//input[@id='wpforms-8-field_3']"));
            WebElement comment = driver.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']"));

            name.sendKeys("Ekta Dutt");
            email.sendKeys("ektad@gmail.com");
            subject.sendKeys("Selenium");
            comment.sendKeys("Message");

            driver.findElement(By.xpath("//button[@type='submit']")).click();

            String message = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p")).getText();
            System.out.println("The message displayed after submission:" +message);
            driver.quit();

        }
    }

