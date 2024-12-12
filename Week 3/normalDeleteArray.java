import java.util.ArrayList;
import java.util.Scanner;

public class normalDeleteArray {
    public static void main(String args[]) {   
        Scanner myObj= new Scanner(System.in);
        int x, element, origSize;
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(13);array1.add(15);array1.add(15);array1.add(11);
        array1.add(23);array1.add(34);array1.add(14);array1.add(20);
        array1.add(20);array1.add(20);array1.add(20);array1.add(20);
        System.out.println("Program to delete elements of an array.");
        System.out.println("Given array: "+array1);

        while(!array1.isEmpty()){
            System.out.print("Enter number to delete:");
            element = myObj.nextInt();                   
            origSize = array1.size();                   
            for(x=0;x<array1.size();x++){               
                if(array1.get(x)==element) {       
                   array1.remove(x);               
                   x--;                                 
               }
            }
            if(origSize==array1.size()){                
                System.out.println("Error! No Element Found!");
            }
            else{
                System.out.print("New list:");
                System.out.println(array1);
            }
        } 
        System.out.println("The list of numbers is empty.");
        System.out.println("Program Ends");
        myObj.close();
    }
}
