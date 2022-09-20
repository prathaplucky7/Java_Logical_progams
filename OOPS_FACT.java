import java.util.Scanner;
class FACT
  {
    int n,fact;
    int fact(int x)
    {
      n=x;
      fact=1;
      for(int i=1;i<=n;i++)
        {
          fact=fact*i;
        }
      return fact;
    }
  }
class OOPS_FACT
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int m=sc.nextInt();
      FACT n=new FACT();
      int z=n.fact(m);
      System.out.println("the factorial is:"+z);
    }
  }