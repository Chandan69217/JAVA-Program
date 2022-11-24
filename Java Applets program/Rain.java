import java.awt.Graphics;
//import java.awt.Color;
/* <applet  
 * code = "Rain.class"
 * Width = "800"
 * Height = "500" >
 * </applet>
 */
public class Rain extends java.applet.Applet implements Runnable
{ 
  Thread thread;
  int delay;
  int flag=0;
  int i=1;

  public void start()
  {  thread = new Thread(this);
     thread.start();
     delay=100;
  }
  
  public void run()
  {
    while(Thread.currentThread()==thread)
    {
      repaint();
      if(flag==0)
      {
        i=i+10;
      }
      else 
      {
        i=i-10;
      }

      if(i>=this.getWidth()-230)
      {
        flag=1;
      }
      if(i<=10)
      {
        flag=0;
      }

      try
      { if(i==571)
        thread.sleep(delay+2000);
        else
        thread.sleep(delay);
      }catch(InterruptedException e)
      {

      }
    }
  }
  public void paint(Graphics g)
  {   // Rain Logics
    for(int j=1;j<1500;j+=10)
     { int x = (int)(Math.random()*(this.getWidth()));
       int y = (int)(Math.random()*450);
       g.drawString("!", x,y);
     }
       // Floor Drawing
     for(int i=0;i<=this.getWidth();i+=10)
     { for(int j=450;j<=this.getHeight();j+=10)
       if(j>=450)
       g.drawLine(i,j,i+10,j+10);
     }
                     // Boy 
       // Head Drawing
     g.drawOval(i, 100, 80, 80);
     g.drawLine(i+40,180,i+40,350);
     g.drawLine(1,450,this.getWidth(),450);
       // Hand Drawing
     g.drawLine(i+40,190,i,250);  //Left Hand
     if(i==571)
     g.drawLine(i+80,280,i,250);
     else
     g.drawLine(i+40,300,i,250);
     g.drawLine(i+40,190,i+80,250); //Right Hand
     g.drawLine(i+40,300,i+80,250);
      // Leg Drawing
     g.drawLine(i+40,350,i,450); // Left Leg
     g.drawLine(i+40,350,i+80,450); // Right Leg

                     // Girl
     // Head Drawing
     g.drawOval(this.getWidth()-90, 100, 80, 80);
     g.drawLine(this.getWidth()-50, 180,this.getWidth()-50, 350);
     g.drawLine(1, 450, this.getWidth(), 450);
     // Hand Drawing
     g.drawLine(this.getWidth()-50, 190, this.getWidth()-90, 250); // Left Hand
     if(i==571)
     g.drawLine(this.getWidth()-150, 280, this.getWidth()-90, 250);
     else
     g.drawLine(this.getWidth()-50, 300, this.getWidth() - 90, 250);
     g.drawLine(this.getWidth()-50, 190, this.getWidth()-10, 250); // Right Hand
     g.drawLine(this.getWidth()-50, 300, this.getWidth()-10, 250);
     // Leg Drawing
     g.drawLine(this.getWidth()-50, 350,this.getWidth()-90, 450); // Left Leg
     g.drawLine(this.getWidth()-50, 350,this.getWidth()-10, 450); // Right Leg

     // Message 
    if(i==571)
    {
      g.drawString("HELLO!)",this.getWidth()-150,100);
    }
  }

  public void stop()
  {
    thread = null;
  }
}
