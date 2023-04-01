//Print odd numbers between 20 and 50 (2 ways)

package HomeworkClass7;

public class Hw4 {
    public static void main(String[] args) {
        int i = 20;
        while (i <= 50) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

            i++;
        }
        System.out.println();
        for (int b = 20; b <= 50; b++) {
            if (b % 2 != 0)

                System.out.print(b + " ");
        }

    }


}




