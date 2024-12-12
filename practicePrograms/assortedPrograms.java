import javax.swing.JOptionPane;

public class assortedPrograms {
    public static void main(String[] args){ 
	while(true){ 
            try{
                String initial, arithmetic; 
        	int choice, choose1; 
		JOptionPane.showMessageDialog(null, 
                        "Welcome to MyApplication"); 
                initial = JOptionPane.showInputDialog(null, 
                        """
                        1. Arithmetic Operation
                        2. Even or Odd Number
                        3. Shopping Discount
                        4. Student Grading
                        5. Exit
                        """); 
		choice = Integer.parseInt(initial); 

                switch (choice){ 
                    case 1 -> {
                        arithmetic = JOptionPane.showInputDialog(
                                null, 
                                """
                                1. Addition
                                2. Subtraction
                                3. Multiplication
                                4. Division
                                """);
                        choose1 = Integer.parseInt(arithmetic);
                        switch (choose1) {
                            case 1 -> {
                                String addA = JOptionPane.showInputDialog(null, "Input first number");
                                int add1 = Integer.parseInt(addA);
                                String addB = JOptionPane.showInputDialog(null, "Input second number");
                                int add2 = Integer.parseInt(addB);
                                int addResult = add1 + add2;
                                JOptionPane.showMessageDialog(null, "The answer is " + addResult);
                            }
                            case 2 -> {
                                String subA = JOptionPane.showInputDialog(null, "Input first number");
                                int sub1 = Integer.parseInt(subA);
                                String subB = JOptionPane.showInputDialog(null, "Input second number");
                                int sub2 = Integer.parseInt(subB);
                                int subResult = sub1 - sub2;
                                JOptionPane.showMessageDialog(null, "The answer is " + subResult);
                            }
                            case 3 -> {
                                String mulA = JOptionPane.showInputDialog(null, "Input first number");
                                int mul1 = Integer.parseInt(mulA);
                                String mulB = JOptionPane.showInputDialog(null, "Input second number");
                                int mul2 = Integer.parseInt(mulB);
                                int mulResult = mul1 * mul2;
                                JOptionPane.showMessageDialog(null, "The answer is " + mulResult);
                            }
                            case 4 -> {
                                String divA = JOptionPane.showInputDialog(null, "Input first number");
                                int div1 = Integer.parseInt(divA);
                                String divB = JOptionPane.showInputDialog(null, "Input second number");
                                int div2 = Integer.parseInt(divB);
                                int divResult = div1 / div2;
                                JOptionPane.showMessageDialog(null, "The answer is " + divResult);
                            }
                        }
                    }
                    case 2 -> {
                        String eo = JOptionPane.showInputDialog(null,"Input the number to check");
                        int check = Integer.parseInt(eo);
                        if(check % 2 == 0)
                            JOptionPane.showMessageDialog(null,"The number "+check+" is even");
                        else
                            JOptionPane.showMessageDialog(null,"The number "+check+" is odd");
                    }
                    case 3 -> {
                        String shopping = JOptionPane.showInputDialog(null,"Enter your total shopping amount");
                        int discount = Integer.parseInt(shopping);
                        if((discount >= 500000) && (discount <= 1000000)){
                            int finalAmount = discount * 5 / 100;
                            int price = discount - finalAmount;
                            JOptionPane.showMessageDialog(null,"You get a 5% discount");
                            JOptionPane.showMessageDialog(null,"Your total shopping amount is "+price);
                        }
                        else if((discount > 1000000) && (discount <= 1500000)){
                            int finalAmount = discount * 10 / 100;
                            int price = discount - finalAmount;
                            JOptionPane.showMessageDialog(null,"You get a 10% discount");
                            JOptionPane.showMessageDialog(null,"Your total shopping amount is "+price);
                        }
                        else if((discount > 1500000) && (discount < 2000000)){
                            int finalAmount = discount * 15 / 100;
                            int price = discount - finalAmount;
                            JOptionPane.showMessageDialog(null,"You get a 15% discount");
                            JOptionPane.showMessageDialog(null,"Your total shopping amount is "+price);
                        }
                        else if(discount >= 2000000){
                            int finalAmount = discount * 25 / 100;
                            int price = discount - finalAmount;
                            JOptionPane.showMessageDialog(null,"You get a 25% discount");
                            JOptionPane.showMessageDialog(null,"Your total shopping amount is "+price);
                        }
                        else if(discount >= 0)
                            JOptionPane.showMessageDialog(null,"Your total shopping amount is "+discount);
                        else
                            JOptionPane.showMessageDialog(null,"Value cannot be negative");
                    }
                    case 4 -> {
                        String name = JOptionPane.showInputDialog(null,"Enter student's name");
                        String age = JOptionPane.showInputDialog(null,"Enter student's age");
                        int studentAge = Integer.parseInt(age);
                        if(studentAge >= 0)
                            JOptionPane.showMessageDialog(null,"The student's name is "+name+" and is "+studentAge+" years old");
                        else
                            JOptionPane.showMessageDialog(null,"Age cannot be negative");
                    }
                    case 5 -> {
                        JOptionPane.showMessageDialog(null, "Program will exit");
                        System.exit(0);
                    }
		}
            }catch(NumberFormatException ex){ 
		JOptionPane.showMessageDialog(null, "Input error occurred", "Error", JOptionPane.ERROR_MESSAGE); 
            } 
	} 
    } 
}
