
package employee_management;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class EmployeeManagementSystem extends JFrame implements ActionListener {

    private final JLabel nameLabel;
    private final JLabel idLabel;
    private final JLabel departmentLabel;

    private final JLabel roleLabel;
    private final JLabel statusLabel;
    private final JTextField nameTextField;
    private final JTextField idTextField;
    private final JComboBox<String> departmentComboBox;
    private final JRadioButton managerRadioButton;
    private final JRadioButton staffRadioButton;
    private final JRadioButton internRadioButton;
    private final JCheckBox fullTimeCheckBox;
    private final JCheckBox partTimeCheckBox;
    private final JCheckBox contractCheckBox;
    private final JButton addButton;
    private final JButton clearButton;
    // Additional Labels for displaying added employee information
    private final JLabel addedNameLabel;
    private final JLabel addedIdLabel;
    private final JLabel addedDepartmentLabel;
    private final JLabel addedRoleLabel;
    private final JLabel addedStatusLabel;
    private final JTextField addedNameTextField;
    private final JTextField addedIdTextField;
    private final JTextField addedDepartmentTextField;
    private final JTextField addedRoleTextField;
    private final JTextField addedStatusTextField;
    

    public EmployeeManagementSystem() {

        setTitle("Employee Management System");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
       
        // Labels
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 10, 80, 25);
        idLabel = new JLabel("ID:");
        idLabel.setBounds(10, 40, 80, 25);
        departmentLabel = new JLabel("Department:");
        departmentLabel.setBounds(10, 70, 95, 25);
        roleLabel = new JLabel("Role:");
        roleLabel.setBounds(10, 100, 80, 25);
        statusLabel = new JLabel("Status:");
        statusLabel.setBounds(10, 130, 80, 25);

        // Set background image
        ImageIcon backgroundImage = new ImageIcon("D:\\OOP_Project\\employee_management\\src\\employee_management\\BG.jpg");
        Image scaledImage = backgroundImage.getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        backgroundImage = new ImageIcon(scaledImage);
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setBounds(0, 0, 500, 500);
        add(backgroundLabel);

        setContentPane(new JLabel(backgroundImage));

        // Text Fields
        nameTextField = new JTextField();
        nameTextField.setBounds(120, 10, 200, 25);
        idTextField = new JTextField();
        idTextField.setBounds(120, 40, 200, 25);

        // Combo Box
        String[] departments = {"Sales", "Marketing", "IT", "Finance"};
        departmentComboBox = new JComboBox<>(departments);
        departmentComboBox.setBounds(120, 70, 200, 25);

        // Radio Buttons
        managerRadioButton = new JRadioButton("Manager");
        managerRadioButton.setBounds(120, 100, 80, 25);
        staffRadioButton = new JRadioButton("Staff");
        staffRadioButton.setBounds(200, 100, 80, 25);
        internRadioButton = new JRadioButton("Intern");
        internRadioButton.setBounds(280, 100, 80, 25);

        // Button Group
        ButtonGroup roleGroup = new ButtonGroup();
        roleGroup.add(managerRadioButton);
        roleGroup.add(staffRadioButton);
        roleGroup.add(internRadioButton);

        // Check Boxes
        fullTimeCheckBox = new JCheckBox("Full-Time");
        fullTimeCheckBox.setBounds(120, 130, 100, 25);
        partTimeCheckBox = new JCheckBox("Part-Time");
        partTimeCheckBox.setBounds(220, 130, 100, 25);
        contractCheckBox = new JCheckBox("Contract");
        contractCheckBox.setBounds(320, 130, 100, 25);

        // Buttons
        addButton = new JButton("Add");
        addButton.setBounds(120, 170, 80, 25);
        clearButton = new JButton("Clear");
        clearButton.setBounds(350, 400, 80, 25);

        // Register Action Listeners
        addButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Labels for displaying added employee information
        addedNameLabel = new JLabel("Name:");
        addedNameLabel.setBounds(10, 210, 80, 25);
        addedIdLabel = new JLabel("ID:");
        addedIdLabel.setBounds(10, 240, 80, 25);
        addedDepartmentLabel = new JLabel("Department:");
        addedDepartmentLabel.setBounds(10, 270, 100, 25);
        addedRoleLabel = new JLabel("Role:");
        addedRoleLabel.setBounds(10, 300, 80, 25);
        addedStatusLabel = new JLabel("Status:");
        addedStatusLabel.setBounds(10, 330, 80, 25);

        // Text Fields for displaying added employee information
        addedNameTextField = new JTextField();
        addedNameTextField.setBounds(120, 210, 200, 25);
        addedIdTextField = new JTextField();
        addedIdTextField.setBounds(120, 240, 200, 25);
        addedDepartmentTextField = new JTextField();
        addedDepartmentTextField.setBounds(120, 270, 200, 25);
        addedRoleTextField = new JTextField();
        addedRoleTextField.setBounds(120, 300, 200, 25);
        addedStatusTextField = new JTextField();
        addedStatusTextField.setBounds(120, 330, 200, 25);
        addedStatusTextField.setEditable(false);

        
        // Add components to the JFrame
        setLayout(null);
        add(nameLabel);
        add(nameTextField);
        add(idLabel);
        add(idTextField);
        add(departmentLabel);
        add(departmentComboBox);
        add(roleLabel);
        add(managerRadioButton);
        add(staffRadioButton);
        add(internRadioButton);
        add(statusLabel);
        add(fullTimeCheckBox);
        add(partTimeCheckBox);
        add(contractCheckBox);
        add(addButton);
        add(clearButton);
        add(addedNameLabel);
        add(addedNameTextField);
        add(addedIdLabel);
        add(addedIdTextField);
        add(addedDepartmentLabel);
        add(addedDepartmentTextField);
        add(addedRoleLabel);
        add(addedRoleTextField);
        add(addedStatusLabel);
        add(addedStatusTextField);

       
        // Set font style for labels
        Font labelFont = new Font("LUCIDA HANDWRITING", Font.BOLD, 12);
        Color labelColor = Color.BLACK;
        nameLabel.setFont(labelFont);
        nameLabel.setForeground(labelColor);
        idLabel.setFont(labelFont);
        idLabel.setForeground(labelColor);
        departmentLabel.setFont(labelFont);
        departmentLabel.setForeground(labelColor);
        roleLabel.setFont(labelFont);
        roleLabel.setForeground(labelColor);
        statusLabel.setFont(labelFont);
        statusLabel.setForeground(labelColor);
        addedNameLabel.setFont(labelFont);
        addedNameLabel.setForeground(labelColor);
        addedIdLabel.setFont(labelFont);
        addedIdLabel.setForeground(labelColor);
        addedDepartmentLabel.setFont(labelFont);
        addedDepartmentLabel.setForeground(labelColor);
        addedRoleLabel.setFont(labelFont);
        addedRoleLabel.setForeground(labelColor);
        addedStatusLabel.setFont(labelFont);
        addedStatusLabel.setForeground(labelColor);

// Set font style for text fields
        Font textFieldFont = new Font("LUCIDA HANDWRITING", Font.PLAIN, 12);
        Color textFieldColor = Color.BLACK;
        nameTextField.setFont(textFieldFont);
        nameTextField.setForeground(textFieldColor);
        idTextField.setFont(textFieldFont);
        idTextField.setForeground(textFieldColor);
        addedNameTextField.setFont(textFieldFont);
        addedNameTextField.setForeground(textFieldColor);
        addedIdTextField.setFont(textFieldFont);
        addedIdTextField.setForeground(textFieldColor);
        addedDepartmentTextField.setFont(textFieldFont);
        addedDepartmentTextField.setForeground(textFieldColor);
        addedRoleTextField.setFont(textFieldFont);
        addedRoleTextField.setForeground(textFieldColor);
        addedStatusTextField.setFont(textFieldFont);
        addedStatusTextField.setForeground(textFieldColor);

// Set font style for combo box
        Font comboBoxFont = new Font("IMPACT", Font.PLAIN, 12);
        Color comboBoxColor = Color.GRAY;
        departmentComboBox.setFont(comboBoxFont);
        departmentComboBox.setForeground(comboBoxColor);

// Set font style for radio buttons
        Font radioButtonFont = new Font("IMPACT", Font.PLAIN, 12);
        Color radioButtonColor = Color.GRAY;
        managerRadioButton.setFont(radioButtonFont);
        managerRadioButton.setForeground(radioButtonColor);
        staffRadioButton.setFont(radioButtonFont);
        staffRadioButton.setForeground(radioButtonColor);
        internRadioButton.setFont(radioButtonFont);
        internRadioButton.setForeground(radioButtonColor);

// Set font style for check boxes
        Font checkBoxFont = new Font("IMPACT", Font.PLAIN, 12);
        Color checkBoxColor = Color.GRAY;
        fullTimeCheckBox.setFont(checkBoxFont);
        fullTimeCheckBox.setForeground(checkBoxColor);
        partTimeCheckBox.setFont(checkBoxFont);
        partTimeCheckBox.setForeground(checkBoxColor);
        contractCheckBox.setFont(checkBoxFont);
        contractCheckBox.setForeground(checkBoxColor);

// Set font style for buttons
        Font buttonFont = new Font("IMPACT", Font.PLAIN, 12);
        Color buttonColor = Color.BLACK;
        addButton.setFont(buttonFont);
        addButton.setForeground(buttonColor);
        clearButton.setFont(buttonFont);
        clearButton.setForeground(buttonColor);

// Set background color for buttons
        Color buttonBackgroundColor = Color.PINK;
        addButton.setBackground(buttonBackgroundColor);
        clearButton.setBackground(buttonBackgroundColor);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addButton) {
            // Get the entered information
            String name = nameTextField.getText();
            String id = idTextField.getText();
            String department = (String) departmentComboBox.getSelectedItem();
            String role = "";
            if (managerRadioButton.isSelected()) {
                role = "Manager";
            } else if (staffRadioButton.isSelected()) {
                role = "Staff";
            } else if (internRadioButton.isSelected()) {
                role = "Intern";
            }
            String status = "";
            if (fullTimeCheckBox.isSelected()) {
                status += "Full-Time ";
            }
            if (partTimeCheckBox.isSelected()) {
                status += "Part-Time ";
            }
            if (contractCheckBox.isSelected()) {
                status += "Contract";
            }

            // Check if any required field is empty
            if (name.isEmpty() || id.isEmpty() || department.isEmpty() || role.isEmpty() || status.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please provide all the required information.");
            } else {
                // Set the added employee information in the corresponding text fields
                addedNameTextField.setText(name);
                addedIdTextField.setText(id);
                addedDepartmentTextField.setText(department);
                addedRoleTextField.setText(role);
                addedStatusTextField.setText(status);

                
                JOptionPane.showMessageDialog(this, "Employee added successfully!");
            }

        } else if (e.getSource() == clearButton) {
            
            nameTextField.setText("");
            idTextField.setText("");
            departmentComboBox.setSelectedIndex(0);
            managerRadioButton.setSelected(true);
            fullTimeCheckBox.setSelected(false);
            partTimeCheckBox.setSelected(false);
            contractCheckBox.setSelected(false);
            addedNameTextField.setText("");
            addedIdTextField.setText("");
            addedDepartmentTextField.setText("");
            addedRoleTextField.setText("");
            addedStatusTextField.setText("");
        }
    }



}
