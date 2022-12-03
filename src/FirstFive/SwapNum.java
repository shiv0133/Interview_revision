package FirstFive;

public class SwapNum {
    public static void main(String[] args) {
        int a=40; //10
        int b=10;  //40

        a=a*b;  //400
        b=a/b;   //40
        a=a/b;   // 10

        System.out.println("a::"+a);
        System.out.println("b::"+b);


        int x=50;  //x=10
        int y=10;   // y=50;

        x=x+y;  //60
        y=x-y; //50
        x=x-y; // 10

        System.out.println("x::"+x);
        System.out.println("y::"+y);
    }
}
