import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class EmployeeGUI extends JFrame implements ActionListener {

    private JTextField idField, nameField, positionField, searchField;
    private JTextArea displayArea;
    private Vector<Employee> employees = new Vector<>();

    public EmployeeGUI() {
        super("Employee Management System");

        // Create GUI components
        JLabel idLabel = new JLabel("ID:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel positionLabel = new JLabel("Position:");
        JLabel searchLabel = new JLabel("Search by ID:");
        idField = new JTextField(10);
        nameField = new JTextField(20);
        positionField = new JTextField(20);
        searchField = new JTextField(10);
        JButton addButton = new JButton("Add");
        JButton listAllButton = new JButton("List All");
        JButton searchButton = new JButton("Search");
        displayArea = new JTextArea(10, 30);
        JScrollPane displayScrollPane = new JScrollPane(displayArea);

        // Add GUI components to the frame
        JPanel addPanel = new JPanel(new GridLayout(3, 2));
        addPanel.add(idLabel);
        addPanel.add(idField);
        addPanel.add(nameLabel);
        addPanel.add(nameField);
        addPanel.add(positionLabel);
        addPanel.add(positionField);
        addPanel.setBorder(BorderFactory.createTitledBorder("Add Employee"));
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(listAllButton);
        buttonPanel.add(searchLabel);
        buttonPanel.add(searchField);
        buttonPanel.add(searchButton);
        JPanel displayPanel = new JPanel(new BorderLayout());
        displayPanel.add(displayScrollPane, BorderLayout.CENTER);
        displayPanel.setBorder(BorderFactory.createTitledBorder("Employee List"));
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(addPanel, BorderLayout.NORTH);
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
        getContentPane().add(displayPanel, BorderLayout.SOUTH);

        // Add event listeners to the buttons
        addButton.addActionListener(this);
        listAllButton.addActionListener(this);
        searchButton.addActionListener(this);

        // Configure the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add")) {
            // Retrieve the elements from the textfields
            int id = Integer.parseInt(idField.getText());
            String name = nameField.getText();
            String position = positionField.getText();

            // Create an Employee object and add it to the employees vector
            Employee employee = new Employee(id, name, position);
            employees.add(employee);

            // Clear the textfields
            idField.setText("");
            nameField.setText("");
            positionField.setText("");
        } else if (e.getActionCommand().equals("List All")) {
            // Display all employees in the text area
            displayArea.setText("");
            for (Employee employee : employees) {
                displayArea.append(employee.toString() + "\n");
            }
        } else if (e.getActionCommand().equals("Search")) {
            // Search for an employee by ID
            int id = Integer.parseInt(searchField.getText());
            boolean found = false;
            displayArea.setText("");
            for (Employee employee : employees) {
                if (employee.getId() == id) {
                    // Display the details of the employee in the text area
                    displayArea.setText(employee.toString());
                    found = true;
                    break;
