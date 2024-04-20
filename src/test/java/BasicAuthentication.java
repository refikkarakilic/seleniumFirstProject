import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthentication {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //driver.get("https://the-internet.herokuapp.com/basic_auth");
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        // HTML komutu : https://username:password@URL


    }


}
