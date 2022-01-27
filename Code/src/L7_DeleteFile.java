import java.io.File;

public class L7_DeleteFile {
    public static void main(String[] args) {
        File newFile = new File("newFolder/newFile.txt");
        if (newFile.delete()) {
            System.out.println("Deleted file: " + newFile.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
        File newFolder = new File("./newFolder");
        if (newFolder.delete()) {
            System.out.println("Delete folder: " + newFolder.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}
