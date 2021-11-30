package zooregister;

import java.awt.BorderLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ZooRegisterTable extends JFrame {

    JTable table;

    public ZooRegisterTable() {

        //Gives me my frames title
        super("Animal List");
        setSize(600, 400);
        //make sure it quits when x is clicked
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        
        String[] columnHeader = {"Name", "Description", "Specie"};

        String[][] data = {
            {"Ben", "Ben loves runs", "Dog"},
            {"Sammie", "Sammie loves swimming", "Bird"},};
        getMenu();

        DefaultTableModel dataTable = new DefaultTableModel(data, columnHeader);
        JPanel panel = new JPanel();
        JTable table = new JTable(dataTable);
        panel.add(table);
        JScrollPane scrollPane = new JScrollPane(table);
        getContentPane().add(scrollPane);

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add");
        JButton deleteButton = new JButton("Delete");

   
        //Giving my delete button a ActionListener
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ZooRegisterGUI register = new ZooRegisterGUI();
            }
        });
        buttonPanel.add(addButton);

        //Giving my delete button a ActionListener
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int i = table.getSelectedRow();
                if (i >= 0) {
                    // remove a row from jtable
                    // model.removeRow(i);
                } else {
                    System.out.println("Delete Error");
                }
            }
        });
        buttonPanel.add(deleteButton);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        JPanel serverPanel = new JPanel();
        JButton onButton = new JButton("Server On");
        JButton offButton = new JButton("Server Off");

        onButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        serverPanel.add(onButton);

        offButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        serverPanel.add(offButton);

        getContentPane().add(serverPanel, BorderLayout.NORTH);
        pack();
        //set the visibility of the frame
        this.setVisible(true);

    }

    public void getMenu() {
        //creating my menuBar
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

    }
}
