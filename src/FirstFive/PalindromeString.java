package FirstFive;

public class PalindromeString {
    public static void main(String[] args) {
        String s1="121";
        String s2="";

        int l=s1.length();
        for(int i=(s1.length()-1);i>=0;i--){

            char c = s1.charAt(i);
            s2=s2+c;
        }
        System.out.println("Reverse of String is ::"+s2);
        if(s2.equals(s1)){
            System.out.println("Given String is Palindrome........");
        }
        else {
            System.out.println("Not Palindrome.....");
        }
    }
}
