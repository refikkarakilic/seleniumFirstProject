import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_03 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts ");

        WebElement alertButton3 = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        WebElement result = driver.findElement(By.id("result"));

        alertButton3.click();

        driver.switchTo().alert().sendKeys("Refik Karakılıç");
        Thread.sleep(2000);
        // JS Alert icinde bulunan box icine veri girmek icin sendKeys() methodunu kullanırız
        Thread.sleep(5000);
        driver.switchTo().alert().accept();

        String expectedResult = "You entered: Refik Karakılıç";
        String actualResult = result.getText();

        if(actualResult.equals(expectedResult)){
            System.out.println("Test 3 Passed");
        }

        Thread.sleep(2000);
        driver.close();


    }

}
