/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class swingThread extends JFrame {

    private JTextField radiusField, delayField;
    private final JLabel outputLabel;
    private final JLabel radiusLabel;
    private final JLabel delayLabel;

    public swingThread() {
        setTitle("Area of Circle (Thread Version)");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(6,1));
        
        radiusLabel = new JLabel("Radius");
        add(radiusLabel);
        radiusField = new JTextField(20);
        add(radiusField);
        
        delayLabel= new JLabel("Delay in seconds");
        add(delayLabel);
        delayField = new JTextField(20);
        add(delayField);

        JButton submitButton = new JButton("Submit");
        add(submitButton);

        outputLabel = new JLabel();
        add(outputLabel);

        submitButton.addActionListener((ActionEvent e) -> {
            String radius = radiusField.getText();
            String delay = delayField.getText();
            CalculateThread thread = new CalculateThread(radius,delay);
            thread.start();
        });
    }

    private class CalculateThread extends Thread {
        private int radius, delay;

        public CalculateThread(String radius, String delay) {
            try{
                this.radius = Integer.parseInt(radius);
                this.delay = Integer.parseInt(delay)*1000;
                if(this.radius<0||this.delay<0)
                    throw new Negative();
            }catch(Negative | HeadlessException | NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Input "
                        + "Error Occurred", "Error", 
                        JOptionPane.ERROR_MESSAGE); 
                System.exit(0);
            } 
        }

        @Override
        public void run() {
            // Simulating some time-consuming calculation
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            double result = Math.PI * radius * radius;

            SwingUtilities.invokeLater(() -> {
                outputLabel.setText("Output: " + result);
            });
        }
    }
    
    public static class Negative extends Exception {
        public Negative() {
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            swingThread app = new swingThread();
            app.setVisible(true);
        });
    }
}
