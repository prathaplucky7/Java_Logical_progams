import java.util.Scanner;
class Jump_EVEN
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      n=sc.nextInt();

      for(int i=0;i<=n;i++)
        {
          if(i%2!=0)
            continue;
          System.out.println(i+" ");
        }
    }
  }