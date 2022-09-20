import java.util.Scanner;
class Jump_Odd
  {
    public static void main(String args[])
    {
      int n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
      n=sc.nextInt();
      for(int i=0;i<=n;i++)
        {
          if(i%2==0)
            continue;
          sum=sum+i;
        }
      System.out.println(sum);
    }
  }