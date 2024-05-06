import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

        String url = "https://www.trendyol.com/";
        driver.get(url);

        //çerezleri reddet
        driver.findElement(By.id("rejectAllButton")).click();

        WebElement girisYapElement = driver.findElement(By.xpath("//p[.=\"Giriş Yap\"]"));

        actions.moveToElement(girisYapElement).perform();
        Thread.sleep(2000);

        // login ekranına git
        driver.findElement(By.xpath("(//div[.=\"Giriş Yap\"])[2]")).click();

        //login ol

        //e-postayı gir ve şifreyi gir
        //e-posta : qaseleniummm@gmail.com
        //şifre : X123456..

        WebElement mail = driver.findElement(By.id("login-email"));
        WebElement sifre = driver.findElement(By.name("login-password"));
        WebElement loginBtn = driver.findElement(By.xpath("(//button[.=\"Giriş Yap\"])[2]"));


        mail.sendKeys("qaseleniummm@gmail.com");
        Thread.sleep(2000);
        sifre.sendKeys("X123456..");
        Thread.sleep(2000);
        loginBtn.click();
        Thread.sleep(2000);

        // arama kısmına iphone 15 yaz ve arat

        WebElement search = driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));

        search.sendKeys("iphone 15", Keys.ENTER);

        Thread.sleep(2000);

        driver.close();


















    }


}
