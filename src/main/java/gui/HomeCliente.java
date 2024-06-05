package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeCliente extends JFrame {

    private JPanel HomePanel;
    private JComboBox<String> comboBox;

    public HomeCliente(){
        setContentPane(HomePanel);
        setTitle("Aeroporto Lamezia Terme");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(new Color(173, 216, 230));

        comboBox.addItem("Roma");
        comboBox.addItem("Londra");
        comboBox.addItem("Milano");
        comboBox.addItem("New York");
        comboBox.addItem("Parigi");
        comboBox.addItem("Las Vegas");

        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox.getSelectedItem();
                System.out.println("Selected: " + selectedItem);
            }
        });
        //frame.setContentPane(new ComboBoxExample().mainPanel);
    }
    public static void main (String [] args){
        new HomeCliente();

    }

}


