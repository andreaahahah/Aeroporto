package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginCliente extends JFrame {

    private JPanel LoginClientePanel;
    private JLabel Registrazione;
    private JTextField emialTextField;
    private JPasswordField PassowordField;
    private JButton LOGINButton;
    private JCheckBox mostraPassword;

    public LoginCliente() {
        setContentPane(LoginClientePanel);
        setTitle("Aeroporto Lamezia Terme");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(new Color(173, 216, 230));
        LOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO inserire il controllo dei dati
                String email = emialTextField.getText();
                String password = PassowordField.getText();
                System.out.println("email = "+email+" password = "+password);
                HomeCliente HomeC= new HomeCliente();
                HomeC.setVisible(true);
                setVisible(false);
            }
        });
    }
    public static void main(String [] args){
        new LoginCliente();
    }
}
