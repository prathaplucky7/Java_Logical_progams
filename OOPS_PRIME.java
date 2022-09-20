import java.util.Scanner;
class prime
  {
    int n,i,count;
    void prime(int x)
    {
      n=x;
      count=0;
      for(i=1;i<=n;i++)
        {
          if(n%i==0)
          {
            count++;
          }
        }
      if(count==2)
        System.out.println("It is Prime number");
      else
        System.out.println("It is not a prime number");
    }
  }
class OOPS_PRIME
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      int m=sc.nextInt();
      prime n=new prime();
      n.prime(m);
    }
  }