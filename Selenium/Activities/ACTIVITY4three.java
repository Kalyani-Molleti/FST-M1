import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ACTIVITY4three {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get(" https://www.training-support.net/selenium/target-practice");

        //Check the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
      String thn =  driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
        System.out.println("THIRD header  is: " + thn);
        String fh =  driver.findElement(By.xpath("//h5[contains(@class,'green')]")).getCssValue("color").toString();
        System.out.println("fifth  header color is: " + fh);
        String violetbutton = driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class");
        System.out.println(" vb class  attributes: " + violetbutton);
        String gray = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();

        System.out.println(" graystr: " + gray);
        driver.close();

    }
}

