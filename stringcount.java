import java.util.Scanner;
class stringcount
  {
    public static void main(String args[])
    {
      String st1="Pratap246$";
      int i,capital=0,small=0,digit=0,character=0;
      char ch;

      for(i=0;i<st1.length();i++)
      {
        ch=st1.charAt(i);
      if(ch>=65 && ch<=90)
        capital++;
      else if(ch>=97 && ch<=120)
        small++;
      else if(ch>=48 && ch<=57)
        digit++;
      else
        character++;
    }
      System.out.println("number of capital charecter:" +capital);
      System.out.println(" number of alphabet small charecter:" +small);
      System.out.println("number of  digit character:" +digit);
      System.out.println("number of special character:" +character);
  }
  }