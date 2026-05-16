import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test
{

public static void main(String args[])
{
    System.setProperty("Webdriver.Chrome.driver","src/main/resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    driver.close();
    driver.quit();
}

}
