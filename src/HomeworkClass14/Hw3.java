package HomeworkClass14;

public class Hw3 {


    // Write a method to return whether given number is prime or not?

    boolean isPrime(int number) {
        boolean prime = false;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0 && number != i) {
                prime = false;
                break;
            } else if (i == number) {
                prime = true;
            }
        }
        return prime;
    }

    public static void main(String[] args) {

        Hw3 obj = new Hw3();
        System.out.println(obj.isPrime(6));
    }


}


