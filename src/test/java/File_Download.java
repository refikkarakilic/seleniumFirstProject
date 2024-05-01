import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Files;
import java.nio.file.Paths;

public class File_Download {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // https://the-internet.herokuapp.com/download URL'e gidin
        String url = "https://the-internet.herokuapp.com/download";
        driver.get(url);
        Thread.sleep(2000);
        // resim.jpeg dosyasını indirin
        WebElement resimElement = driver.findElement(By.xpath("//a[.='Jpeg_with_exif.jpeg']"));
        resimElement.click();
        Thread.sleep(3000);
        // Jpeg_with_exif.jpeg dosyasının indirildigini kontrol edin
        //C:\Users\rfkkr\Downloads\Jpeg_with_exif.jpeg

        String dosyaYolu = System.getProperty("user.home")+"\\Downloads\\Jpeg_with_exif.jpeg";
        Boolean result = Files.exists(Paths.get(dosyaYolu));
        if(result){
            System.out.println("Test Passed ...");
        }else {
            System.out.println("Test Failed... ");
        }

        // Browser'i kapatin
        driver.close();




    }



}
