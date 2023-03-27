package paquete;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversor");
        ImageIcon img = new ImageIcon("C:\\Users\\david\\Documents\\Java Projects\\untitled\\src\\misc\\icon.svg");
        frame.setIconImage(img.getImage());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ventana primer = new ventana();
                primer.setTitle("Conversor");
                primer.setIconImage(img.getImage());
                primer.setLocationRelativeTo(null);
                primer.setVisible(true);
                primer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

    }
}