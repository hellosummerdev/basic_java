package string_01;

public class StringReplace01 {
    public static void main(String[] args) {

        String str = "010@3848@4940";
        String newStr = str.replace("@","-");
        System.out.println(newStr);

        String email = "qweasd@naver.com";
        String id = email.replace("@naver.com","");
        System.out.println(id);

    }
}
