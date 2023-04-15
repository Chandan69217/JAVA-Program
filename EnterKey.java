import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EnterKey extends JFrame {

    private static final long serialVersionUID = 1L;

    String name;

    public EnterKey() {

        setLayout(new BorderLayout());

        JLabel enterYourName = new JLabel("Enter Your Name Here:");
        JTextField textBoxToEnterName = new JTextField(21);
        JPanel panelTop = new JPanel();
        panelTop.add(enterYourName);
        panelTop.add(textBoxToEnterName);

        JButton submit = new JButton("Submit");
        submit.addActionListener(this);
        submit.addKeyListener(this);
        JPanel panelBottom = new JPanel();
        panelBottom.add(submit);

        // Add panelTop to JFrame
        add(panelTop, BorderLayout.NORTH);
        add(panelBottom, BorderLayout.SOUTH);

        // JFrame set-up
        setTitle("Name Prompt Program");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        EnterKey promptForName = new EnterKey();
        promptForName.setVisible(true);
    }

}