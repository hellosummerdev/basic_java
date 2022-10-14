package collection08;

import java.util.HashSet;
import java.util.Set;


/**
 * Set 특징
 * 데이터의 집합
 * 순사가 없고 중복된 데이터를 허용하지 않음
 * 빠른 검색 속도
 * 인덱스가 없어 iterator 사용
 */

public class Set01 {
    public static void main(String[] args) {

        Set<String> aSet = new HashSet<>();
//        HashSet<String> aSet = new HashSet<>();

        aSet.add("apple");
        aSet.add("pear");
        aSet.add("peach");
        aSet.add("apple");


        System.out.println("aSet Size : " + aSet.size());

        for (String s : aSet) {
            System.out.println(s);
        }


    }
}
