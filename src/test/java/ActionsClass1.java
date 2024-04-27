import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // amazon ana sayfa ya gidin
        driver.get("https://www.amazon.com.tr/");
        Thread.sleep(2000);

        //çerezleri reddet

        driver.findElement(By.id("sp-cc-rejectall-link")).click();

        // sag ustte :merhaba giriş yapın elementinin uzerinde mouse'u bekletin
        Actions actions = new Actions(driver);
        WebElement helloTextElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        actions.moveToElement(helloTextElement).perform();

        Thread.sleep(3000);

        // acilan menu de liste oluşturun linkine tiklayin
        WebElement creatAListText = driver.findElement(By.xpath("//span[.=\'Liste Oluşturun\']"));
        actions.click(creatAListText).perform();
        // ve liste oluşturun sayfasinin acildigini test edin
        String expectedResult = "https://www.amazon.com/hz/wishlist/intro";
        String actualResult = driver.getCurrentUrl();
        if(expectedResult.equals(actualResult)){
            System.out.println("Test Passed !!!!");

        }
        Thread.sleep(1000);
        //driver.close();




    }


}
