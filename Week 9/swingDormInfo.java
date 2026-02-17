import javax.swing.*; 
import java.awt.event.*; 
import java.awt.BorderLayout;
import java.awt.Dimension;

public class swingDormInfo extends JFrame {
    private JLabel label, label2, label3, label4, label5, title;
    private JFrame f;
    private JTextArea textArea;
    private JTextField textField;
    private JPasswordField passwordField;
    private JRadioButton radioButton, radioButton2, radioButton3;
    private JButton button, button3, button2;
    private JCheckBox checkBox, checkBox2, checkBox3;

    public swingDormInfo() {
        // Set up the JFrame
        setTitle("Dorm User Information");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f = this;
        
        // Create main panel with BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        // Create top panel with BorderLayout and set its size
        JPanel titlePanel = new JPanel();
        titlePanel.setPreferredSize(new Dimension(900, 50));
        title = new JLabel("Dorm Profile");
        titlePanel.add(title);
        mainPanel.add(titlePanel, BorderLayout.NORTH);
        
        // Create left panel for labels and fields
        JPanel labelFieldPanel = new JPanel();
        labelFieldPanel.setPreferredSize(new Dimension(300, 200));
        label = new JLabel("Username:");
        label.setLocation(100, 75);
        labelFieldPanel.add(label);
        textField = new JTextField(10);
        labelFieldPanel.add(textField);
        label2 = new JLabel("Password:");
        label2.setLocation(100, 350);
        labelFieldPanel.add(label2);
        passwordField = new JPasswordField(10);
        labelFieldPanel.add(passwordField);
       // label3 = new JLabel("Address:");
       // label3.setLocation(50, 225);
      //  labelFieldPanel.add(label3);
      //  textArea = new JTextArea(13, 10);
     //   labelFieldPanel.add(textArea);
        mainPanel.add(labelFieldPanel, BorderLayout.WEST);

        // Create panel for radio/check buttons        
        JPanel radioPanel = new JPanel();
        radioPanel.setPreferredSize(new Dimension(300, 200));
        label4 = new JLabel("Gender:");
        radioPanel.add(label4);
        radioButton = new JRadioButton("Male");
        radioPanel.add(radioButton);
        radioButton2 = new JRadioButton("Female");
        radioPanel.add(radioButton2);
        radioButton3 = new JRadioButton("Genderfluid");
        radioPanel.add(radioButton3);
        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButton);
        bg.add(radioButton2);
        bg.add(radioButton3);
        mainPanel.add(radioPanel, BorderLayout.CENTER);
        
        // Create panel for radio/check buttons        
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.setPreferredSize(new Dimension(300, 200));
        label5 = new JLabel("Devices:");
        checkBoxPanel.add(label5);
        checkBox = new JCheckBox("Laptop");
        checkBoxPanel.add(checkBox);
        checkBox2 = new JCheckBox("Fan");
        checkBoxPanel.add(checkBox2);
        checkBox3 = new JCheckBox("Cellphone");
        checkBoxPanel.add(checkBox3);
        mainPanel.add(checkBoxPanel, BorderLayout.EAST);
        
        // Create panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(900, 50));
        button = new JButton("Save");
        buttonPanel.add(button);
        button2 = new JButton("Reset");
        buttonPanel.add(button2);
        button3 = new JButton("Exit");
        buttonPanel.add(button3);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        button.addActionListener((ActionEvent e) ->{
            if(textField.getText().isEmpty() || String.valueOf(passwordField.getPassword()).isEmpty()) {
                JOptionPane.showMessageDialog(f, "Error: Username and Password cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(f, "Saved!");
            }
        });
        button2.addActionListener((ActionEvent e) ->{
            if (e.getSource() == button2){
                String def = "";
                passwordField.setText(def);
                textField.setText(def);
                bg.clearSelection();
                checkBox.setSelected(false);
                checkBox2.setSelected(false);
                checkBox3.setSelected(false);
            }
        });
        button3.addActionListener((ActionEvent e) ->{
            if(e.getSource()==button3)
                System.exit(0); 
        });
        
        // Set the size and make the JFrame visible
        setSize(900, 400);
        add(mainPanel);
        setVisible(true);

        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new swingDormInfo();
            }
        });
    }
}
