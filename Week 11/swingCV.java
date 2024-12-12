import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swingCV extends JFrame {
    
    private JTextField nameField, emailField, addressField, primarySchoolField, secondarySchoolField, tertiarySchoolField, primaryYearsField, secondaryYearsField, tertiaryYearsField, genderField, birthdateField;
    private JTextArea outputArea;
    
    public swingCV() {
        setTitle("Curriculum Vitae Program");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel inputPanel = new JPanel(new GridLayout(11, 2));
        
        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        
        inputPanel.add(new JLabel("Email:"));
        emailField = new JTextField();
        inputPanel.add(emailField);
        
        inputPanel.add(new JLabel("Address:"));
        addressField = new JTextField();
        inputPanel.add(addressField);
        
        inputPanel.add(new JLabel("Primary School:"));
        primarySchoolField = new JTextField();
        inputPanel.add(primarySchoolField);
        
        inputPanel.add(new JLabel("Primary School Years:"));
        primaryYearsField = new JTextField();
        inputPanel.add(primaryYearsField);
        
        inputPanel.add(new JLabel("Secondary School:"));
        secondarySchoolField = new JTextField();
        inputPanel.add(secondarySchoolField);
        
        inputPanel.add(new JLabel("Secondary School Years:"));
        secondaryYearsField = new JTextField();
        inputPanel.add(secondaryYearsField);
        
        inputPanel.add(new JLabel("Tertiary School:"));
        tertiarySchoolField = new JTextField();
        inputPanel.add(tertiarySchoolField);
        
        inputPanel.add(new JLabel("Tertiary School Years:"));
        tertiaryYearsField = new JTextField();
        inputPanel.add(tertiaryYearsField);
        
        inputPanel.add(new JLabel("Gender:"));
        genderField = new JTextField();
        inputPanel.add(genderField);
        
        inputPanel.add(new JLabel("Birthdate:"));
        birthdateField = new JTextField();
        inputPanel.add(birthdateField);
        
        JButton submitButton = new JButton("Submit");
        
        outputArea = new JTextArea();
        
        getContentPane().add(inputPanel, BorderLayout.NORTH);
        getContentPane().add(submitButton, BorderLayout.CENTER);
        getContentPane().add(outputArea, BorderLayout.SOUTH);
        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] cv = {
                        nameField.getText(),
                        emailField.getText(),
                        addressField.getText(),
                        primarySchoolField.getText(),
                        primaryYearsField.getText(),
                        secondarySchoolField.getText(),
                        secondaryYearsField.getText(),
                        tertiarySchoolField.getText(),
                        tertiaryYearsField.getText(),
                        genderField.getText(),
                        birthdateField.getText()
                };
                
                Thread t = new Thread(() -> {
                    StringBuilder cvText = new StringBuilder();
                    for (String info : cv) {
                        cvText.append(info).append("\n");
                    }
                    outputArea.setText(cvText.toString());
                });
                t.start();
            }
        });
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new swingCV().setVisible(true);
        });
    }
}
