package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginLavoratore extends JFrame {

    private JPanel LoginLavoratorePanel;
    private JLabel LOGIN;
    private JTextField emialTextField;
    private JPasswordField PassowordField;
    private JButton LOGINButton;
    private JCheckBox mostraPassword;

    public LoginLavoratore() {
        setContentPane(LoginLavoratorePanel);
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
                        HomeLavoratore HomeL= new HomeLavoratore();
                        HomeL.setVisible(true);
                        setVisible(false);
                    }
                });
            }

    public static void main(String [] args){
        new LoginLavoratore();
    }
}
