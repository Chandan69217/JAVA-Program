import java.util.*;
public class Global_Variable
{  Global_Variable()
   {
     final int size = 7;
     public int rear1 = -1 , front1 = -1 , rear2 = size , front2 = size;
     public int info[size];
   }
}

class Queue
{
    void enqueue(int ch)
    {
        switch(ch)
        {   int i,j;
            case 1: if(rear1+1==rear2)
                     { if(front == -1)
                       {
                          System.out.print("\nQueue1 is Full");
                          return;
                       }
                       for(i=front1,j=0;i<=rear1;i++,j++)
                       {
                         info[j] = info[i];
                       }
                       rear1 = j-1;
                       front1 = -1; 
                     }
                    System.out.print("\nEnter a Value:-");
                    info[++rear1] = (new Scanner(System.in)).nextInt();
            break;
            case 2: if(rear1 == rear2-1)
                    {   if(front2 == size)
                        {
                            System.out.print("\nQueue2 is Full");
                            return;
                        }
                        for(i=front2,j=size-1;i>=rear2;i--,j--)
                        {
                            info[j] = info[i];
                        }
                        rear2 = j+1;
                        front2 = size;  
                    }
                    System.out.printf("\nEnter a Value:-");
                    info[--rear2] = (new Scanner(System.in)).nextInt();
            break;

        }
    }

    void dequeue(int ch)
    {
        Switch(ch)
        {
            case 1: if(rear1 == front1)
                    {
                        System.out.printf("\nQueue1 is Empty");
                        return;
                    }
                    System.out.printf("Deleted no:-",info[++front1]);
            break;
            case 2: if(rear2 == front2)
                    {
                        System.out.print("\nQueue2 is Empty");
                        return;
                    }
                    System.out.print("Deleted no:-"+info[--front2]);
            break;
        }
    }
  }

  void display1(int ch)
  {
     switch(ch)
     {  int i;
        case 1: if(rear1 == front1)
                {
                    printf("\nQueue1 is Empty");
                    return;
                }
                System.out.println("Content of Queue1");
                for(i=front1+1;i<=rear1;i++)
                {
                    System.out.print(+info[i]);
                }
        break;
        case 2: if(rear2 == front2)
                {
                    printf("\nQueue2 is Empty");
                    return;
                }
                System.out.println("Content os Queue2");
                for(i=front2-1;i>=rear2;i--)
                {
                    System.out.print(+info[i]);
                }
        break;
     }
  }

  void rev_display(int ch)
  {  int i;
     switch(ch)
     {
        case 1: if(rear1 == front1)
                {
                    printf("\nQueue1 is Empty");
                    return;
                }
                System.out.println("Content of Queue1 Reversly");
                for(i=rear1;i>front1;i--)
                {
                    System.out.print(+info[i]);
                }
        break;
        case 2: if(rear2 == front2)
                {
                    printf("\nQueue2 is Empty");
                    return;
                }
                System.out.println("Content os Queue2 Reversly");
                for(i=rear2;i<front2;i++)
                {
                    System.out.print(+info[i]);
                }
        break;
     }
}



class Constructor
{  
    public static void main(String agrs[])
    {
       Global_Variable v = new Global_Variable();
       Queue q = new Queue();
       int ch1;
    do
    {
        System.out.print("1.Enqueue in Queue1\n2.Enqueue in Queue2\n3.Dequeue from Queue1\n4.Dequeue from Queue2");
        System.out.print("\n5.Display Queue1\n6.Display Queue2\n7.Reverse Display Queue1\n8.Reverse Display Queue2");
        System.out.print("\n0.Exit\nEnter Your Choice:-");
        ch1 = (new Scanner(System.in)).nexiInt();
        switch(ch1)
        {
           case 1: q.enqueue(1);    break;
           case 2: q.enqueue(2);    break;  
           case 3: q.dequeue(1);    break;
           case 4: q.dequeue(2);    break;
           case 5: q.display1(1);    break;
           case 6: q.display1(2);    break;
           case 7: q.rev_display(1);break;
           case 8: q.rev_display(2);break;
           case 0: System.exit(0);
           default: System.out.print("\nInvalid Choice\n");
        }
    }while(2);
    }
}
