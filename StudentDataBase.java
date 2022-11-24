import java.util.*;

class StudentRecord
{
  String name;
  int Roll,clas,age;
  Scanner s2 = new Scanner(System.in);
  void input()
  {
    System.out.print("\nEnter Your Name:-");
    name = s2.nextLine();
    System.out.print("\nEnter Your Age:-");
    age=s2.nextInt();
    System.out.print("\nEnter Your Class:-");
    clas=s2.nextInt();
    System.out.print("\nEnter Your Roll NO:-");
    Roll=s2.nextInt();
  }
  void output()
  {
    System.out.print("\nName:-"+name);
    System.out.print("\nAge:-" + age);
    System.out.print("\nClass:-" + clas);
    System.out.println("\nRoll N0:-:-" +Roll);
  }
}

public class StudentDataBase
{ 
  Vector list = new Vector();
  int n=0,length = list.size(),cr=0;
  
  void first()
  {
    if(n==0)
    {
      System.out.print("\nRecord is Empty");
      return;
    }
    cr=0;
    StudentRecord x = (StudentRecord)list.elementAt(cr);
    x.output();
  }

  void last()
  {
    if(n==0)
    {
      System.out.print("Record is Empty");
      return;
    }
    cr=n-1;
    StudentRecord x = (StudentRecord)list.elementAt(cr);
    x.output();
  }

  void next()
  {
    if(n==0)
    {
      System.out.print("Record is Empty");
      return;
    }
    cr = (cr+1)%n;
    StudentRecord x = (StudentRecord)list.elementAt(cr);
    x.output();
  }

  void prev()
  {
    if(n==0)
    {
      System.out.print("\nRecord is Empty");
      return;
    }
    if(cr<0)
    {
      cr=n-1;
    }
    cr = (cr-1)%n;
    StudentRecord x = (StudentRecord)list.elementAt(cr);
    x.output();
  }
  
  void display()
  {
    if(n==0)
    {
      System.out.print("\nRecord is Empty");
      return;
    }
    
    System.out.println("\nList of Records");
    for(int i=0;i<n;i++)
    {
      StudentRecord x = (StudentRecord)list.elementAt(i);
      x.output();
    }
  }

  void rev_display() 
  {
    if (n == 0) 
    {
      System.out.print("\nRecord is Empty");
      return;
    }

    System.out.println("\nList of Records Reversly");
    for (int i = n-1; i >=0; i--) 
    {
      StudentRecord x = (StudentRecord) list.elementAt(i);
      x.output();
    }
  }

  void append() {
    StudentRecord x = new StudentRecord();
    x.input();
    list.addElement(x);
    n++;
  }

  void insert()
  {
    if(n==0)
    {
      System.out.print("\nVoid Insertion");
      return;
    }
    System.out.printf("\nEnter Record to insert\n");
    StudentRecord y = new StudentRecord();
    y.input();
    System.out.print("\nEnter Position to Insert:-");
    int i = (new Scanner(System.in)).nextInt();
    list.insertElementAt(y,i);
    n++;
  }

  void search()
  {  boolean f=false;
     int i;
     if (n == 0) 
     {
      System.out.print("\nRecord is Empty");
      return;
     } 
    System.out.printf("\nEnter Roll No to Search:-");
    int y = (new Scanner(System.in)).nextInt();
    for(i=0;i<n;i++)
    {
      StudentRecord s = (StudentRecord)list.elementAt(i);
      if(s.Roll==y)
      {
        f = true;
        break;
      }
    }
    if (f == false) 
    {
      System.out.println("\nRecord is not Present");
      return;
    }
    System.out.print("\nRecord is Present at Position "+i);

  }

  void sort()
  {
    int i,j;
    StudentRecord s1,s2,x;
    if(n==0)
    {
      System.out.print("\nRecord is Empty");
      return;
    }
     for(i=0;i<n-1;i++)
      {
        for(j=i+1;j<n;j++)
        {
          s1 = (StudentRecord)list.elementAt(i);
          s2 = (StudentRecord)list.elementAt(j);
          if(s1.name.compareToIgnoreCase(s2.name)>0)
          {
            x=(StudentRecord)list.elementAt(i);
            list.setElementAt(list.elementAt(j),i);
            list.setElementAt(x,j);
          }
        }
      }
      System.out.print("\nYour Record is sorted");
  }

  void update() 
  { int i;
    boolean f = false;
    if (n == 0) 
    {
      System.out.print("\nRecord is Empty");
      return;
    }
    System.out.printf("\nEnter Roll No to Update:-");
    int  y = (new Scanner(System.in)).nextInt();
    for(i=0;i<n;i++)
    {
      StudentRecord s = (StudentRecord)list.elementAt(i);
      if(s.Roll==y)
      {
        f = true;
        break;
      }
    }

    if (f==false) 
    {
      System.out.println("\nRecord is not Present");
      return;
    }
    System.out.print("\nEnter new Record\n");
    StudentRecord s = new StudentRecord();
    s.input();
    list.setElementAt(s,i);
    System.out.print("\nRecord is Updated at Position " + i);
  }

  void del() 
  { 
    int i;
    boolean f = false;
    if (n == 0) {
      System.out.print("\nRecord is Empty");
      return;
    }
    System.out.printf("\nEnter Roll No to Delete");
    int y = (new Scanner(System.in)).nextInt();
    for (i = 0; i < n; i++) 
    {
      StudentRecord s = (StudentRecord) list.elementAt(i);
      if (s.Roll == y) 
      {
        f = true;
        break;
      }
    }
    if (f==false) 
    {
      System.out.print("\nRecord is not Present");
      return;
    }
    System.out.print("\nRecord is Deleted at Position " + i);
    list.removeElementAt(i);
    list.trimToSize();
    n--;
  }

  void del_All() 
  {
    if (n == 0) 
    {
      System.out.print("\nRecord is Empty");
      return;
    }
    System.out.print("\nAll Records are Deleted");
    list.removeAllElements();
    list.trimToSize();
    n=0;
  }
  
  public static void main(String []agrs)
    { 
       int ch;
       StudentDataBase s1 = new StudentDataBase();
       do
         {
           System.out.print("\n\n1.First Record\n2.Last Record\n3.Next Record\n4.Prev Record");
           System.out.print("\n5.Display All\n6.Reversly Display All\n7.Append\n8.Insert\n9.Sort\n10.Seaarch");
           System.out.print("\n11.Update\n12.Delete\n13.Delete All\n0.Exit");
           System.out.print("\nEnter Your Choice:-");
           ch = (new Scanner(System.in)).nextInt();

           switch(ch) 
           {
             case 0: System.exit(0);
             case 1: s1.first();      break;
             case 2: s1.last();       break;
             case 3: s1.next();       break;
             case 4: s1.prev();       break;
             case 5: s1.display();    break;
             case 6: s1.rev_display();break;
             case 7: s1.append();     break;
             case 8: s1.insert(); break;
             case 9: s1.sort();          break;
             case 10: s1.search();    break;
             case 11: s1.update();    break;
             case 12: s1.del();       break;
             case  13: s1.del_All();  break;
           }
         }while(true);
      
    }
}

