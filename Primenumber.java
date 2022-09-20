import java.util.Scanner;
class Primenumber
  {
    public static void main(String args[])
    {
      int n,count=0;
      int i=1;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter n value:");
      n=sc.nextInt();
      while(n>0)
        {
         if(n%i==0) 
         {
           count++;
           i++;
         }
        }
      if(count==2)
        System.out.println("prime number");
      else
        System.out.println("not a prime number");
    }
  }