package string_01;

public class StringBuffer01 {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();

        System.out.println("StringBuffer01.main [버퍼]");
        buffer.append("my name is ");
        buffer.append("pepsi cola. ");
        buffer.append("\nhi, i don't like ");
        buffer.append("pepsi, i like coca cola.");

        System.out.println(buffer);
    }
}
