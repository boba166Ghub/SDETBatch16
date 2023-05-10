package HomeworkClass19;

public class Hw4 {
   /*
    Create 1 class with a private method that has 3 overloaded forms. Then call each
    overloaded method with specific arguments and observe result.
    */

    private void method1(int a,int b,double c){
        System.out.println(a+b+c);
    }
    private void method1(int b, double c, int a){
        System.out.println(a-b+c);
    }
    private void method1(int a,int b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        Hw4 obj1=new Hw4();
        obj1.method1(3,4,2.5);
        obj1.method1(6,4.5,7);
        obj1.method1(10,20);


    }
}
