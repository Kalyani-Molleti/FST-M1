import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ACTIVITY5THREE {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("page title is: "+driver.getTitle());
        WebElement b= driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
        System.out.println(b.isEnabled());

         driver.findElement(By.xpath("//*[@id=\"toggleInput\"]")).click();
        System.out.println(b.isEnabled());



driver.close();
    }

}
