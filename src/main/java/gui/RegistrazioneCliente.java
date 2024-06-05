package gui;

import javax.swing.*;
import java.awt.*;

public class RegistrazioneCliente extends JFrame {

    private JPanel RegistrazionePanel;
    private JButton aggiungiMetodoDiPagamentoButton;

    public RegistrazioneCliente(){
        setContentPane(RegistrazionePanel);
        setTitle("Aeroporto Lamezia Terme");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(new Color(173, 216, 230));
    }

    public static void main(String... args){
        new RegistrazioneCliente();
    }
}
