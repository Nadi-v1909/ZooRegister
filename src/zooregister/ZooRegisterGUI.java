package zooregister;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ZooRegisterGUI extends JFrame {

    private int i;

//    private ArrayList<String> animalList = new ArrayList<String>();
    public ZooRegisterGUI() {
        //Gives me my frames title
        super("Zoo Register");
        //set size and location of frame
        // this.setBounds(533, 284, 300, 200);
        //make sure it quits when x is clicked
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(6, 1));
        JPanel panel = new JPanel();
        this.add(panel);

        //adding my menuBar
        getMenu();
        //inisliazing my viaribles
        
        String animalName = null;
        String animalDescription = null;
        String[] animalSpecies = {"Dog", "Cat", "Lizard"};
        Object[][] animalData = {{animalName, animalSpecies, animalDescription}};
        JTextField aName = new JTextField(15);
        JTextArea aDescription = new JTextArea(3, 20);
        JComboBox typeSpecies = new JComboBox(animalSpecies);

        JPanel namePanel = setPanelDisplay(aName, "Animal Name");
        JPanel descriptionPanel = setPanelDisplay(aDescription, "Animal Description");
        JPanel speciesPanel = setPanelDisplay(typeSpecies, "Animal Specie");

        JPanel buttonPanel = new JPanel();
        JButton saveButton = new JButton("Save");
        saveButton.addActionListener((ActionEvent e) -> {
//            animalName[i] = aName.getText();
//            animalSpecies = typeSpecies.getText();
//            animalDescription[i] = aDescription.getText();

        });
        buttonPanel.add(saveButton);

        JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener((ActionEvent e) -> {
            dispose();
            ZooRegisterTable tableGui = new ZooRegisterTable();
        });
        buttonPanel.add(cancelButton);
        getContentPane().add(buttonPanel);

        getContentPane();
        add(panel);
        pack();
        //set the visibility of the frame
        this.setVisible(true);

    }

    private JPanel setPanelDisplay(JComponent field, String labelText) {
        JPanel displayPanel = new JPanel();
        displayPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel(labelText, JLabel.TRAILING);
        displayPanel.add(label);
        displayPanel.add(field);
        getContentPane();
        add(displayPanel);
        return displayPanel;
    }

    public void getMenu() {
        //creating my menuBar
        JMenuBar menuBar = new JMenuBar();
        JMenu helpMenu = new JMenu("Help");
        menuBar.add(helpMenu);

        JMenu searchMenu = new JMenu("Search");
        searchMenu.addActionListener((ActionEvent e) -> {
            ZooRegisterSearch search = new ZooRegisterSearch();
        });
        menuBar.add(searchMenu);

        setJMenuBar(menuBar);

    }

   

}
