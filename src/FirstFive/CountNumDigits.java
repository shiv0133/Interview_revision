package FirstFive;

public class CountNumDigits {
    public static void main(String[] args) {
        int num = 12345;
        int n=num;
        int count = 0;

        while (num>0){
            num=num/10;
            count++;
        }
        System.out.println("Number of digit present in the number "+n+" is "+count);

        System.out.println(Math.pow(2,count));

    }
}