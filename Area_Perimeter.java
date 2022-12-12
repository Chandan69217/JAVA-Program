import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.TimerTask;
import java.util.Timer;

class design extends TimerTask implements ActionListener
{
    JFrame f1;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3;
    JButton Area,Perimeter,Reset,Exit;

    design()
    {     //Frame Design
        f1 = new JFrame("Rectangle");
        f1.setBounds(100,200,400,250);
       // f1.setBackground(new Color(224,231,34));
        f1.setLayout(new GridLayout(5,2,5,10));
        f1.setResizable(false);
          //Label / TextField / Button  Design
        f1.add(l1=new JLabel("Enter Lenght:-",Label.CENTER));
       // l1.setForeground(new Color(8,39,245));
        l1.setFont(new Font("Giulio",Font.BOLD,14));
        //l1.setBackground(new Color(199,36,177));
        
        f1.add(t1=new JTextField());
        //t1.setForeground(new Color(8,39,245));
       // t1.setBackground(new Color(224,231,34));
        t1.setFont(new Font("",Font.BOLD,12));
        t1.addActionListener(this);
        
        f1.add(l2=new JLabel("Enter Breadth:-",Label.CENTER));
        //l2.setForeground(new Color(8,39,245));
        l2.setFont(new Font("Giulio",Font.BOLD,14));
        //l2.setBackground(new Color(68,114,229));
        
        f1.add(t2=new JTextField());
        //t2.setForeground(new Color(8,39,245));
       // t2.setBackground(new Color(224,231,34));
        t2.setFont(new Font("",Font.BOLD,12));
        t2.addActionListener(this);
        
        f1.add(l3=new JLabel("Result:-",Label.CENTER));
       // l3.setForeground(new Color(8,39,245));
        l3.setFont(new Font("Giulio",Font.BOLD,14));
        //l3.setBackground(new Color(68,114,229));
        
        f1.add(t3=new JTextField());
       // t3.setForeground(new Color(8,39,245));
       // t3.setBackground(new Color(224,231,34));
        t3.setFont(new Font("",Font.BOLD,12));
        t3.setEditable(false);
        
        f1.add(Area=new JButton("AREA"));
       // Area.setForeground(new Color(57,61,71));
       // Area.setBackground(new Color(68,214,44));
        Area.setFont(new Font("",Font.BOLD,16));
        Area.addActionListener(this);
        
        f1.add(Perimeter=new JButton("PERIMETER"));
       // Perimeter.setForeground(new Color(57,61,71));
       // Perimeter.setBackground(new Color(219,62,177));
        Perimeter.setFont(new Font("",Font.BOLD,16));
        Perimeter.addActionListener(this);
        
        f1.add(Reset=new JButton("RESET"));
       // Reset.setForeground(new Color(57,61,71));
       // Reset.setBackground(new Color(255,173,0));
        Reset.setFont(new Font("",Font.BOLD,16));
        Reset.addActionListener(this);
        
        f1.add(Exit=new JButton("EXIT"));
        //ṇf1.add(Exit = new JButton(new ImageIcon("D:\\Programs\\Java Programs\\icons.png")));
        //Exit.setForeground(new Color(57,61,71));
        //Exit.setBackground(new Color(210,39,48));
        Exit.setFont(new Font("",Font.BOLD,16));
        Exit.addActionListener(this);
        f1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {   
        int l,b,area,peri;
        if(e.getSource()==Area)
        {
           l = Integer.parseInt(t1.getText());
           b = Integer.parseInt(t2.getText());
           area = l*b;
           t3.setText(Integer.toString(area));
           l3.setText("Area:-");
        }
        else if(e.getSource()==Perimeter)
                {
                    l = Integer.parseInt(t1.getText());
                    b = Integer.parseInt(t2.getText());
                    peri = 2*(l+b);
                    t3.setText(Integer.toString(peri));
                    l3.setText("Perimeter:-");
                }
                else if(e.getSource()==Reset)
                        {
                            t1.setText("");
                            t2.setText("");
                            t3.setText("");
                            l3.setText("Result:-");
                            t1.requestFocus();
                        }
                        else if(e.getSource()==Exit)
                                {
                                    System.exit(0);
                                }
                               else if(e.getSource()==t1 && (t1.getText()).length()>0)
                                       t2.requestFocus();
                                        else if(e.getSource()==t2 && (t2.getText()).length()>0)
                                        Area.requestFocus();
    }

    public void run()
    {
        Area.setEnabled((t1.getText()).length()>0 && (t2.getText()).length()>0);
        Perimeter.setEnabled((t1.getText()).length()>0 && (t2.getText()).length()>0);
        Reset.setEnabled((t3.getText()).length()>0);
    }
}

class Area_Perimeter
{
    public static void main(String agrs[])
    {   
        design D2 = new design();
        Timer R2 = new Timer();
        R2.schedule(D2,100,10);

    }
}