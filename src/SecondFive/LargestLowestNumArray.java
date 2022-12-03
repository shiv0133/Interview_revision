package SecondFive;

public class LargestLowestNumArray {
    public static void main(String[] args) {
        int [] arr1={19,10,8,7,6,3,4,5,6,9,11,12,32,888,65675,7868343,78797};
         int high=arr1[0];
         int low=arr1[0];
         for(int i=0;i<arr1.length;i++) {
             if (arr1[i] > high) {
                 high = arr1[i];
             }
         }
        System.out.println("highest num in arrary is::"+high);

         for(int i=0;i< arr1.length;i++){
             if(arr1[i]<low){
                 low=arr1[i];
             }
         }
        System.out.println("Lowest num in the array is::"+low);
    }
}
