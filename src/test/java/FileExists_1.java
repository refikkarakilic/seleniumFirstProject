import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExists_1 {

    public static void main(String[] args) {


        // C:\Users\rfkkr\OneDrive\Masaüstü\Test\deneme.txt

        String dosyaYolu = System.getProperty("user.home")+"\\OneDrive\\Masaüstü\\Test\\deneme.txt";

        Boolean result = Files.exists(Paths.get(dosyaYolu));

        if (result)
        {
            System.out.println("test passed ...");
        }
        else System.out.println("test failed ...");










//        System.out.println(System.getProperty("user.dir"));//C:\Users\rfkkr\IdeaProjects\
//        System.out.println(System.getProperty("user.home"));//C:\Users\rfkkr



    }


}
