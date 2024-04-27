import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();


        String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
        driver.get(url);

        // Locate the element C ve Element D.
        WebElement titleC = driver.findElement(By.xpath("//li[@name='C']"));
        WebElement titleD = driver.findElement(By.xpath("//li[@name='D']"));
        WebElement titleA = driver.findElement(By.xpath("//li[@name='A']"));
        WebElement titleH = driver.findElement(By.xpath("//li[@name='H']"));
        WebElement titleE = driver.findElement(By.xpath("//li[@name='E']"));
        // C elementini D elementinin uzerinde bekletin
        Actions actions = new Actions(driver);
        actions.clickAndHold(titleC).moveToElement(titleD).perform();
        Thread.sleep(4000);
        actions.moveToElement(titleA).perform();
        Thread.sleep(4000);
        actions.moveToElement(titleH).perform();
        Thread.sleep(4000);
        actions.moveToElement(titleE).perform();
        Thread.sleep(4000);

        driver.close();
        System.out.println("Test Passed !!!");



    }


}
