class Room
{ float length;
  float breadth;
  void getdata(float a,float b)
  { length=a;
    breadth=b;
  }
}


class area{ public static void main(String args[]){
   double area;
    Room Room1;
    Room1=new Room();
    Room1.getdata(12,10);
    area=Room1.length*Room1.breadth;
    System.out.println("Area of Room:-"+area);
  }
}