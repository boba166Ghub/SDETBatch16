package GroupTask1;

public class Hw6 {
    public static void main(String[] args) {


        int number =10;
        boolean primeNum=true;
        for (int i = 2; i < number; i++) {
            if(number %i==0) {
                primeNum=false;
                break;
            }

        }
        if(primeNum) {
            System.out.println("number "+ number +" is prime number");
        }else {
            System.out.println("number "+ number +" is not prime number");
        }

    }
}
