import java.awt.*;        
import java.awt.event.*; 
import javax.swing.*; 


class AWTCounter extends Frame 
{
   Label l1;    
   JTextField t1; 
   JButton b1;   
   int count = 0;     

   
   AWTCounter () 
   {
      setLayout(new FlowLayout());
      l1 = new Label("Counter"); 
      add(l1);       
      t1 = new JTextField(count + "", 10);
      t1.setEditable(false);       
      add(t1);   
      b1 = new JButton("Count");   
      add(b1);                    
     // BtnCountListener listener = new BtnCountListener();
      //b1.addActionListener(listener);
      setTitle("AWT Counter");  
      setSize(300, 100);    
      setVisible(true);     
   }

  public static void main(String[] args) 
  {
         /*AWTCounter app*/  new AWTCounter();
  }
 /* class BtnCountListener implements ActionListener 
  {
     
      public void actionPerformed(ActionEvent evt) 
      {
         ++count; 
         t1.setText(count + ""); 
      }
   }*/
}