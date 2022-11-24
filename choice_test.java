import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import java.sql.*;

class choice_test extends JFrame {
    Connection con = null;
    JButton jb1;
    Choice ch1, ch2;

    public choice_test() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container pane = getContentPane();
        pane.setLayout(null);

        JLabel l1 = new JLabel("Item1");
        l1.setBounds(100, 100, 50, 20);
        final JTextField t1 = new JTextField(5);
        JLabel l2 = new JLabel("Item2");
        l2.setBounds(100, 200, 50, 20);
        final JTextField t2 = new JTextField(10);
        jb1 = new JButton("Reset");
        jb1.setBounds(350, 300, 100, 20);

        ch1 = new Choice();
        ch1.setBounds(160, 100, 50, 20);
        ch2 = new Choice();
        ch2.setBounds(160, 200, 50, 20);
        try {
            // con = db_connect.getConnection();
            Statement st1 = con.createStatement();
            ResultSet rs1 = st1.executeQuery("select item1 from emp");

            while (rs1.next()) {
                ch1.addItem(rs1.getString(1));

            }
            rs1.close();
            st1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ch1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == ch1) {
                    t1.setText(ch1.getSelectedItem());
                }

                try {
                    String sql1 = "select item2 from det_item where item1=?";

                    PreparedStatement ps1 = con.prepareStatement(sql1);
                    ps1.setString(1, t1.getText());
                    ResultSet prs1 = ps1.executeQuery();
                    while (prs1.next()) {
                        ch2.addItem(String.valueOf(prs1.getInt(1)));
                    }
                    prs1.close();
                    ps1.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }

            }
        });
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (ae.getSource() == jb1) {
                    t1.setText(null);
                    t2.setText(null);

                 //   ch2.setChoices(null);
                }
            }
        });

        pane.add(l1);
        pane.add(l2);
        pane.add(t1);
        pane.add(t2);
        pane.add(ch1);
        pane.add(ch2);
        pane.add(jb1);
        pane.add(jb1);

        pack();
        setSize(800, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new choice_test();
    }
}
