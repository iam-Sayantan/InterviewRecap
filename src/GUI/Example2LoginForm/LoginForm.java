package GUI.Example2LoginForm;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm implements ActionListener {

    // Components
    JTextField nameTextField;
    JTextField emailTextField;
    JPasswordField passwordField;
    JRadioButton maleRadioButton;
    JRadioButton femaleRadioButton;
    ButtonGroup genderGroup;
    JComboBox<String> cityComboBox;
    JButton registerButton;
    JButton reset;
    JFrame frame;


    void createLoginForm()
    {
        frame = new JFrame();
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Login");
        frame.setLayout(null);

        // Labels
        JLabel nameLabel = new JLabel("Enter Name:");
        nameLabel.setBounds(50, 30, 100, 30);
        frame.add(nameLabel);

        JLabel emailLabel = new JLabel("Enter Email:");
        emailLabel.setBounds(50, 70, 100, 30);
        frame.add(emailLabel);

        JLabel passwordLabel = new JLabel("Enter Password:");
        passwordLabel.setBounds(50, 110, 100, 30);
        frame.add(passwordLabel);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 150, 100, 30);
        frame.add(genderLabel);

        JLabel cityLabel = new JLabel("City:");
        cityLabel.setBounds(50, 190, 100, 30);
        frame.add(cityLabel);

        // TextFields and PasswordField
        nameTextField = new JTextField();
        nameTextField.setBounds(160, 30, 200, 30);
        frame.add(nameTextField);

        emailTextField = new JTextField();
        emailTextField.setBounds(160, 70, 200, 30);
        frame.add(emailTextField);

        passwordField = new JPasswordField();
        passwordField.setBounds(160, 110, 200, 30);
        frame.add(passwordField);

        // RadioButtons
        maleRadioButton = new JRadioButton("Male");
        maleRadioButton.setBounds(160, 150, 80, 30);
        frame.add(maleRadioButton);

        femaleRadioButton = new JRadioButton("Female");
        femaleRadioButton.setBounds(250, 150, 100, 30);
        frame.add(femaleRadioButton);

        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadioButton);
        genderGroup.add(femaleRadioButton);

        // ComboBox
        String[] cities = {"Select", "New York", "London", "Tokyo", "Paris"};
        cityComboBox = new JComboBox<>(cities);
        cityComboBox.setBounds(160, 190, 200, 30);
        frame.add(cityComboBox);

        // Buttons
        registerButton = new JButton("Register");
        registerButton.addActionListener(this);
        registerButton.setBounds(160, 230, 100, 30);
        frame.add(registerButton);

        reset = new JButton("Reset");
        reset.addActionListener(this);
        reset.setBounds(270, 230, 100, 30);
        frame.add(reset);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == registerButton) {
            String message = "";

            // Check if name field is empty
            if (nameTextField.getText().isEmpty()) {
                message += "Please enter Name\n";
            }

            // Check if email field is empty
            if (emailTextField.getText().isEmpty()) {
                message += "Please enter Email\n";
            }

            // Check if password field is empty
            if (new String(passwordField.getPassword()).isEmpty()) {
                message += "Please enter Password\n";
            }

            // Check if gender is selected
            if (!maleRadioButton.isSelected() && !femaleRadioButton.isSelected()) {
                message += "Please select Gender\n";
            }

            // Check if city is selected
            if (cityComboBox.getSelectedIndex() == 0) {
                message += "Please select City\n";
            }

            // Display appropriate message
            if (!message.isEmpty()) {
                showMessage(message);
            } else {
                // All fields are filled, construct and display the message
                message = "Name: " + nameTextField.getText() + "\n" +
                        "Email: " + emailTextField.getText() + "\n" +
                        "Gender: " + (maleRadioButton.isSelected() ? "Male" : "Female") + "\n" +
                        "City: " + cityComboBox.getSelectedItem();
                showMessage(message);
            }
        }
        if(e.getSource()==reset)
        {
            nameTextField.setText(null);
            emailTextField.setText(null);
            passwordField.setText(null);
            maleRadioButton.setSelected(false);
            femaleRadioButton.setSelected(false);
            cityComboBox.setSelectedIndex(0);
            String message="Reset Done";
            showMessage(message);
        }
    }


    public void showMessage(String message)
    {
        JOptionPane.showMessageDialog(frame,message);
    }

    public static void main(String[] args) {
        LoginForm lf = new LoginForm();
        lf.createLoginForm();
    }

}


