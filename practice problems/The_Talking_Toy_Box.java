// Source: 04_Week7_Abstraction_Interface_Practice
// Problem: Problem 1: The Talking Toy Box

abstract class Toy {
    private static int count=1000; final String toyId="TOY-"+(++count);
    abstract String makeSound(); String getToyId(){return toyId;}
}
class ToyCar extends Toy {
    String name; ToyCar(String n){name=n;}
    String makeSound(){return name+": Vroom vroom!";}
}
class ToyRobot extends Toy {
    String name; ToyRobot(String n){name=n;}
    String makeSound(){return name+": Beep boop!";}
}
