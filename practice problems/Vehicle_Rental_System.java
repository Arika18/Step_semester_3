// Source: 06_Week8_Practice_Coding_Questions
// Problem: Question 1: Vehicle Rental System

abstract class Vehicle {
    String id; boolean rented;
    Vehicle(String i){id=i;}
    abstract double dailyRate();
}
class Sedan extends Vehicle { Sedan(String i){super(i);} double dailyRate(){return 50;} }
class SUV extends Vehicle { SUV(String i){super(i);} double dailyRate(){return 80;} }
class Truck extends Vehicle { Truck(String i){super(i);} double dailyRate(){return 120;} }
class Rental {
    Vehicle vehicle; String customer; int days;
    Rental(Vehicle v,String c,int d){if(v.rented)throw new IllegalStateException("Unavailable");vehicle=v;customer=c;days=d;v.rented=true;}
    double charge(){return vehicle.dailyRate()*days;}
    void returnVehicle(){vehicle.rented=false;}
}
