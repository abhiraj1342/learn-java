import java.util.Scanner;

public class palindrome {
    public static void palin(String num) {
        int n=num.length()-1;
        int res=1;
        for(int i=0,j=n;i<=j;i++,j--)
        {
          if(num.charAt(i)!=num.charAt(j))
          {
            res=0;
          }
          
        }
        if(res==1)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("string is not palindrome");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the input for checking palindirome");
        Scanner input =new Scanner(System.in);
        String str=input.nextLine();
        palin(str);
        

    }
}
