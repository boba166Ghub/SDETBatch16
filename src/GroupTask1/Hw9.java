package GroupTask1;

public class Hw9 {
    public static void main(String[] args) {


        int[] arr = {9, 2, 1, 60, 47};
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i]>secondLargest) {
                secondLargest=arr[i];

            }

        }
        System.out.println(secondLargest);

    }

    }