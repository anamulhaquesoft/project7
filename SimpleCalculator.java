
import java.awt.*;
import javax.swing.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Calculator");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField result = new JTextField();
        result.setEditable(false);

        JButton add = new JButton("+");
        JButton sub = new JButton("-");
        JButton mul = new JButton("*");
        JButton div = new JButton("/");

        f.setLayout(new GridLayout(5, 2, 5, 5));

        f.add(new JLabel("First Number:"));
        f.add(t1);
        f.add(new JLabel("Second Number:"));
        f.add(t2);
        f.add(new JLabel("Result:"));
        f.add(result);
        f.add(add);
        f.add(sub);
        f.add(mul);
        f.add(div);

        add.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("" + (a + b));
        });

        sub.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("" + (a - b));
        });

        mul.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            result.setText("" + (a * b));
        });

        div.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());

            if (b != 0)
                result.setText("" + (a / b));
            else
                JOptionPane.showMessageDialog(f,
                    "Cannot divide by zero!");
        });

        f.setSize(350, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
