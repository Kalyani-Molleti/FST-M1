import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class activity5one {

    public static void main(String[] args){
        WebDriver driver =new FirefoxDriver();
      driver.get(" https://training-support.net/selenium/dynamic-controls");
      System.out.println("page title is: "+driver.getTitle());
      boolean x = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input")).isDisplayed();
        System.out.println(x);
        driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]")).click();
        boolean y = driver.findElement(By.xpath("//*[@id=\"dynamicCheckbox\"]/input")).isDisplayed();
        System.out.println(y);

        driver.close();





    }

}
