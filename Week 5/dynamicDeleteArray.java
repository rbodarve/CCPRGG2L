//user inputs the array and deletes until the array is empty

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class dynamicDeleteArray {

    public static void main(String args[]) {  
         
        Scanner myObj= new Scanner(System.in);
        int x, element, origSize;
        String confirm = "Y";
        
        try{
            ArrayList<Integer> array1 = new ArrayList<>();
            while(confirm.equalsIgnoreCase("Y")){
                System.out.println("Array: "+array1);
                System.out.print("Enter number to add to the Array : ");
                array1.add(myObj.nextInt());
                System.out.print("Do you want to continue? Y for Yes. N for No. : ");
                confirm = myObj.next();
                if(!confirm.equalsIgnoreCase("y")&&!confirm.equalsIgnoreCase("n"))
                        throw new YesOrNo();
            }       
            
            while(!array1.isEmpty()){
                System.out.print("New list of elements:");
                System.out.println(array1);
                System.out.print("Enter element to remove:");
                element = myObj.nextInt();
                origSize = array1.size();
                for(x=0;x<array1.size();x++){
                    if(array1.get(x)==element) {
                        array1.remove(x);
                        x--;
                    }
                }
                if(origSize==array1.size()){
                    System.out.println("Error! No score Found!");
                }
                else{
                     System.out.print("New list of elements:");
                     System.out.println(array1);
                }
            }
            System.out.println("No more elements.");
        } catch (InputMismatchException | YesOrNo e) {
            System.out.println("Wrong Input.");
        }
        System.out.println("Program Ends");
        myObj.close();    
    }
    
    private static class YesOrNo extends Exception {
        public YesOrNo() {
        }
    }
}

