package oop_interface_06;

public interface Dog {
//    1. Field
    int legs = 4;

//    2. abstract method (not completed)
    void Bark(String sound);

//    3. method(completed)
    default void step(){
        System.out.println("i can walk.");
    }
}

