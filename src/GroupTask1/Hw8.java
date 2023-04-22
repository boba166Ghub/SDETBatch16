package GroupTask1;

public class Hw8 {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 8, 34, 21, 78, 54, 23, 41, 100, 9};
        int maximum = numbers[0];
        int minimum = numbers[0];
        for (int number : numbers) {
            if (number > maximum) {
                maximum = number;
            }
            if (number<minimum){
                minimum=number;
            }
        }
        System.out.println("Maximum number is "+maximum);
        System.out.println("Minimum number is "+minimum);
    }
}