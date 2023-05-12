package HomeworkClass20;



public class CreditCard {


/*
Create a class CreditCard and define variable balance and interest. Create an
instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
 */



        double balance;
        double interest;


        public CreditCard(double balance, double interest) {
            this.balance=balance;
            this.interest=interest;

        }
        void interestCalculate(){

            System.out.println("Interest rate is: "+balance*(interest/100));
        }
    }
    class Visa extends CreditCard {

        public Visa(double balance, double interest) {

            super(balance,interest);
        }
    }
    class AX extends CreditCard {
        public AX(double balance, double interest) {

            super(balance, interest);
        }

        @Override
        void interestCalculate(){

            System.out.println("Amex interest rate  is: "+balance*(interest/100));
        }

    }
    class CreditCardTester {
        public static void main(String[] args) {

            CreditCard cc = new CreditCard(10000, 0.05);
            Visa visa = new Visa(15000, 0.03);
            AX amex = new AX(17000, 0.02);

            cc.interestCalculate();
            visa.interestCalculate();
            amex.interestCalculate();


        }
    }
