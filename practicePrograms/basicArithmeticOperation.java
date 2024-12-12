
import java.awt.*;
import java.awt.event.*;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class basicArithmeticOperation extends JFrame{
    private JPanel panel1, panel2;
    private JRadioButton addition, multiplication, subtraction, division;
    private JTextField input1, input2;
    private JButton answer, reset;
    private ButtonGroup group;

    public basicArithmeticOperation(){

    	super("Basic Arithmetic Operation: +,-,*,/");
    	setSize(475,100);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    	addition = new JRadioButton("Addition[+]",false);
    	multiplication = new JRadioButton("Multiplication[x]",false);
    	subtraction = new JRadioButton("Subtraction[-]",false);
    	division = new JRadioButton("Division[/]",false);

	panel1 = new JPanel();
	panel1.setLayout(new GridLayout(1,4)); 

	panel1.add(addition);
	panel1.add(multiplication);
	panel1.add(subtraction);
	panel1.add(division);

        group = new ButtonGroup();
	group.add(addition);
	group.add(multiplication);
	group.add(subtraction);
	group.add(division);		

        panel2 = new JPanel();
    	panel2.setLayout(new GridLayout(1,4)); 

        input1 = new JTextField(20);
    	input2 = new JTextField(20);

    	answer = new JButton("Show Answer");
    	reset = new JButton("Reset");

    	panel2.add(input1);
    	panel2.add(input2);
    	panel2.add(answer);
    	panel2.add(reset);

    	Container pane = getContentPane();
    	setContentPane(pane);
        GridLayout grid = new GridLayout(2,1);
    	pane.setLayout(grid);

        answer.addActionListener((ActionEvent event) -> {
            if (addition.isSelected() == false &&
                multiplication.isSelected() == false &&
                subtraction.isSelected() == false && 
                division.isSelected() == false){
                    JOptionPane.showMessageDialog(null, 
                            "Please Select an Arithmetic Operator",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);       
            }
            if(addition.isSelected()==true){
                try{
                    int a = Integer.parseInt(input1.getText());
                    int b = Integer.parseInt(input2.getText());
                    int ans = a+b; 
                    JOptionPane.showMessageDialog(null, 
                            "The Answer is: "+ans,"Answer:",
                            JOptionPane.INFORMATION_MESSAGE); 
                } catch (NumberFormatException e){ 
                    JOptionPane.showMessageDialog(null, 
                            "Please Input a Integer","Error",
                            JOptionPane.ERROR_MESSAGE); 
                } 
            }            
            if(multiplication.isSelected()==true){
                try{
                    int a = Integer.parseInt(input1.getText());
                    int b = Integer.parseInt(input2.getText());
                    int ans = a*b;
                    JOptionPane.showMessageDialog(null, 
                            "The Answer is: "+ans,"Answer:",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, 
                            "Please Input a Integer","Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            if(subtraction.isSelected()==true){
                try{
                    int a = Integer.parseInt(input1.getText());
                    int b = Integer.parseInt(input2.getText());
                    int ans = a-b;
                    JOptionPane.showMessageDialog(null, 
                            "The Answer is: "+ans,"Answer:",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, 
                            "Please Input a Integer","Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
            if(division.isSelected()==true){
                try{
                    int a = Integer.parseInt(input1.getText());
                    int b = Integer.parseInt(input2.getText());
                    int ans = a/b;
                    JOptionPane.showMessageDialog(null, 
                            "The Answer is: "+ans,"Answer:",
                            JOptionPane.INFORMATION_MESSAGE);
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, 
                            "Please Input a Integer","Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        reset.addActionListener((ActionEvent event) -> {
            input1.setText(null);
            input2.setText(null);
        });

    	pane.add(panel1);
    	pane.add(panel2);

    	setVisible(true);
    	setResizable(false);
    }
    
    public static void main (String[] args){
        basicArithmeticOperation bao = new basicArithmeticOperation();
    }
}
