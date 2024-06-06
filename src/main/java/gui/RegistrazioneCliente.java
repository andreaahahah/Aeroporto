package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrazioneCliente extends JFrame {

    private JPanel RegistrazionePanel;
    private JButton avantiButton;

    public RegistrazioneCliente(){
        setContentPane(RegistrazionePanel);
        setTitle("Aeroporto Lamezia Terme");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(new Color(173, 216, 230));
        avantiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO inserire il controllo dei dati
                RegistrazioneMetodoDiPagamento regM= new RegistrazioneMetodoDiPagamento();
                regM.setVisible(true);
                setVisible(false);
            }
        });
    }

    public static void main(String... args){
        new RegistrazioneCliente();
    }
}
