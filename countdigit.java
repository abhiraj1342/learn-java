import java.util.Scanner;



public class countdigit {
    public static int countdigitsSum(int number){
    int result=0;
    int temp=0;
    while(number>0){
    temp=number%10;
    result=result+temp;
    number=number/10;

    }
    return result;

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the  number for counting sum of digits");
        int number=input.nextInt();
        int res=countdigitsSum(number);
        System.out.println("this is sum  of digits of number "+res);
        
    }
}
