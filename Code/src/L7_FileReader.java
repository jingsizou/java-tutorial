import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class L7_FileReader {
    public static void main(String[] args) {
        // 读取文件内容
        try {
            File myFile = new File("newFile.txt");
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // 获取文件信息
        File newFile = new File("newFile.txt");
        if (newFile.exists()) {
            System.out.println("File name: " + newFile.getName());
            System.out.println("Absolute path: " + newFile.getAbsolutePath());
            System.out.println("Writeable: " + newFile.canWrite());
            System.out.println("Readable: : " + newFile.canRead());
            System.out.println("File size in bytes: : " + newFile.length());
        } else {
            System.out.println("The file does not exist");
        }
    }
}
