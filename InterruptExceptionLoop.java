import javax.swing.*;
import java.awt.event.*;
public class InterruptExceptionLoop extends JFrame implements Runnable,ActionListener{
    JLabel l1;
    JButton b1,b2;
    int i,j,k;
    Thread d2;
    InterruptExceptionLoop(){
    setTitle("Timer");
    setLayout(null);
    setBounds(450,250,250,150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    b1 = new JButton("Stop");
    b1.setBounds(15,70,80,30);
    b1.addActionListener(this);
    b2 = new JButton("Reset");
    b2.addActionListener(this);
    b2.setBounds(140,70,80,30);
    add(b1);add(b2);
    l1 = new JLabel("00:00:00",JLabel.CENTER);
    l1.setBounds(10,20,215,30);
    add(l1);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent evt){
       if(evt.getSource()==b1){
        try{
            d2.wait();
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            System.err.println("Thread Interrupted");
        }
       }
       else if(evt.getSource()==b2){
            ad2.notify();
            l1 = new JLabel("00:00:00", JLabel.CENTER);
            i=0;j=0;k=0;
       }
    }
    public void run(){
        for(i = 0 ;i<60;i++){
            for(j=0;j<60;j++){
                for(k=0;k<60;k++){
                    l1.setText(Integer.toString(i)+":"+Integer.toString(j)+":"+Integer.toString(k));
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        System.out.print("\nInterrupted");
                    }
                    
                }
            }
        }
    }
    public static void main(String agrs[]){   
        InterruptExceptionLoop a2 = new InterruptExceptionLoop();
        Thread d2 = new Thread(a2);
        d2.start();
    }
}
