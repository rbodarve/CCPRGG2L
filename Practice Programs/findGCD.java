import java.util.Scanner;

public class findGCD {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = myObj.nextInt();
        System.out.print("Enter second number: ");
        int b = myObj.nextInt();
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));   
    }   
    //recursive function to return gcd of a and b   
    static int gcd(int a, int b){   
        // Everything divides 0   
        if (b == 0)   
            return a;   
        return gcd(b, a % b);   
    }
}
