import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String args[]) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");

        driver.findElement(By.xpath("//a[text()='My Account']")).click();
        String title = driver.getTitle();
        if(title.equals("My Account – Alchemy LMS")){
            System.out.println("We are on correct page");
        }else {
            System.out.println("We are on wrong page");
        }
        driver.findElement(By.xpath("//a[text()='Login']")).click();



        WebElement username = driver.findElement(By.xpath("//input[@id='user_login']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='user_pass']"));

        username.sendKeys("root");
        password.sendKeys("pa$$w0rd");

        driver.findElement(By.xpath("//input[@id='wp-submit']")).click();

        WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
        if(logout.isDisplayed())
        {
            System.out.println("You have successfully Logged In");
            driver.quit();
        }else{
            System.out.println("Not able to login");
        }


    }
}


