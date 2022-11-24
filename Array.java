import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.TimerTask;
import java.util.Timer;

class Array extends TimerTask implements ActionListener

{   //Veriable Declearation
    JPanel p1;
    JButton b1,b2, b3, b4, b5, b6, b7, b8, b9, b10, b21, b22;
    JButton b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    List ls1;
    Choice cho;
    JLabel l1;
    GridLayout g1;
    JFrame f1;

    MenuBar mb;
    Menu read,del,rev,edit,about;
    MenuItem a1,a2,a3,a4,a5,a6;  // Read ka menuItem
    MenuItem c1,c2,c3,c4,c5,c6;  // del ka MenuItem
    MenuItem d1,d2; // reverse ka menuItem
    MenuItem e1,e2,e3,e4,e5; // Edit && about ka menuItem 

    int info[]=new int[100];
    int i,j,x,f,n=0,count=0;
   
    Array()
    {     // Frame Design
        f1 = new JFrame();
        f1.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\Programs\\Java Programs\\icons.PNG"));
        f1.setBounds(50, 100, 500, 500);
        f1.setTitle("Array Operation");
        f1.setLayout(null);
        f1.setResizable(false);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g1 = new GridLayout(11,2,5,5);
          
           // Label Design
        f1.add(l1 = new JLabel("Content of Array",JLabel.CENTER));
        l1.setBounds(10,30,120,20);     
          // ListBox Design
        f1.add(ls1 = new List());
        ls1.setBounds(10, 50, 120, 350);
          // ComboBox Design
        f1.add(cho = new Choice()); 
        cho.setBounds(135,50,135,350);
        
          //Buttons Design
        f1.add(p1 = new JPanel(g1));
        p1.setBounds(275,50,200,350);
        
        p1.add(b1  = new JButton("First"));
        b1.addActionListener(this);
        p1.add(b2  = new JButton("Next"));
        b2.addActionListener(this);
        p1.add(b3  = new JButton("Prev"));
        b3.addActionListener(this);
        p1.add(b4  = new JButton("Last"));
        b4.addActionListener(this);
        p1.add(b5  = new JButton("Ins End"));
        b5.addActionListener(this);
        p1.add(b6  = new JButton("Ins Begin"));
        b6.addActionListener(this);
        p1.add(b7  = new JButton("Ins After"));
        b7.addActionListener(this);
        p1.add(b8  = new JButton("Ins Before"));
        b8.addActionListener(this);
        p1.add(b9  = new JButton("Ins Between"));
        b9.addActionListener(this);
        p1.add(b10 = new JButton("Del"));
        b10.addActionListener(this);
        p1.add(b11 = new JButton("Del End"));
        b11.addActionListener(this);
        p1.add(b12 = new JButton("Del Begin"));
       //p1.add(b12 = new JButton(new ImageIcon("D:\\Programs\\Java Programs\\icons.png")));
        b12.addActionListener(this);
        p1.add(b13 = new JButton("Del After"));
        b13.addActionListener(this);
        p1.add(b14 = new JButton("Del Before"));
        b14.addActionListener(this);
        p1.add(b15 = new JButton("Del Between"));
        b15.addActionListener(this);
        p1.add(b16 = new JButton("Sort"));
        b16.addActionListener(this);
        p1.add(b17 = new JButton("Search"));
        b17.addActionListener(this);
        p1.add(b18 = new JButton("Update"));
        b18.addActionListener(this);
        p1.add(b19 = new JButton("Phy Rev"));
        b19.addActionListener(this);
        p1.add(b20 = new JButton("Log Rev"));
        b20.addActionListener(this);
        p1.add(b21 = new JButton("Exit"));
        b21.addActionListener(this);
        p1.add(b22 = new JButton("Read"));
        b22.addActionListener(this);

        // MenuBar Desigs Start from hare
        mb = new MenuBar();
          // Read Menu
        mb.add(read = new Menu("Read"));
        read.add(a1 = new MenuItem("Read"));
        read.addSeparator();
        read.add(a2 = new MenuItem("Insert End"));
        read.add(a3 = new MenuItem("Insert Begin"));
        read.addSeparator();
        read.add(a4 = new MenuItem("Insert After"));
        read.add(a5 = new MenuItem("Insert Before"));
        read.addSeparator();
        read.add(a6 = new MenuItem("Insert Between"));
          
          // Delete Menu
        mb.add(del = new Menu("Delete"));
        del.add(c1 = new MenuItem("Delete"));
        del.addSeparator();
        del.add(c2 = new MenuItem("Delete End"));
        del.add(c3 = new MenuItem("Delete Begin"));
        del.addSeparator();
        del.add(c4 = new MenuItem("Delete After"));
        del.add(c5 = new MenuItem("Delete Before"));
        del.addSeparator();
        del.add(c6 = new MenuItem("Delete Between"));
          
          // Reverse Menu
        mb.add(rev = new Menu("Reverse"));
        rev.add(d1 = new MenuItem("Physically Reverse"));
        rev.addSeparator();
        rev.add(d2 = new MenuItem("Logically Reverse"));

          // Edit Menu
        mb.add(edit = new Menu("Edit"));
        edit.add(e1 = new MenuItem("Search"));
        edit.add(e4 = new MenuItem("Sort"));
        edit.addSeparator();
        edit.add(e2 = new MenuItem("Update"));
        edit.addSeparator();
        edit.add(e3 = new MenuItem("Exit"));

          // About Menu:
        mb.add(about = new Menu("About"));
        about.add(e5 = new MenuItem("About Program"));

        f1.setMenuBar(mb);

        // Adding ActionListener to MenuBar
        a1.addActionListener(this);
        a2.addActionListener(this);
        a3.addActionListener(this);
        a4.addActionListener(this);
        a5.addActionListener(this);
        a6.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);
        c5.addActionListener(this);
        c6.addActionListener(this);
        d1.addActionListener(this);
        d2.addActionListener(this);
        e1.addActionListener(this);
        e2.addActionListener(this);
        e3.addActionListener(this);
        e4.addActionListener(this);
        e5.addActionListener(this);
        about.addActionListener(this);

