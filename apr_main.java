
class apr{ 

  private int l,b,p,a;
  public void read(){
    l=25;
    b=12;
  }
  public void print(){
    p=2*(l+b);
    a=l*b;
    System.out.printf("\nArea of Rectangel:-%d\nPerimeter of Rectangle:-%d",a,p);
  }
}



class apr_main{ 
  public static void main(String args[]){
    apr A;
    A = new apr();
    A.read();
    A.print();
  }
}