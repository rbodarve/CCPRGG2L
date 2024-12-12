
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fibSeqThread extends JFrame {

    private JTextArea resultTextArea;
    private boolean isRunning = true, isReset = false;
    private int fibNumber, fibNumber2;
    private JButton startButton, pauseResumeButton, resetButton;
    private JLabel title;
    private Thread thread;

    public fibSeqThread() {
        setTitle("Fibonacci Program");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        title = new JLabel("Prints a 2 second delay Fibonnaci sequence");
        add(title,BorderLayout.NORTH);

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        add(new JScrollPane(resultTextArea), BorderLayout.CENTER);

        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Enter first "
                        + "number of Fibonacci sequence:");
                String input2 = JOptionPane.showInputDialog("Enter second "
                        + "number of Fibonacci sequence:");
                try{
                    fibNumber = Integer.parseInt(input);
                    fibNumber2 = Integer.parseInt(input2);
                    if(fibNumber<0||fibNumber2<0)
                        throw new Negative();
                    startButton.setEnabled(false);
                    pauseResumeButton.setEnabled(true);
                    resetButton.setEnabled(true);
                    runFibonacciThread();
                }catch(Negative | HeadlessException | NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Input "
                        + "Error Occurred", "Error", 
                        JOptionPane.ERROR_MESSAGE); 
                    System.exit(0);
                } 
            }
        });

        pauseResumeButton = new JButton("Pause");
        pauseResumeButton.setEnabled(false);
        pauseResumeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isRunning) {
                    pauseResumeButton.setText("Resume");
                } else {
                    pauseResumeButton.setText("Pause");
                }
                isRunning = !isRunning;
            }
        });

        resetButton = new JButton("Reset");
        resetButton.setEnabled(false);
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Enter first "
                        + "number of Fibonacci sequence:");
                String input2 = JOptionPane.showInputDialog("Enter second "
                        + "number of Fibonacci sequence:");
                try{
                    fibNumber = Integer.parseInt(input);
                    fibNumber2 = Integer.parseInt(input2);
                    if(fibNumber<0||fibNumber2<0)
                        throw new Negative();
                    startButton.setEnabled(false);
                    pauseResumeButton.setEnabled(true);
                    resetButton.setEnabled(true);
                    isReset = true;
                    resultTextArea.setText("");
                    runFibonacciThread();
                }catch(Negative | HeadlessException | NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Input "
                        + "Error Occurred", "Error", 
                        JOptionPane.ERROR_MESSAGE); 
                    System.exit(0);
                } 
                
            }
        });

        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);
        buttonPanel.add(pauseResumeButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(closeButton);
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void runFibonacciThread() {
        if(isReset){
            isReset = false;
        }
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    if (!isRunning) {
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        continue;
                    }
                    getNextFibonacciNumber();
                    resultTextArea.append("Current Fibonacci Number: " + fibNumber + "\n");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
    }

    private void getNextFibonacciNumber() {
        int x = fibNumber + fibNumber2;
        fibNumber = fibNumber2;
        fibNumber2 = x;
    }
    
    public static class Negative extends Exception {
        public Negative() {
        }
    }

    public static void main(String[] args) {
        new fibSeqThread();
    }
}
