package string_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringSplit01 {
    public static void main(String[] args) {
        String phone = "010-3343-6554";
        // -로 스플릿 해서 배열에 담는다.
        String[] onlyNum = phone.split("-");

        // 구분자로 다시 이어 붙일 때 쓰는 방법
        // 1. String.join
        String phoneNumStr = String.join("", phone.split("-"));
        // 2. join한 애들을 Integer.parseInt로 감싸서 형변환
        int phoneNumInt = Integer.parseInt(String.join("", phone.split("-")));

        System.out.println("phoneNumStr = " + phoneNumStr);
        System.out.println("phoneNumInt = " + phoneNumInt);
        System.out.println("-----------------------");

        // String array 값 일치하는지 확인
        System.out.println(onlyNum[0].equals("010"));
        System.out.println(onlyNum[1].equals("3343"));
        System.out.println(onlyNum[2].equals("6554"));
        System.out.println("-----------------------");
        // 반복문으로 확인
        for (String str : onlyNum){
            System.out.println(str);
        }

        System.out.println("-----------------------");
        // List로 형변환
        List<String> list = Arrays.asList(onlyNum);
        for (String s : list){
            System.out.println(s);
        }

    }
}
