import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class ACTIVITY8two {
    public static void main(String[] args) throws InterruptedException {

        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //And now use this to visit the website
        driver.get(" https://training-support.net/selenium/tables ");

        //Check the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        //List<WebElement> rows= driver.findElement(By.xpath("//table[contains(@class,'celled')]/tbody/tr"));
        List<WebElement> cols = driver.findElements(By.xpath("//table[@id=\"sortableTable\"]/tbody/tr[1]/td"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id=\"sortableTable\"]/tbody/tr"));
        System.out.println("Rows- "+rows.size());
        System.out.println("Columns- "+cols.size());

      WebElement secondrowvalue=  driver.findElement(By.xpath("//table[@id=\"sortableTable\"]/tbody/tr[2]/td[2]"));
      System.out.println("before sort cell value = "+secondrowvalue.getText());
      driver.findElement(By.xpath("//table[@id=\"sortableTable\"]/thead/tr[1]/th[1]")).click();
      Thread.sleep(3000);
        System.out.println("after sort cell value = "+driver.findElement(By.xpath("//table[@id=\"sortableTable\"]/tbody/tr[2]/td[2]")).getText());

        WebElement footer= driver.findElement(By.xpath("//table[@id=\"sortableTable\"]/tfoot/tr"));

        System.out.println("footerval is:"+footer.getText());
        driver.close();
    }
}
