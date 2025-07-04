import java.util.Scanner;
public class primenumber {
    public static void checkprime(int num)
    {
        for(int i=2;i<num/2;i++)
        {
         if(num%i==0)
         {
            System.out.println("Not Prime Number");
            break;
         }
         else{
            System.out.println("prime");
            break;
         }
        }
    }
    public static void main(String[] args) {
     Scanner input=new Scanner(System.in);
     System.out.println("Enter the number for checking prime");
     int num=input.nextInt();
     checkprime(num);


    }
}
