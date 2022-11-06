import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ACTIVITY4 {
    public static void main (String args[]){
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net");
        String a = driver.getTitle();
        System.out.println("page title is:"+a);
       WebElement cc = driver.findElement(By.xpath("//a[@id='about-link']"));
       cc.click();
        String b = driver.getTitle();
        System.out.println("page title is:"+b);

    }


}
