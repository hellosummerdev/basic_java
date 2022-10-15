package oop_interface_06;

public class M1 extends MacBook{

    public String me = "this is M1.";


    public M1(){
        super();
    }
    
    public void m1Introduction(){
        System.out.println("M1 is expensive.");
    }

    public static void main(String[] args) {
        M1 m1 = new M1();

        m1.m1Introduction();
        m1.myMethod();
        m1.os();
        m1.power();
        System.out.println(m1.me);
        System.out.println(MacBook.name);
    }
}
