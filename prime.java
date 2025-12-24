import java.util.Scanner;


public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean primeis = true;

        if(a<=0 || a<=1){
            primeis  = false;
            System.out.println("No its not a Prime number...!");

        }
        else if (a %2==0) {
            primeis = false;
            System.out.println(" No its a composite number");

        }
        else{
            System.out.println(a + " is a prime number...!");
        }
    }
}
