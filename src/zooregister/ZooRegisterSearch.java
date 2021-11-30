/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooregister;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Nadia Visser
 */
public class ZooRegisterSearch extends JFrame {

    public ZooRegisterSearch() {
        //Gives me my frames title
        super("Zoo Register");
        //set size and location of frame
        this.setBounds(533, 284, 300, 200);
        //make sure it quits when x is clicked
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //set look and feel
        setDefaultLookAndFeelDecorated(true);

        JMenuBar menuBar = new JMenuBar();
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        JPanel panel = new JPanel();
        JPanel buttonPanel = new JPanel();
        JLabel searchLabel = new JLabel("Search:");
        JTextField searchbarText = new JTextField(45);
        JButton searchButton = new JButton("Search");
        JButton cancelButton = new JButton("Cancel");

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        buttonPanel.add(searchButton);

        //Close my JFrame and end program
        cancelButton.addActionListener(e -> dispose());

        buttonPanel.add(cancelButton);
        panel.add(buttonPanel);
        panel.add(searchLabel);
        panel.add(searchbarText);

        getContentPane();
        add(panel);
        this.setVisible(true);
    }
}
