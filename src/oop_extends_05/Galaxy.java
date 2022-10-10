package oop_extends_05;

public class Galaxy extends SmartPhone {
//    자식인 갤럭시만의 메소드 (부모 메소드 수정 가능
    public void isMe(){
        System.out.println("this is galaxy phone.");
    }

//    부모 메소드 수정

    @Override
    public void usbType() {
        System.out.println("charger type C");
        super.usbType();
    }

    @Override
    public void isSmartPhone() {
        super.isSmartPhone();
    }

    @Override
    public void doCall() {
        super.doCall();
    }

    @Override
    public void doKakao() {
        super.doKakao();
    }
}

