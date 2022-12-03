package FirstFive;

public class PalindromeNum {
    public static void main(String[] args) {
        int n=123231,sum=0;
        int num=n;
        while (n>0){
            int r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (sum==num){
            System.out.println("given number is palindrome::"+num +" sum::"+sum);
        }
        else {
            System.out.println("Number is not palindorme::"+num+" sum::"+sum);
        }
    }
}
