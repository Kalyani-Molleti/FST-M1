import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

        import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

        public class Activity9 {
            public static void main(String args[]) throws InterruptedException {

                WebDriver driver = new FirefoxDriver();
                driver.get("https://alchemy.hguy.co/lms");
                driver.findElement(By.xpath("//a[text()='My Account']")).click();

                driver.findElement(By.xpath("//a[@href='#login']")).click();

                driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
                driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");

                driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
                driver.findElement(By.xpath("//a[text()='All Courses']")).click();
                driver.findElement(By.xpath("(//a[@role='button'])[1]")).click();

                driver.findElement(By.xpath("(//div[@class='ld-item-title'])[1]")).click();

                String title =driver.getTitle();
                System.out.println(title);
                driver.close();
            }
        }



