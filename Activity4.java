

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

    public class Activity4{
        public static void main(String[] args) {

                WebDriver driver = new FirefoxDriver();
                driver.get("https://alchemy.hguy.co/lms");

                String title = driver.findElement(By.xpath("(//h3[@class='entry-title'])[2]")).getText();
                if (title.equals("Email Marketing Strategies")) {
                    System.out.print("Text is correct "+title);
                    driver.close();
                } else {
                    System.out.print("Text is not correct");
                }
            }

        }

