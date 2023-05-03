package HomeworkClass13;

public class Hw4 {
    public static void main(String[] args) {
        // How would you swap  2 strings without a temporary variable?


        String a="John";
        String b="Lisa";

        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());

        System.out.println(a+" "+b);




    }
}
