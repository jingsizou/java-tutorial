import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class L7_FileHandler {
    public static void main(String[] arga) {
        // 创建文件
        File newFile = new File("newFile.txt");
        try {
            // 必须加IO异常处理
            newFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 写入文件
        try {
            FileWriter writer = new FileWriter("newFile.txt");
            writer.write("Hello World!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
