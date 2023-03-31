/*Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
Based on operator provide the result to user.

Please complete this assignment in 2 ways: using if statement and switch case.
*/

package HomeworkClass6;

import java.util.Scanner;

public class Hw8CalculatorIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter operator (+,-,*,/)");
        char oprator = scanner.next().charAt(0);
        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();

        if (oprator == '+') {
            System.out.println("The result is " + (num1 + num2));
        }
        if (oprator == '-') {
            System.out.println("The result is " + (num1 - num2));
        }
        if (oprator == '*') {
            System.out.println("The result is " + (num1 * num2));
        } else {
            System.out.println("The result is " + (num1 / num2));


        }


    }
}
