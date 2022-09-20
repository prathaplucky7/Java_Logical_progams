import java.util.Scanner;
class stringvowels
  {
    public static void main(String args[])
    {
      String st1="prathap";
      int i,v=0,con=0;
      char ch;

      for(i=0;i<st1.length();i++)
        {
          ch=st1.charAt(i);
          if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            v++;
          else
            con++;
        }
      System.out.println("number of vowels:" +v);
      System.out.println("number of consonents:" +con);
    }
  }
