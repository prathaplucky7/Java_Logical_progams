import java.util.Scanner;

class Leapyear
{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter A value: ");
    int a=sc.nextInt();
                
    if (a%4==0&&400==0)
    {
      System.out.println("A is leap year");
      
    }
    else
    {
    System.out.println("A is not a leap year");
    }
  }
  
}