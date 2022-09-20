import java.util.Scanner;
class stringfirst
  {
    public static void main(String args[])
    {
      String str;
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a String");
      str=sc.nextLine();

      System.out.println("enter the character");
      ch=sc.next().charAt(0);
      int index=str.indexOf(ch);
      System.out.println("first occurance of a character" +ch+ "in String" +str+ "is at index" +index);
    }
  }