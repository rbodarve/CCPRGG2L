import java.util.Scanner;
public class threeSumAvePro {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double x, y, z;

        System.out.print("Enter three numbers: ");
        x = myObj.nextInt();
        y = myObj.nextInt();
        z = myObj.nextInt();
        System.out.println("The sum is " + (x+y+z));
        System.out.println("The average is " + (x*y*z)/3);
        System.out.println("The product is " + (x*y*z));
    }
}
