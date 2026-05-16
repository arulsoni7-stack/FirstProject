import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test
{

public static void main(String args[])
{
    //System.setProperty("WebDriver.Chrome.driver","src/main/resources/chromedriver.exe");
    System.setProperty("webdriver.chrome.driver", "C:/Users/Arul Kumar/Downloads/chromedriver-win64/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com");
    driver.close();
    driver.quit();
}

}
