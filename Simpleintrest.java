import java.util.Scanner;

class Simpleintrest{

//main method
  public static void main(String[]args)
  {
    int p;
    int t;
    int r;
    Scanner num=new Scanner(System.in);
  System.out.println("entre first number");
     p=num.nextInt();
  System.out.println("entre second number");
     t=num.nextInt();
    System.out.println("entre third number");
     r=num.nextInt();
    int si;
    si=(p*t*r)/100;
    System.out.println("the value of si is :"+si);
    int to;
    to=(p+si);
    System.out.println("the value of to is :"+to);
  }
}