
import java.awt.*;
import javax.swing.*;

public class StudentForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Student Form");

        JLabel l1 = new JLabel("Name:");
        JLabel l2 = new JLabel("ID:");
        JLabel l3 = new JLabel("Department:");
        JLabel l4 = new JLabel("Gender:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        JButton b = new JButton("Submit");
        JTextArea output = new JTextArea(5, 20);
        output.setEditable(false);

        f.setLayout(new GridLayout(0, 2, 5, 5));

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(l4);

        JPanel p = new JPanel();
        p.add(r1);
        p.add(r2);
        f.add(p);

        f.add(new JLabel(""));
        f.add(b);

        f.add(new JLabel("Output:"));
        f.add(new JScrollPane(output));

        b.addActionListener(e -> {
            String gender = "Not Selected";

            if (r1.isSelected())
                gender = "Male";
            else if (r2.isSelected())
                gender = "Female";

            output.setText(
                "Name: " + t1.getText() +
                "\nID: " + t2.getText() +
                "\nDepartment: " + t3.getText() +
                "\nGender: " + gender
            );
        });

        f.setSize(450, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
