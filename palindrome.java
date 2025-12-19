import java.util.Scanner;

public class palindrome{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number you wish to type: ");
    int n = sc.nextInt();
    int num=0;
    int store = n;

     while(n!=0){
       int nig = n%10;
       num = (num * 10) + nig;
       n = n/10;
     }
      System.out.println("Reversed number:" + num);

      if(n == store){
        System.out.println(store + " is a palindrome");
      }
      else{
        System.out.println(store + " is not a palindrome");

      }

}
}
