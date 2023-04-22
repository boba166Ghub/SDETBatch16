package GroupTask1;

public class Hw7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 1;

        for (int i = 1; i <= a; i++) {
            System.out.print(b + " ");
            int num = b + c;
            b = c;
            c = num;
        }
    }
}
