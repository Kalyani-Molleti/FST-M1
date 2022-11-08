
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get("https://alchemy.hguy.co/lms");

        String title = driver.findElement(By.xpath("(//h1[@class='uagb-ifb-title'])[1]")).getText();
        if (title.equals("Learn from Industry Experts")) {
            System.out.print("Text is correct "+title);
            driver.close();
        } else {
            System.out.print("Text is not correct");
        }

    }
}

