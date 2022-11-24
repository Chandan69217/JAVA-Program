public class MultithredingExample {
    public static void main(String agrs[])
    {
      a a2= new a();
      b b2 = new b();
      c c2 = new c();

      a2.start();
      b2.start();
      c2.start();

    }
}

class a extends Thread
{
 public void run()
 {
    for(int i=1;i<=100;i++)
    {
        System.out.print("\ni="+i);
    }
 }
}

class b extends Thread {
    public void run() {
        for (int j = 1; j <= 100; j++) {
            System.out.print("\nj=" + j);
        }
    }
}

class c implements Runnable {
    public void run() {
        for (int k = 1; k <= 100; k++) {
            System.out.print("\nk=" + k);
        }
    }
}