        f1.setVisible(true);
    }
 
    void insertEnd()
    {  
       x=Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter a No:-"));
       info[n]=x;
       n++;
       display();
    }

    void insertBegin()
    {  
       x = Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter a No:-"));
       for(i=n-1;i>=0;i--)
       {
         info[i+1]=info[i];
       }

       info[0]=x;
       n++;
       display();
    }

    void insertAfter()
    {  int y,p;
      
       y=Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter no to insert after:-"));
       p=searchPosition(y);
       if(p==-1)
       {
        JOptionPane.showMessageDialog(f1,Integer.toString(y)+" is Not Present");
        return;
       }
       for(i=n-1;i>p;i--)
       {
         info[i+1]=info[i];
       }  
       x = Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter a no:-"));
       info[p+1]=x;
       n++;
       display();
       
    }

    void insertBefore()
    { 
        int y, p;

        y = Integer.parseInt(JOptionPane.showInputDialog(f1, "Enter no to insert Before:-"));
        p = searchPosition(y);
        if (p == -1) {
            JOptionPane.showMessageDialog(f1, Integer.toString(y) + " is Not Present");
            return;
        }
        for (i = n - 1; i >=p; i--) {
            info[i + 1] = info[i];
        }
        x = Integer.parseInt(JOptionPane.showInputDialog(f1, "Enter a no:-"));
        info[p] = x;
        n++;
        display();

    }

    void insertBetween()
    { 
        int y,z,p1,p2;

        y = Integer.parseInt(JOptionPane.showInputDialog(f1, "Enter first range:-"));
        z = Integer.parseInt(JOptionPane.showInputDialog(f1, "Enter Second range:-"));
        p1 = searchPosition(y);
        p2 = searchPosition(z);
        if (p1 == -1||p2==-1||p1+1!=p2) {
            JOptionPane.showMessageDialog(f1,"Void Insertion");
            return;
        }
        for (i = n - 1; i > p1; i--) {
            info[i + 1] = info[i];
        }
        x = Integer.parseInt(JOptionPane.showInputDialog(f1, "Enter a no:-"));
        info[p1 + 1] = x;
        n++;
        display();
    }

    void del()
    { int p;
      x=Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter no to delete:-"));
      p=searchPosition(x);
      if(p==-1)
      {
        JOptionPane.showMessageDialog(f1,Integer.toString(x)+" is not Present");
        return;
      }
      int c = JOptionPane.showConfirmDialog(f1,"Are You Sure to Delete(y/n):");
      if(c==0)
      {
        for(i=p+1;i<n;i++)
        {
        info[i-1]=info[i];
        }
        n--;
      }
      display();
    }

    void delEnd()
    {   
        int c = JOptionPane.showConfirmDialog(f1, "Are You Sure to Delete(y/n):");
        if (c ==0) {
            x = info[n - 1];
            JOptionPane.showMessageDialog(f1, Integer.toString(x) + " is Deleted");
            n--;
        }
        display();

    }

    void delBegin()
    { 
        int c = JOptionPane.showConfirmDialog(f1, "Are You Sure to Delete(y/n):");
        if (c ==0) {
            x=info[0];
            for(i=1;i<n;i++)
            {
                info[i-1]=info[i];
            }
            JOptionPane.showMessageDialog(f1, Integer.toString(x) + " is Deleted");
            n--;
        }
        display();
    }

    void delAfter()
    {
        int p;
        x = Integer.parseInt(JOptionPane.showInputDialog(f1, "Enter no to delete after:-"));
        p = searchPosition(x);
        if (p == -1||p==n-1) {
            JOptionPane.showMessageDialog(f1,"Void Deletion");
            return;
        }
        int c = JOptionPane.showConfirmDialog(f1, "Are You Sure to Delete(y/n):");
        if (c == 0) {
            for (i = p + 2; i < n; i++) {
                info[i - 1] = info[i];
            }
            n--;
        }
        display();
    }

    void delBefore()
    { 
        int p;
        x = Integer.parseInt(JOptionPane.showInputDialog(f1, "Enter no to delete before:-"));
        p = searchPosition(x);
        if (p == -1 || p == 0) {
            JOptionPane.showMessageDialog(f1, "Void Deletion");
            return;
        }
        int  c = JOptionPane.showConfirmDialog(f1,"Do you Want to Delete(y/n):");
        if (c==0) {
            for (i = p ; i < n; i++) {
                info[i - 1] = info[i];
            }
            n--;
        }
        display();
    }

    void delBetween()
    {  int y,z,p1,p2;
       y=Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter First Range:-"));
       z = Integer.parseInt(JOptionPane.showInputDialog(f1, "Enter Second Range:-"));
       p1=searchPosition(y);
       p2=searchPosition(z);
       if(p1==-1||p2==-1||p1+1==p2)
       {
         JOptionPane.showMessageDialog(f1,"VOid Deletion");
         return;
       }
       int c = JOptionPane.showConfirmDialog(f1,"Are You Sure to Delete(y/n):");
       if(c==0)
       {
         while(info[p1+1]!=z)
         {
            for(i=p2;i<n;i++)
            {
                info[i-1]=info[i];
            }
            p2--;
            n--;
         }
       }
       display();

    }

    void sort()
    {
      for(i=n-1;i>1;i--)
      {
        for(j=0;j<i;j++)
        {
            if(info[j]>info[j+1])
            {
                x = info[j];
                info[j]=info[j+1];
                info[j+1]=x;
            }
        }
      }
      display();
    }

    void search()
    {  x=Integer.parseInt(JOptionPane.showInputDialog(f1,"Enter no to Search:-"));
       int p = searchPosition(x);
       if(p==-1)
       {
        JOptionPane.showMessageDialog(f1,Integer.toString(x)+" is not Present");
        return;
       }
       JOptionPane.showMessageDialog(f1, Integer.toString(x) + " is Present at Positon "+Integer.toString(p));
    }

    void update()
    { 
        x = Integer.parseInt(JOptionPane.showInputDialog(f1, "Enter no to Update:-"));
        int p = searchPosition(x);
        if (p == -1) {
            JOptionPane.showMessageDialog(f1, Integer.toString(x) + " is not Present");
            return;
        }
        x = Integer.parseInt(JOptionPane.showInputDialog(f1, "Enter new no:-"));
        info[p]=x;
        display();
    }

    void physicallyRev()
    {
       for(i=0,j=n-1;i<n/2;i++,j--)
       {
          x=info[i];
          info[i]=info[j];
          info[j]=x;
       }
       display();
    }

    void logicallyRev()
    {
        int k;
        ls1.clear();
        for (k = n-1; k >=0; k--) {
            ls1.addItem(Integer.toString(info[k]));
        }
    }

    void first()
    {count = 0;
     ls1.select(count);
     cho.select(count);
    }

    void next()
    {   ls1.select(count);
        cho.select(count);
        count = (count+1) % n;
    }
    void prev()
    {   if(count<0)
        {
            count = n-1;
        }
        ls1.select(count);
        cho.select(count);
        count=(count-1)%n;
    }

    void last()
    {
      count = n-1;
      ls1.select(count);
      cho.select(count);
    }

    void display()
    {  int k;
        ls1.clear();
        cho.removeAll();
        for(k=0;k<n;k++)
        {
            ls1.addItem(Integer.toString(info[k]));
            cho.addItem(Integer.toString(info[k]));
        }
    }
    
    int searchPosition(int y)
    {  int k;
       for(k=0;k<n;k++)
       {
         if(info[k]==y)
         {
            return(k);
         }
       }

       return(-1);
    }

    void about()
    {
     JOptionPane.showMessageDialog( null,"Hello!!\nThis Program Made By Chandan Sharma, Student of BCA Department Gaya College,Gaya\nSection:-A\nRoll No:-24\nTo Handle all Operation performed in a single dimensional Array");
    }

    public void actionPerformed(ActionEvent evt)
    {
      if(evt.getSource()==b21||evt.getSource()==e3)
      {
        System.exit(0);
      }
      else  if(evt.getSource()==b1)
      {
          first();
      }
      else if (evt.getSource() == b2) 
      {
          next();
      }
      else if (evt.getSource() == b3) 
      {
          prev();
      }
      else if (evt.getSource() == b4) 
      {
          last();
      }
      else if (evt.getSource() == b5 || evt.getSource() == a2) 
      {
          insertEnd();
      }
      else if (evt.getSource() == b6 || evt.getSource() == a3) 
      {
            insertBegin();
      }
      else if (evt.getSource() == b7 || evt.getSource() == a4) 
      {
           insertAfter();
      }
      else if (evt.getSource() == b8 || evt.getSource() == a5) 
      {
           insertBefore();
      }
      else if (evt.getSource() == b9 || evt.getSource() == a6) 
      {
          insertBetween();
      }
      else if (evt.getSource() == b10 || evt.getSource() == c1) 
      {
          del();
      }
      else if (evt.getSource() == b11 || evt.getSource() == c2) 
      { 
         delEnd();
      }
      else if (evt.getSource() == b12 || evt.getSource() == c3) 
      {
         delBegin();
      }
      else if (evt.getSource() == b13 || evt.getSource() == c4) 
      {
         delAfter();
      }
      else if (evt.getSource() == b14 || evt.getSource() == c5) 
      {
            delBefore();
      }
      else if (evt.getSource() == b15 || evt.getSource() == c6)
      {
            delBetween();
      }
      else if (evt.getSource() == b16 || evt.getSource() == e4) 
      {
            sort();
      }
      else if (evt.getSource() == b17 || evt.getSource() == e1) 
      {
          search();
      }
      else if (evt.getSource() == b18 || evt.getSource() == e2) 
      {
            update();
      }
      else if (evt.getSource() == b19 || evt.getSource() == d1) 
      {
            physicallyRev();
      }
      else if (evt.getSource() == b20 || evt.getSource() == d2) 
      {
          logicallyRev();
      }
      else if (evt.getSource() == b22 || evt.getSource() == a1) 
      {
            insertEnd();
      }
      else if(evt.getSource()==e5)
      {
          about();
      }
    }

    public void run()
    {  
       b1.setEnabled(n>0); 
       b4.setEnabled(n>0);  
       b2.setEnabled(n>1);
       b3.setEnabled(n>1);
       b5.setEnabled(n>0);
       b6.setEnabled(n>0);
       b7.setEnabled(n>0);
       b8.setEnabled(n>0);
       b9.setEnabled(n>1);
       b10.setEnabled(n>0);
       b11.setEnabled(n>1);
       b12.setEnabled(n>1);
       b13.setEnabled(n>1);
       b14.setEnabled(n>1);
       b15.setEnabled(n>2);
       b16.setEnabled(n>1);
       b17.setEnabled(n>0);
       b18.setEnabled(n>0);
       b19.setEnabled(n>1);
       b20.setEnabled(n>1);

       a2.setEnabled(n > 0);
       a3.setEnabled(n > 0);
       a4.setEnabled(n > 0);
       a5.setEnabled(n > 0);
       c1.setEnabled(n > 0);
       e1.setEnabled(n > 0);
       e2.setEnabled(n > 0);

       a6.setEnabled(n > 1);
       c2.setEnabled(n > 1);
       c3.setEnabled(n > 1);
       c4.setEnabled(n > 1);
       c5.setEnabled(n > 1);
       d1.setEnabled(n > 1);
       d2.setEnabled(n > 1);
       e4.setEnabled(n > 1);

       c6.setEnabled(n > 2);

    }
    public static void main(String[] agrs)
    {  
      
       Array a1 = new Array(); 
       Timer R = new Timer();
       R.schedule(a1,100,10);
    }
}