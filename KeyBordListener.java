import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Design implements KeyListener ,TextListener , FocusListener
{
    Frame f1;
    TextField t1;
    TextArea t2;
    int fs=5;
    
    
    Design()  
    {
       f1 = new Frame("KeyBord Listener");
       f1.setBounds(80,100,600,500);
       f1.setLayout(null);
       f1.add(t1 = new TextField());
       f1.add(t2 = new TextArea());
       t1.setBounds(20,50,560,50);
       t2.setBounds(20,100,560,370);
       f1.setBackground(Color.BLUE);
       t1.addFocusListener(this);
       t2.addFocusListener(this);
       t2.addTextListener(this);
       t1.addKeyListener(this);
       f1.setVisible(true);

    }

    public void keyReleased(KeyEvent e)
    {
       int code;
       char chare;
       chare = e.getKeyChar();
       code = e.getKeyCode();
       JOptionPane.showMessageDialog(f1,"Released Key:-"+chare+"\nASCII Code:-"+code);
    }

    public void keyPressed(KeyEvent e)
    {
     /*  int code;
       char chare;
       chare = e.getKeyChar();
       code = e.getKeyCode();
       JOptionPane.showMessageDialog(f1,"Pressed Key:-"+chare+"\nASCII Code:-"+code);*/
    }

    public void keyTyped(KeyEvent e)
    {

    }

    public void textValueChanged(TextEvent e)
    {
       int total = (t2.getText()).length();
       f1.setTitle("Total Charectar:-"+Integer.toString(total));
       t2.setFont(new Font("arial",Font.BOLD,fs));
       fs=(fs+1)%40+5;
    }

    public void focusLost(FocusEvent e)
    {
        if(e.getSource()==t1)
        {
            t1.setBackground(Color.RED);
        }
        else if(e.getSource()==t2)
        {
            t2.setBackground(Color.RED);
        }
    }

    public void focusGained(FocusEvent e)
    {
         if(e.getSource()==t1)
        {
            t1.setBackground(Color.GREEN);
        }
        else if(e.getSource()==t2)
        {
            t2.setBackground(Color.GREEN);
        }
    }
}

class KeyBordListener
{
    public static void main(String agrs[])
    {
        new Design();
    }
}
