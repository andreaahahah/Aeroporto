package gui;

import javax.swing.*;
import java.awt.*;

public class HomeCliente extends JFrame {

    private JPanel HomePanel;

    public HomeCliente(){
        setContentPane(HomePanel);
        setTitle("Aeroporto Lamezia Terme");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(new Color(173, 216, 230));
    }
    public static void main (String [] args){
        new HomeCliente();
    }



}
