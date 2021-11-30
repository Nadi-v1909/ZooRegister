package zooregister;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Closeable;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ZooRegisterLogInGUI extends JFrame {

    public ZooRegisterLogInGUI() {
        super("Login Form");
        setVisible(true);
        setBounds(10, 10, 370, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

          JMenuBar menuBar = new JMenuBar();
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);
        
        JMenu searchMenu = new JMenu("Search");
        searchMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  ZooRegisterSearch search = new ZooRegisterSearch();
            }
        });
        menuBar.add(searchMenu);
        
        setJMenuBar(menuBar);
        
        JPanel panel = new JPanel();
        JLabel errorLabel = new JLabel();
        Container container = getContentPane();
// Username Label
        JLabel userNameLabel = new JLabel("Username:");
        JTextField userNameText = new JTextField(15);
        // Password Label
        JLabel passwordLabel = new JLabel("Password");
        //Password text field
        JPasswordField passwordText = new JPasswordField();
        JCheckBox showPassword = new JCheckBox("Show Password");
        JButton loginButton = new JButton("Login");
        JButton cancelButton = new JButton("Cancel");

        panel.setLayout(null);

        panel = new JPanel(new GridLayout(3, 1));

        // Adding everything to my panel
        panel.add(userNameLabel);
        panel.add(userNameText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(showPassword);

        JPanel buttonPanel = new JPanel();
        final JPanel errorPanel = new JPanel();

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userNameText.getText();
                String password = passwordText.getText();

//                if (username == "Admin" && password == "Admin1") {
                    dispose();
                    ZooRegisterTable tableGui = new ZooRegisterTable();

//                } 
//else if (username != "Admin" && password == "Admin1") {
//                    JOptionPane.showMessageDialog(null, "Invalid Username. Please check Username again.", "Error", JOptionPane.ERROR_MESSAGE);
//
//                } else if (username == "Admin" && password != "Admin1") {
//                    JOptionPane.showMessageDialog(null, "Invalid Password. Please check Password again.", "Error", JOptionPane.ERROR_MESSAGE);
//                } else {
//                    JOptionPane.showMessageDialog(null, "Invalid Username and Password", "Error", JOptionPane.ERROR_MESSAGE);
//                }
//            }
//        });
            }
        });

        buttonPanel.add(loginButton);
        //Close my JFrame and end program
        cancelButton.addActionListener(e -> dispose());

        buttonPanel.add(cancelButton);

        panel.add(buttonPanel);

        getContentPane().add(panel);
        pack();
        setVisible(true);

    }

}
