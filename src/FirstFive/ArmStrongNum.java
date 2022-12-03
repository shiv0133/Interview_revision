package FirstFive;

public class ArmStrongNum {
    public static void main(String[] args) {
        int num = 153,sum=0;
       int n=num;
        for (int i=0; i<3;i++){
            int r=num%10;
            sum=sum+r*r*r;
            num=num/10;
        }
        if(sum==n){
            System.out.println("Number is Armstrong number::"+sum);

        }
        else {
            System.out.println("Number is not FirstFive.ArmStrong number::"+sum);
        }


}}
