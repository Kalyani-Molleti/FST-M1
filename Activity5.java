import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");

        driver.findElement(By.xpath("//a[text()='My Account']")).click();
        String title = driver.getTitle();
        if(title.equals("My Account – Alchemy LMS")){
            System.out.println("We are on correct page");
            driver.quit();
        }else {
            System.out.println("We are on wrong page");
        }
    }
}
