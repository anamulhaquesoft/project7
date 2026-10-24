
import javax.swing.*;

public class DisplayImageExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Display Images");

        ImageIcon img = new ImageIcon("pic.png");
        JLabel l = new JLabel(img);

        f.add(l);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
