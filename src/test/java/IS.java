import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IS {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        Actions actions = new Actions(driver);


        //hepsiburada sitesine git
        driver.get("https://www.hepsiburada.com/");
        //çerezleri reddet
        driver.findElement(By.xpath("//a[.='Reddet']")).click();
        Thread.sleep(2000);

        // sağ üstte giriş yap veya üye ol kısmında fareyi beklet
        WebElement girisYapElement = driver.findElement(By.id("myAccount"));
        actions.moveToElement(girisYapElement).perform();
        Thread.sleep(2000);

        //fare beklerken çıkan pencerede giriş yapa tıkla
        driver.findElement(By.id("login")).click();
        Thread.sleep(2000);

        //e-postayı gir ve şifreyi gir
        //e-posta : qaseleniummm@gmail.com
        //şifre : X123456..

        WebElement emailelement = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement sifreElement = driver.findElement(By.name("password"));
        WebElement loginButton  = driver.findElement(By.id("btnLogin"));

        emailelement.sendKeys("qaseleniummm@gmail.com");
        sifreElement.sendKeys("X123456..");
        loginButton.click();






//
















    }



}
