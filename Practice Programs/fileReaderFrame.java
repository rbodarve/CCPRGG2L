import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class fileReaderFrame {
    public static void main(String[] args) {
      // Create a frame to our specifications
      JFrame frame = createFrame("File Reader");

      // Read in words from a file
      ArrayList<String> words = readFile("words.txt");
      ArrayList<String> alphWords = (ArrayList<String>)words.clone();
      Collections.sort(alphWords);
      // Add text to the frame
      populate(words, alphWords, frame);

      // Size and set visible
      display(frame);
   }

   public static void display(JFrame frame) {
      // Size the frame
      frame.pack();

      // Show it
      frame.setVisible(true);
   }
   public static void populate(ArrayList<String> words, ArrayList<String> alphWords, JFrame frame) {
      for(int i = 0; i < words.size(); i++) {
          String item = words.get(i);
          frame.add(new JLabel(item));
          item = alphWords.get(i);
          frame.add(new JLabel(item));

          // Force new lines
          frame.add(new JPanel());
          frame.add(new JPanel());
      }
   }

   public static JFrame createFrame(String name) {
      // Create the frame
      JFrame frame = new JFrame(name);

      // Make it decorarted
      JFrame.setDefaultLookAndFeelDecorated(true);

      // Make it grid-based
      // 1 row, 2 columns
      frame.setLayout(new GridLayout(0, 2));

      // Don't resize
      frame.setResizable(false);

      // Set what happens when the frame closes
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      return frame;
   }

   public static ArrayList<String> readFile(String filename) {

      try{
         // Scan contents of a stream
         BufferedReader in = new BufferedReader(new FileReader(filename));

         ArrayList<String> stream = new ArrayList<>();

         String currentLine;
         while((currentLine = in.readLine()) != null) {
            // Add contents of stream to a list
            stream.add(currentLine);
         }

         // Return the list
         return stream;
      } catch (IOException e) {
      }

      return null;
   }
}
