package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrazioneMetodoDiPagamento extends JFrame{
    private JButton registraButton;
    private JTextField numeroCarta;
    private JTextField tipologia;
    private JTextField limiteTransazione;
    private JPanel regMpanel;
    public RegistrazioneMetodoDiPagamento(){
        setContentPane(regMpanel);
        setTitle("Aeroporto Lamezia Terme");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(new Color(173, 216, 230));
        registraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO inserire il controllo dei dati
                LoginCliente logC= new LoginCliente();
                logC.setVisible(true);
                setVisible(false);
            }
        });
    }
}
