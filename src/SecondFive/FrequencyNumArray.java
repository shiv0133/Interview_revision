package SecondFive;

public class FrequencyNumArray {
    public static void main(String[] args) {
        int freq=4,count=0;
        int [] arr1={1,2,3,4,5,6,7,5,1,4,2,3,4};

        for(int i=0;i<arr1.length;i++) {
            if (arr1[i] == freq) {
                count++;
            }
        }
        System.out.println("counting of given num::"+count);
    }
}
