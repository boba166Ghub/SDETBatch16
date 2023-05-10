package HomeworkClass19;

public class Hw1 {

    public static void calculateArea (int a,int b){
        int resultRectangle=a*b;
        System.out.println(resultRectangle);
    }
public static void calculateArea (int a){
        int resultSquare=a*a;
    System.out.println(resultSquare);
}

}
class Hw1Tester {
    public static void main(String[] args) {

    Hw1.calculateArea(5,10);
    Hw1.calculateArea(5);



    }
}

        





