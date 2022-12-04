package SecondFive;

public class CountTotalStringChar {
    public static void main(String[] args) {

        // for counting total character in the string.............
        String str = "shivendra";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)) != ' ') {
                count++;
            }
        }
        System.out.println("Given String is::" + str);
        System.out.println("Total character present in the given string is::" + count);

    }
}
