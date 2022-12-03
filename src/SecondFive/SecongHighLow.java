package SecondFive;

public class SecongHighLow {
    public static void main(String[] args) {
        int arr[] = { 12, 36, 1, 10,33, 35,34, 1 ,37};
        int n = arr.length;
        int i , first, second = 0;
        // There should be atleast two elements
        int arr_size= arr.length;
        if (arr_size < 2)
            {
                System.out.printf(" Invalid Input ");
                return;
            }
            int largest=arr[0] ;
            // Find the largest element
            for(i = 0; i < arr_size; i++)
            {
                largest = Math.max(largest, arr[i]);
            }
            // Find the second-largest element
            for(i = 0; i < arr_size; i++)
            {
                if (arr[i] != largest)
                    second = Math.max(second, arr[i]);
            }
            if (second == Integer.MIN_VALUE)
                System.out.printf("There is no second " +
                        "largest element\n");
            else
                System.out.printf("The second largest " +
                        "element is %d\n", second);
        }

        }


