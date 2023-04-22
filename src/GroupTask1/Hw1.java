package GroupTask1;

public class Hw1 {
    public static void main(String[] args) {
        int[] temperature = {85, 80, 90, 91, 87, 88, 98};
        int highest = temperature[0];
        for (int temp : temperature) {
            if (temp > highest) {
                highest = temp;
            }
        }
        System.out.println("The highest temperature is " + highest);

        int lowest = temperature[0];
        for (int temp1 : temperature) {
            if (temp1 < lowest) {
                lowest = temp1;
            }
        }
        System.out.println("The lowest temperature is " + lowest);


    }
}
