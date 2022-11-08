import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity7 {
    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");

        driver.findElement(By.xpath("//a[text()='All Courses']")).click();

        List<WebElement> courses =driver.findElements(By.xpath("(//a[@role='button'])"));
        System.out.println("The number of courses on the page: " +courses.size());
        driver.quit();
    }
}
