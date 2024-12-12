import java.util.Scanner;

public class distCoordinates {

    public static void main(String args[]) {
        
        Scanner myObj = new Scanner(System.in);
        double x1,x2,y1,y2,result;
        System.out.println("Program to detemine the distance of two coordinates ");
        System.out.print("Enter the first coordinate: ");
        x1 = myObj.nextInt();
        y1 = myObj.nextInt();
        System.out.print("Enter the second coordinate: ");
        x2 = myObj.nextInt();
        y2 = myObj.nextInt();
        
        result = Math.sqrt(Math.pow((x2-x1), 2)+(Math.pow((y2-y1), 2)));
        
        System.out.printf("Distance: %.4f %n", result);
    }
}
