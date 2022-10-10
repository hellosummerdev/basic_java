package oop_interface_06;

public class JindoDog implements Dog {
//    complete the incomplete method

    @Override
    public void Bark(String sound) {
        System.out.println("Jindo dog barks like " + sound + sound);
    }

    public static void main(String[] args) {
        JindoDog jindoDog = new JindoDog();
        jindoDog.Bark("wal ");
        jindoDog.step();
        System.out.println(jindoDog.legs);
    }
}
