import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest_Class {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("merhaba");

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.tr/");

        Thread.sleep(3000);

        driver.findElement(By.id("sp-cc-rejectall-link")).click();

        driver.findElement(By.name("field-keywords")).sendKeys("iphone 15", Keys.ENTER);

        String aramaSonucuText =
                driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span)[1]")).getText() +
                driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span)[3]")).getText();
        System.out.println("Arama Sonucu : " + aramaSonucuText);

        if (aramaSonucuText.contains("iphone 15"))
        {
            System.out.println("arama sonucu iphone 15 içeriyor");
        }
        else System.out.println("arama sonucu iphone 15 içermiyor");

        System.out.println(" ilk ürün fiyatı : " + driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]")).getText());

    }

}
