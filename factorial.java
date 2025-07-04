import java.util.Scanner;
import java.math.BigInteger;
public class factorial {
    public static BigInteger fact(int num){
    
        BigInteger result = BigInteger.ONE;

        while(num>0)
        {
            result=result.multiply(BigInteger.valueOf(num));
            num--;
        }
    return result;
    }
    public static void main(String[] args) {
       
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value for Factorial");
        int number=input.nextInt();
        BigInteger ans=fact(number);
       
        System.out.println("factorial of this number is"+ans);
        
        input.close();


    }
    
}
