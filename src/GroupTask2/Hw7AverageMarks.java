package GroupTask2;

public abstract class Hw7AverageMarks {
    abstract double getPercentage();

}

class A extends Hw7AverageMarks{
private double math;
private double english;
private double pE;

    public A(double math, double english, double pE) {
        this.math = math;
        this.english = english;
        this.pE = pE;
    }

    @Override
    double getPercentage() {
        double average=(math+english+pE)/3;
    return average;
    }
}
class B extends Hw7AverageMarks{
    private double math;
    private double english;
    private double pE;
    private double sociology;

    public B(double math, double english, double pE, double sociology) {
        this.math = math;
        this.english = english;
        this.pE = pE;
        this.sociology = sociology;
    }

    @Override
    double getPercentage() {
        double average=(math+english+pE+sociology)/4;
        return average;
    }
}
class AverageMarksTester{
    public static void main(String[] args) {
        A student1=new A(70,80,90);
        B student2= new B(80,90,75,81);

        System.out.println("Student A percentage: "+student1.getPercentage());
        System.out.println("Student B percentage: "+student2.getPercentage());



    }
}