import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class secondTest_class {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //amazon web sayfasına gidin

        driver.get("https://www.amazon.com.tr/");

        //çerezleri reddet

        driver.findElement(By.id("sp-cc-rejectall-link")).click();


        // search kutusuna "laptop" yazıp aratın

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("laptop");
        searchBox.submit();


        // karşınıza gelen ilk ürün resmine tıklayın

        WebElement firstPicture = driver.findElement(By.xpath("(//img[@class=\"s-image\"])[1]"));
        firstPicture.click();

        // 2 saniye bekletip driverı kapatın
        Thread.sleep(2000);

        driver.quit();
    }
}
