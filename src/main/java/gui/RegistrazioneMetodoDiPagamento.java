package gui;

import main.apiService.ApiService;
import org.json.JSONException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class RegistrazioneMetodoDiPagamento extends JFrame{
    private JButton registraButton;
    private JPanel regMpanel;
    private JTextField numeroCartaField;
    private JTextField tipologiaField;
    private JTextField limiteTransazioneField;
    private JLabel campiVuoti;


    public RegistrazioneMetodoDiPagamento(String CF,String nome,String cognome,String email, String password){
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
                ApiService a = new ApiService();
                String numero =  numeroCartaField.getText();
                String tipo = tipologiaField.getText();
                String limite = limiteTransazioneField.getText();
                if(numero.isEmpty() || tipo.isEmpty()||limite.isEmpty() ){
                    campiVuoti.setVisible(true);
                }
                else {
                    int numeroI =0, limiteI=0;
                    try{
                    numeroI = Integer.parseInt(numero);
                    limiteI = Integer.parseInt(limite);}
                    catch(Exception ex){
                        campiVuoti.setVisible(true);
                    }
                    try{
                        String response = a.createPasseggero(CF, nome, cognome, email, password, numeroI, tipo, limiteI);
                        System.out.println(response);
                    }catch (IOException | JSONException ioe){
                        ioe.printStackTrace();
                    }

                    LoginCliente logC = new LoginCliente();
                    logC.setVisible(true);
                    setVisible(false);
                }
            }
        });

    }

}
