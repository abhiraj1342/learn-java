import java.util.Scanner;
import java.math.BigInteger;

public class resverseNumber {
    public static long Reversenumber(long number)
    {
    long temp=0;
    long num=0;
     while(number>0)
     {
        temp=number%10;
        num=num*10+temp;
        number=number/10;

     }
     return num;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number for the resverse");
        long number=scan.nextLong();
        long result=Reversenumber(number);
        System.out.println("reverse of the number "+result);
    



    }
    
}
