import java.awt.event.*;
import java.time.chrono.JapaneseChronology;

import javax.swing.*;
import java.awt.*;

public class practic extends JFrame implements WindowListener
{   JRadioButton r1;
    JToggleButton t1;
    JProgressBar p1;
    JPanel p2;
    practic()
    { 
        setBounds(0,0,600,500);
        setLayout(new FlowLayout());
        add(p2 = new JPanel(new GridLayout(4,4)));
        p2.setBounds(0,0,getWidth(),getHeight());
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentpane().setLayout(layout);
        addWindowListener(this);
        p2.add(t1 = new JToggleButton("Hell0"));
        //t1.setBounds(0,0,55,40);
        setVisible(true);
        
    }

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    public static void main(String []agrs)
    {
        new practic();
    }
}
