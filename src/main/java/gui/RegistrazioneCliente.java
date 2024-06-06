package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrazioneCliente extends JFrame {

    private JPanel RegistrazionePanel;
    private JButton avantiButton;
    private JTextField cfField;
    private JTextField nomeField;
    private JTextField cognomeField;
    private JTextField emailField;
    private JTextField passwordField;

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
                String CF = cfField.getText();

                String nome = nomeField.getText();
                String cognome = cognomeField.getText();
                String email = emailField.getText();
                String password = passwordField.getText();
                System.out.println("CF = " + CF + "\nNome = " + nome + "\nCognome = " + cognome + "\nEmail = " + email + "\nPassword = " + password);
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
