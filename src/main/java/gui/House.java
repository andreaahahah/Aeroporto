package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class House extends JFrame {

    private JPanel HousePanel;
    private JButton registrazione;
    private JButton loginU;
    private JButton loginPersonale;

    public House(){
        setContentPane(HousePanel);
        setTitle("Aeroporto Lamezia Terme");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(new Color(173, 216, 230));

        registrazione.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO inserire il controllo dei dati
                RegistrazioneCliente registrazioneC = new RegistrazioneCliente();
                registrazioneC.setVisible(true);
                setVisible(false);
            }
        });

        loginU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO inserire il controllo dei dati
                LoginCliente logC= new LoginCliente();
                logC.setVisible(true);
                setVisible(false);
            }
        });
        loginPersonale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO inserire il controllo dei dati
                LoginLavoratore logL= new LoginLavoratore();
                logL.setVisible(true);
                setVisible(false);
            }
        });
    }
    public static void main (String [] args){
        new House();
    }


   
}
