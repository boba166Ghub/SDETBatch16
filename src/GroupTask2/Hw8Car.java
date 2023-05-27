package GroupTask2;

import class12.Car;
/*
Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount
 */

public class Hw8Car {

    int carPrice;
    String color;


    public Hw8Car(int carPrice, String color) {
        this.carPrice = carPrice;
        this.color = color;
    }

    double calculateSalePrice(){
        return carPrice;
    }

}
class Sedan extends Hw8Car{
private double lenght;
    public Sedan(int carPrice, String color,double lenght) {
        super(carPrice, color);
        this.lenght=lenght;

    }

    @Override
    double calculateSalePrice() {

    if(lenght>20){
        return carPrice-carPrice/20;
    }else{
        return carPrice-carPrice/10;
    }
    }
}
class Truck extends Hw8Car{
    private double weight;

    public Truck(int carPrice, String color,double weight) {

        super(carPrice, color);
        this.weight=weight;
    }

    @Override
    double calculateSalePrice() {
        if(weight>2000){
            return carPrice-carPrice/10;
        }else{
            return carPrice-carPrice/5;
        }
    }
}

class CarTester{
    public static void main(String[] args) {
        Sedan sedan=new Sedan(20000,"Black",18);
        System.out.println("Sale price od sedan is "+sedan.calculateSalePrice());

        Truck truck =new Truck(40000,"White",5000);
        System.out.println("Sale price of truck is "+truck.calculateSalePrice());
    }
}
