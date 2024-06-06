package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class HomeLavoratore extends JFrame {
    private JPanel HomeLPanel2;

    private  class ImagePanel extends JPanel {
        private Image backgroundImage;

        // Costruttore che carica l'immagine
        public ImagePanel(String fileName) {
            try {
                backgroundImage = ImageIO.read(new File(fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), this);
            }
        }
    }

    public HomeLavoratore(){
        HomeLPanel2 = new ImagePanel("src//resources//mannyTuttoFare.jpeg");
        setContentPane(HomeLPanel2);
        setTitle("Aeroporto Lamezia Terme");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);
        setVisible(true);
        getContentPane().setBackground(new Color(173, 216, 230));
    }
}
