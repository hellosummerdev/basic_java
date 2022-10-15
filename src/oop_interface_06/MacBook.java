package oop_interface_06;

public class MacBook implements Laptop{

    @Override
    public void power() {
        System.out.println("on/off button");
    }

    @Override
    public void os() {
        System.out.println("os operating");
    }

    public static void main(String[] args) {
        MacBook macBook = new MacBook();

//        미완성 메소드를 완성시킴
        macBook.power();
        macBook.os();

//        부모 메소드
        macBook.myMethod();
        System.out.println(macBook.name);

    }
}
