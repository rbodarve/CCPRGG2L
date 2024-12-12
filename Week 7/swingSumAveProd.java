import javax.swing.JOptionPane;

public class swingSumAveProd {
    public static void main (String[] args){
        int num1, num2, num3;
        String input;

        //accept user input
        input = JOptionPane.showInputDialog("Please enter integer 1.");
        num1 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Please enter integer 2.");
        num2 = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Please enter integer 3.");
        num3 = Integer.parseInt(input);

        //calculate sum,product,average
        int sum = (num1 + num2 + num3);
        int product = (num1 * num2 * num3);
        double average = (sum / 3.0);

        //calculate largest using math.max function
        int largest = Math.max(num1, Math.max(num2, num3));
        //calculate smallest number using math.max function
        int smallest = Math.min(num1, Math.min(num2, num3));

        String avg = String.format("%.2f",average);
        JOptionPane.showMessageDialog(null, "sum = " + 
                sum + "\nproduct = " + product + "\naverage = " + 
                avg + "\nSmallest = " + smallest + "\nLargest = " + largest);

    }
}
