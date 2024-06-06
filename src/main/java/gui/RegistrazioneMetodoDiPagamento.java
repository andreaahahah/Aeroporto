package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrazioneMetodoDiPagamento extends JFrame{
    private JButton registraButton;
    private JPanel regMpanel;
    private JTextField numeroCartaField;
    private JTextField tipologiaField;
    private JTextField limiteTransazioneField;
    private JLabel campiVuoti;

    public RegistrazioneMetodoDiPagamento(){
        setContentPane(regMpanel);
        setTitle("Aeroporto Lamezia Terme");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        campiVuoti.setVisible(false);
        setVisible(true);
        getContentPane().setBackground(new Color(173, 216, 230));
        registraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO inserire il controllo dei dati
                String numero =  numeroCartaField.getText();
                String tipo = tipologiaField.getText();
                String limite = limiteTransazioneField.getText();
                if(numero.isEmpty() || tipo.isEmpty()||limite.isEmpty() ){
                    campiVuoti.setVisible(true);
                }
                else {
                    try{
                    int numeroI = Integer.parseInt(numero);
                    int limiteI = Integer.parseInt(limite);}
                    catch(Exception ex){
                        campiVuoti.setVisible(true);
                    }
                    System.out.println("Numero Carta = " + numero + "\nTipologia = " + tipo + "\nLimite Transazione = " + limite);
                    LoginCliente logC = new LoginCliente();
                    logC.setVisible(true);
                    setVisible(false);
                }
            }
        });
    }
}
