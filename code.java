import java.util.*;
class Car
{
    int registerno=12334;
    public void driving(){
        System.out.print("I'm driving");
    }
}
class CarFactory
{
    public car createCar(){
        Car c=new Car();
        return c;
    }
}
public class code
{
    public static void main(String[] args){
        //creating an object to carfactory class 
        CarFactory car= new CarFactory();
        // assigning the returning object to the car reference variable
        Car c= car.createCar();
        // calling the driving method in car class
        c.driving();
    }
}