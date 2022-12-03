package FirstFive;

public class SwapString {
    public static void main(String[] args) {

        String s="SachinTendulkar";
        System.out.println("Original String: " + s);
        System.out.println("Substring starting from index 6: " +s.substring(6));//Tendulkar
        System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6)); //Sachin



        String s1 = "Good", s2 = "morning";
        System.out.println("Strings before swapping: " + s1 + " " + s2 +" length s1 ::"
                                                   +s1.length() +" ,s2::" +s2.length());
        //Concatenate both the string str1 and str2 and store it in str1
        s1 = s1 + s2;  //  GOODMORNING
        System.out.println("after adding::"+s1.length());
        //Extract str2 from updated str1
        s2 = s1.substring(0,(s1.length()-s2.length()) );
        //Extract str1 from updated str1
        s1 = s1.substring(s2.length());

        System.out.println("Strings after swapping: " + s1 + " " + s2);


        String  s3= "Shivendra" ,s4="singh";
        System.out.println("String before swapping::"+s3+" "+s4);
        s3=s3+s4;

        s4=s3.substring(0,(s3.length()-s4.length()));
        s3=s3.substring(s4.length());

        System.out.println("String after swapping::"+s3 +" "+s4);


    }
}

