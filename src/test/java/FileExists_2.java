import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExists_2 {

    public static void main(String[] args) {

        String dosyaYolu = System.getProperty("user.dir")+"//pom.xml";

        Boolean result = Files.exists(Paths.get(dosyaYolu));

        if (result)
        {
            System.out.println("test passed");
        }
        else System.out.println("test failed");




    }


}
