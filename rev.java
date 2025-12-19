
import java.util.Scanner;


public class rev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      String a = "malayalam";
      String b= " ";
      for(int i = a.length()-1;i>=0;i--){
            b = b + a.charAt(i);
      } 
      System.out.println("Revered string : " + b );

      if(a.equals(b))
      {
          System.out.println("No its not");
      }
      else{
          System.out.println("Yes its a equal");
      }

    }
}