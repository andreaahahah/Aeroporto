package gui;

import javax.swing.*;
import java.awt.*;

public class HomeLavoratore extends JFrame {
    private JPanel HomePanel;
    private JPanel HomeLPanel;

    public HomeLavoratore(){
        setContentPane(HomeLPanel);
        setTitle("Aeroporto Lamezia Terme");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(new Color(173, 216, 230));
    }
}
