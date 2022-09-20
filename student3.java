class student_3
  {
  int snum;
  String sname;
  double savg;
  student_3(int x,String y,double z)
    {
      snum=x;
      sname=y;
      savg=z;
    }
    void display()
    {
      System.out.println("student number is:"+snum);
      System.out.println("student name is:"+sname);
      System.out.println("student average is:"+savg);
    }
  }
class student3
  {
    public static void main(String args[])
    {
      int m=34;
      String n="Prathap";
      double o=40.23;
      student_3 s=new student_3(m,n,o);
      s.display();
    }
  }