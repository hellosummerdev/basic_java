package string_01;

public class StringBuilder01 {
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        System.out.println("StringBuilder01.main [빌더]");
        builder.append("i am sleepy. ");
        builder.append("but my teacher said ");
        builder.append("i have to stay strong!");

        System.out.println(builder);

    }
}
