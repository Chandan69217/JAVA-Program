
public class Tokenizer implements java.awt.event.ActionListener
{   
    javax.swing.JFrame f1;
    java.awt.List ls1;
    java.awt.TextArea ta;
    javax.swing.JButton b1;
    String s;
    Tokenizer()
    {   //Frame Design
      f1 = new javax.swing.JFrame("Tockenizer");
      f1.setLayout(null);
      f1.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
      f1.setBounds(100,100,650,600);
        //TextArea Design
      ta = new java.awt.TextArea();
      ta.setBounds(20,50,350,500);
      f1.add(ta);
      f1.setVisible(true);
        //JList Design
      ls1 = new java.awt.List();
      ls1.setBounds(380,50,230,250);
      f1.add(ls1);
       //JButton Design
      b1 = new javax.swing.JButton("Find Tockens");
      b1.setBounds(250,10,120,30);
      b1.addActionListener(this);
      f1.add(b1);
    }
    public void actionPerformed(java.awt.event.ActionEvent evt)
    {
       if(evt.getSource()==b1)
       {
         findTokens(); 
       }
    }

    void findTokens()
    {   s=ta.getText();
        String s3;
        java.util.StringTokenizer s2 = new java.util.StringTokenizer(s);
        ls1.removeAll();
        int n = s2.countTokens();
        while(s2.hasMoreTokens())
        {
          s3 = s2.nextToken();
          ls1.add(s3);
        }        
        javax.swing.JOptionPane.showMessageDialog(f1,"Total Tokens:-"+n);
    }
    public static void main(String agrs[])
    {
       new Tokenizer();
    }
}