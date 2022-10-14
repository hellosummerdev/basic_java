package collection08;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class List02 {
    public static void main(String[] args) {

        String[] strArr = new String[]{"apple", "pear", "fig"};
        List<String> list = Arrays.asList(strArr);  // 배열을 List로 바꾸는 API

        for (String s : list){
            System.out.println(s);
        }

    }
}
