class A extends Thread{
synchronized public void run(){
    for(int i=0;i<=5;i++){
        System.out.print("\nFrom Thread A: i:-"+i);
    }
    System.out.print("\nExit From Thread A\n");
}
}

class B extends Thread{
    synchronized public void run(){
        for(int j=0;j<=5;j++){
            System.out.print("\nFrom Thread B: j:-"+j);
        }
        System.out.print("\nExit From Thread B\n");
    }
}

class C extends Thread{
    public void run(){
        for(int k=0;k<=5;k++){
            System.out.print("\nFrom Thread C: k:-"+k);
        }
        System.out.print("\nExit From Thread C\n");
    }
}

public class ThreadTest {
  public static void main(String agrs[]){
    System.out.print("\nStarting Main Thread\n");
      A myThreadA = new A();
      B myThreadB = new B();
      C myThreadC = new C();

      myThreadC.setPriority(Thread.MAX_PRIORITY);
      myThreadB.setPriority(myThreadA.getPriority()+1);
      myThreadA.setPriority(Thread.MIN_PRIORITY);

      System.out.print("\nStarting Thread A\n");
      myThreadA.start();

      System.out.print("\nStarting Thread B\n");
      myThreadB.start();

      System.out.println("\nStarting Thread c");
      myThreadC.start();

      System.out.println("\nExit From Main Thead");
  }
}
