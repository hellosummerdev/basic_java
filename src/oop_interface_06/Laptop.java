package oop_interface_06;

public interface Laptop {

//    속성
    String name = "Laptop";

//    동작(미완성)
    void power();
    void os();

//    완성인 메소드 가질 수 있음
    default void myMethod(){
        System.out.println("this is default method.");
    }
}
