import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class ACTIVITY8ONE {
    public static void main(String[] args) {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get(" https://training-support.net/selenium/tables ");

        //Check the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
       //List<WebElement> rows= driver.findElement(By.xpath("//table[contains(@class,'celled')]/tbody/tr"));
        List<WebElement> cols = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr[1]/td"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class, 'striped')]/tbody/tr"));
        System.out.println("Rows- "+rows.size());
        System.out.println("Columns- "+cols.size());
        List<WebElement> rothree= driver.findElements(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/table/tbody/tr[3]/td"));
        for(WebElement cellvalue:rothree){
            System.out.println(cellvalue.getText());
        }
        System.out.println(driver.findElement(By.xpath("//table[contains(@class,\"striped\")]/tbody/tr[2]/td[2]")).getText());
        driver.close();
    }
}
