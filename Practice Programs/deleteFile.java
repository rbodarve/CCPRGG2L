import java.io.File;

public class deleteFile {
    public static void main(String[] args) { 
    File myObj = new File("C:\\Users\\USER\\Downloads\\sample.txt"); 
    if (myObj.delete()) { 
      System.out.println("Deleted the file: " + myObj.getName());
    } else {
      System.out.println("Failed to delete the file.");
    } 
  } 
}
