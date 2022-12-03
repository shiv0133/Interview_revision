package FirstFive;

public class ArmStrong {
    public static void main(String[] args) {
        int num=1634;
        int n=num;
        int c=num;
        int count=0;
        int sum=0;

        while (n>0){
            n=n/10;
            count++;
        }
        System.out.println("Total digit present in the number is::"+count);

        while (num>0){
            int r=num%10;
            sum= (int) (sum+Math.pow(r,count));
            num=num/10;
        }
        if (sum==c){
            System.out.println("our number is FirstFive.ArmStrong Number");
        }
        else {
            System.out.println("Not FirstFive.ArmStrong");
        }
    }


}
