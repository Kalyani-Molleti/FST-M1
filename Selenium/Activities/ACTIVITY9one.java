import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ACTIVITY9one {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/selenium/selects");
        System.out.println("page title is: "+driver.getTitle());
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"single-select\"]")));
        dropdown.selectByVisibleText("Option 2");
        System.out.println("selected option is:"+dropdown.getFirstSelectedOption().getText());
        dropdown.selectByIndex(3);
        System.out.println("selected option is:"+dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("4");
        System.out.println("selected option is:"+dropdown.getFirstSelectedOption().getText());
        List<WebElement> options = dropdown.getOptions();
        for(WebElement option:options){
            System.out.println("all options are:" +option.getText());
        }

        driver.close();

    }
}
