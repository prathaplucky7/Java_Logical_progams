import java.util.Scanner;
class palindrome
  {
    int n,r=0,d,t;
    void palindrome(int x)
    {
      n=x;
      t=n;
      while(n>0)
        {
          d=n%10;
          r=r*10+d;
          n=n/10;
        }
      if(r==t)
        System.out.println("It is palindrome number");
      else
        System.out.println("It is not a palindrome number");
    }
  }
class OOPS_PALINDROME
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value");
      int m=sc.nextInt();
      palindrome n=new palindrome();
        n.plindrome(m);
    }
  }