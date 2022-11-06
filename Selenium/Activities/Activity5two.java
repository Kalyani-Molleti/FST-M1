import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5two {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/dynamic-controls");
        System.out.println("page title is: "+driver.getTitle());
       WebElement b= driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input"));

        System.out.println("check box is "+b.isSelected());
        b.click();
        System.out.println("check box is "+b.isSelected());

        driver.close();

    }
}
