import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String args[]) throws Exception
    {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://alchemy.hguy.co/lms");

        String title= driver.getTitle();
        System.out.println(title);
        if(title.equals("Alchemy LMS – An LMS Application"))
        {
            System.out.println("User get Expected page title");
            driver.close();
        }
        else
        {
            System.out.println("Page title is not correct "+title);
        }
    }
}
