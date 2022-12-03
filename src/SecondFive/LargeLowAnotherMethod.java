package SecondFive;

public class LargeLowAnotherMethod {
    public static void main(String[] args) {
        int[] arr1 = {19, 10, 8, 7, 6, 3, 4, 5, 6, 9, 11, 12, 32, 888, 65675, 7868343, 78797};
        int high = arr1[0];
        int low = arr1[0];
        for(int i=0;i<arr1.length;i++){
            high=Math.max(arr1[i],high );
            }
        System.out.println("highest number is::"+high);
    }
}
