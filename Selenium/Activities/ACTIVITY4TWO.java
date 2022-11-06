import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ACTIVITY4TWO {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get(" https://training-support.net/selenium/simple-form");

        //Check the title of the page
        String title = driver.getTitle();
        //Print the title of the page
        System.out.println("Page title is: " + title);
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("alkalinity");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("motile");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kal@gmail");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("4578996443");
        driver.findElement(By.xpath("//input[@type='submit']")).click();



    }
}
