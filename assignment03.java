package homeworkreplit;

public class assignment03 {
    /*  Write a program that prints the highest value in the array.
    input [5,4,8]
 */
    public static void main(String[] args) {

        int[] arr = {5, 4, 8};
        int highest=arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i]> highest) {
                highest=arr[i];
            }


        }
        System.out.println(highest);
        }

    }



