import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class trendyoldeneme {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        Actions actions = new Actions(driver);

        driver.manage().window().maximize();



        //e-postayı gir ve şifreyi gir
        //e-posta : qaseleniummm@gmail.com
        //şifre : X123456..


        //hepsiburada sitesine git
        driver.get("https://www.trendyol.com/giris");

        WebElement mail = driver.findElement(By.id("login-email"));
        WebElement sifre = driver.findElement(By.name("login-password"));
        WebElement loginBtn = driver.findElement(By.xpath("(//button[.=\"Giriş Yap\"])[2]"));


        mail.sendKeys("qaseleniummm@gmail.com");
        Thread.sleep(2000);
        sifre.sendKeys("X123456..");
        Thread.sleep(2000);
        loginBtn.click();
        Thread.sleep(2000);







    }


}
