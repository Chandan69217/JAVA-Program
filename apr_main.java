
class apr
{ private int l,b,p,a;
  void read()
  {l=25;
   b=12;
  }
  void print()
  { p=2*(l+b);
    a=l*b;
    System.out.printf("\nArea of Rectangel:-%d\nPerimeter of Rectangle:-%d",a,p);
  }
}



class apr_main
{ public Static void main(string args[])
  {apr A;
   A=new apr();
   A.read();
   A.print();
  }
}