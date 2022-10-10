package oop_extends_05;

public class Client {
    public static void main(String[] args) {
        System.out.println("---------Galaxy----------");
        Galaxy galaxy = new Galaxy();

        galaxy.isMe();
        galaxy.isSmartPhone();
        galaxy.doCall();
        galaxy.doKakao();
        galaxy.usbType();

        System.out.println("---------Iphone----------");
        Iphone iphone = new Iphone();

        iphone.isMe();
        iphone.isSmartPhone();
        iphone.doCall();
        iphone.doKakao();
        iphone.usbType();

        System.out.println();
    }
}
