package string_01;

public class String01 {
    public static void main(String[] args) {
        String s1 = "안녕";
        s1 += "하세요";

        String s2 = new String("hi");
        String s3 = s1 + s2;
        String[] s4 = new String[]{"Hello","World"};

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4[0] + s4[1]);
    }
}
