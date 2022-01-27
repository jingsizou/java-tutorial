import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class L7_Practise {
    /*
    * 需要try catch：
    * （1）File 中 createNewFile需要try catch
    * （2）WriteFile
    * （3）scanner
    * */
    public static void createOrDeleteFile(String fileName, boolean createOrDelete) {
        File newFile = new File(fileName);
        if (createOrDelete) {
            // create file
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                System.out.println(e);
            }
        } else {
            // delete file
            if (newFile.delete()) {
                System.out.println("Deleted file: " + newFile.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        }
    }

    public static void writeToFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static String readFile(String fileName) {
        File newFile = new File(fileName);
        String content = "";
        try {
            Scanner scanner = new Scanner(newFile);
            while (scanner.hasNext()) {
                content = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static void main (String[] args) {
        String filename = "myFile.txt";
        L7_Practise.createOrDeleteFile(filename, true);
        L7_Practise.writeToFile(filename, "Hello World");
        System.out.println(L7_Practise.readFile(filename));
        L7_Practise.createOrDeleteFile(filename, false);
    }
}
