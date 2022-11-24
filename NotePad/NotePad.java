import Source.Function;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;



public  class NotePad extends Function implements ActionListener, KeyListener
{ 
   public NotePad()
   {
       // Frame Design
    f1 = new JFrame();
    f1.setTitle("Notepad");
    f1.setBounds(150,80,width,height);
    f1.setLayout(null);
    f1.setResizable(false);
    f1.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programs\\Java Programs\\NotePad\\Source file\\Notepad.png"));
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //Menu Design
    f1.setJMenuBar(mb=new JMenuBar());
    mb.add(file = new JMenu("File"));
    mb.add(edit = new JMenu("Edit"));
    mb.add(view = new JMenu("View"));
      //TextArea Designm
   ta=new TextArea();
   ta.setBounds(2, 2, width-20,height-65);  
   ta.setFont(new Font("Arial",Font.BOLD,14));
   f1.add(ta);
      // File MenuItem Design
   file.add(ne = new JMenuItem("New"));
   ne.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
   file.add(win = new JMenuItem("New window"));
   win.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_MASK|KeyEvent.SHIFT_MASK));
   file.add(open = new JMenuItem("Open"));
   open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_MASK));
   file.add(save = new JMenuItem("Save"));
   save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_MASK));
   file.add(saveas = new JMenuItem("Save as"));
   saveas.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_MASK|KeyEvent.SHIFT_MASK));
   file.addSeparator();
   file.add(page = new JMenuItem("Page setup"));
   file.add(print = new JMenuItem("Print"));
   print.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_MASK));
   file.addSeparator();
   file.add(exit=new JMenuItem("Exit"));   
     // Edit MenuItem Design
   edit.add(undo = new JMenuItem("Undo"));
   undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,KeyEvent.CTRL_MASK));
   edit.addSeparator();
   edit.add(cut = new JMenuItem("Cut"));
   cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_MASK));
   edit.add(copy = new JMenuItem("Copy"));
   copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_MASK));
   edit.add(paste = new JMenuItem("Paste"));
   paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_MASK));
   edit.add(del = new JMenuItem("Delete"));
   del.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,KeyEvent.CTRL_MASK));
   edit.addSeparator();
   edit.add(find = new JMenuItem("Find"));
  find.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, KeyEvent.CTRL_MASK));
   edit.add(findnext = new JMenuItem("Find next"));
  findnext.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,KeyEvent.CTRL_DOWN_MASK));
   edit.add(findprev = new JMenuItem("Find Previous"));
   findprev.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,KeyEvent.SHIFT_MASK));
   edit.add(replace = new JMenuItem("Replace"));
   replace.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,KeyEvent.CTRL_MASK));
   edit.add(go = new JMenuItem("Go to"));
   go.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_MASK));
   edit.addSeparator();
   edit.add(select = new JMenuItem("Select all"));
  select.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
   edit.add(time = new JMenuItem("Time/Date"));
  time.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,KeyEvent.CTRL_MASK));
   edit.addSeparator();
   edit.add(font = new JMenu("Font"));
   font.add(ffamily=new JMenuItem("Font Family"));
   font.add(fstyle=new JMenuItem("Font Style"));
   font.add(fsize=new JMenuItem("Font Size"));
     // View MenuItem Design
   view.add(zoom = new JMenuItem("Zoom"));
   view.add(status = new JMenuItem("Status bar"));
   view.add(word = new JMenuItem("Word wrap")); 

    //  ActionListener
   ne.addActionListener(this);
   win.addActionListener(this);
   open.addActionListener(this);
   save.addActionListener(this);
   saveas.addActionListener(this);
   page.addActionListener(this);
   print.addActionListener(this);
   exit.addActionListener(this);
   undo.addActionListener(this);
   cut.addActionListener(this);
   copy.addActionListener(this);
   paste.addActionListener(this);
   del.addActionListener(this);
   find.addActionListener(this);
   findnext.addActionListener(this);
   findprev.addActionListener(this);
   replace.addActionListener(this);
   go.addActionListener(this);
   select.addActionListener(this);
   time.addActionListener(this);
   ffamily.addActionListener(this);
   fstyle.addActionListener(this);
   fsize.addActionListener(this);
   zoom.addActionListener(this);
   status.addActionListener(this);
   word.addActionListener(this);
   
   f1.setVisible(true);
   }  

   public void actionPerformed(ActionEvent evt)
   {  
     if(evt.getSource()==ne)
     {
     if(true)
      { JOptionPane.showConfirmDialog(f1,"Do you want save changes:");
      }
      new1();
     }
     else if(evt.getSource()==win)
     { 
       new NotePad();
     }
     else if(evt.getSource()==open)
     {
      JFileChooser file1 = new JFileChooser();
      int i = file1.showOpenDialog(f1);
     }
     else if(evt.getSource()==save)
     {
      JFileChooser save1 = new JFileChooser();
      int i = save1.showSaveDialog(f1);
     }
     else if(evt.getSource()==saveas)
     {
      JFileChooser saveas1 = new JFileChooser();
      saveas1.setDialogTitle("Save as");
      int i = saveas1.showSaveDialog(f1);
     }
     else if(evt.getSource()==exit)
     {
      System.exit(0);
     }
     else if(evt.getSource()==paste) 
     {
       paste();
     }

    else if(evt.getSource()==cut) 
    {
      cut();
    }
    else if(evt.getSource()==copy)
    {
      copy();
    }
    else if(evt.getSource()==del)
    {
      del();
    }
    else if(evt.getSource()==find)
    {
       find();
    }
    else if(evt.getSource()==print)
    {
        print(); 
    }
    else if(evt.getSource()==replace)
    {
      replace();
    }
    else if(evt.getSource()==select)
    {
      select();
    }
  }

   public void keyReleased(KeyEvent evt)
   {

   }
   public void keyPressed(KeyEvent evt)
   {

   }
   public void keyTyped(KeyEvent evt)
   {

   }


  
  public static void main(String agrs[]) 
  {
     new NotePad();
  }
}
