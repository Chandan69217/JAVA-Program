import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class design extends JFrame implements ActionListener,WindowListener
{
    TextArea ta;
    MenuBar mb;
    Menu file,edit,format,colour,help,fground,bground;
    MenuItem open,save,saveas,exit,copy,paste,rename,cut,replace,find,red,blue,green,orange,font,fsize;
    MenuItem tips,about;
  design()
  {
    setTitle("Menu Example");
    setBounds(0,0,777,555);
    setLayout(null);
   // setResizable(false);
    ta = new TextArea();
    ta.setBounds(0,0,getWidth()-12,getHeight()-59);
    ta.setFont(new Font("Arial",Font.BOLD,15));
    ta.setBackground(new Color(219,226,233));
    add(ta);
    mb = new MenuBar();
      //File Menu
    file = new Menu("File");
    file.add(open = new MenuItem("New"));
    file.add(open = new MenuItem("Open"));
    file.addSeparator();
    file.add(save = new MenuItem("Save"));
    file.add(saveas = new MenuItem("Save As"));
    file.addSeparator();
    file.add(exit = new MenuItem("Exit"));
    exit.addActionListener(this);
    file.addSeparator();
    mb.add(file);
     //Edit Menu
    edit = new Menu("Edit");
    edit.add(rename=new MenuItem("Rename"));
    edit.add(find=new MenuItem("Find"));
    edit.add(replace=new MenuItem("Replace"));
    edit.addSeparator();
    edit.add(copy=new MenuItem("Copy"));
    edit.add(cut=new MenuItem("Cut"));
    edit.add(paste=new MenuItem("Paste"));
    edit.addSeparator();
    mb.add(edit);
     //Format Menu
    format = new Menu("Format");
    mb.add(format);
      //Colours Menu
    colour = new Menu("Colours");
    colour.add(fground=new Menu("Foreground"));
    colour.add(bground=new Menu("Background"));
    fground.add(red = new MenuItem("Red Colour"));
    red.addActionListener(this);
    fground.add(green = new MenuItem("Green Colour"));
    green.addActionListener(this);
    bground.add(blue = new MenuItem("Blue Colour"));
    blue.addActionListener(this);
    bground.add(orange = new MenuItem("Orange Colour"));
    orange.addActionListener(this);
    format.add(colour);
     //Font & Font Size
    format.addSeparator();
    format.add(font = new MenuItem("Font"));
    format.add(fsize = new MenuItem("Font Size"));
    format.addSeparator();
    //Help Menu
    help = new Menu("Help");
    help.add(tips = new MenuItem("Tips and Trick"));
    help.addSeparator();
    help.add(about = new MenuItem("About"));
    mb.add(help);
    
    
    setMenuBar(mb);
    setVisible(true);
    addWindowListener(this);

  }
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==red)
    {
      ta.setForeground(Color.red);
    }
    else if(e.getSource()==green)
    {
      ta.setForeground(Color.green);
    }
    else if(e.getSource()==blue)
    {
      ta.setBackground(Color.blue);
    }
    else if(e.getSource()==orange)
    {
      ta.setBackground(Color.orange);
    }
    else if(e.getSource()==exit)
    {
      System.exit(0);
    }
  }

  public void windowDeactivated(WindowEvent e)
  {

  }

  public void windowActivated(WindowEvent e)
  {

  }

  public void windowDeiconified(WindowEvent e)
  {

  }
  public void windowIconified(WindowEvent e)
  {

  }

  public void windowClosed(WindowEvent e)
  {

  }
  
  public void windowClosing(WindowEvent e)
  { 
    dispose();
    System.out.println("Winlow Closed Successfully");
  }

  public void windowOpened(WindowEvent e)
  {

  }


}

class MenuDesign
{
    public static void main(String agrs[])
    {
        new design();
    }
}