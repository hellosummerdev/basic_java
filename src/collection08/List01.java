package collection08;

import java.util.ArrayList;
import java.util.List;


/**
 * List 특징
 * 순서가 있고 중복을 허용
 * 인덱스로 원소에 접근 가능
 * 크기가 가변적
 */

public class List01 {
    public static void main(String[] args) {

        /**
         * 주의
         * List<A> A에는 int와 같은 primitive 타입은 사용할 수 없음.
         * Integer, String과 같이 Wrapper 클래스나 일반 객체가 들어올 수 있다.
         * ex > Integer, String, Long, Double, Float, BoardDto, Bag...
         *
         * List<int> -> X
         * List<Integer> -> O
         *
         */

        // 1. List 사용
        List<String> aList = new ArrayList<String>();

        // 2. ArrayList 사용
        ArrayList<String> bList = new ArrayList<String>();

        aList.add("first");
        aList.add("second");
        aList.add("third");
        aList.add("fourth");

        System.out.println("aList.get(0) : " + aList.get(0));
        System.out.println("aList.get(1) : " + aList.get(1));
        System.out.println("aList.get(2) : " + aList.get(2));
        System.out.println("aList.get(3) : " + aList.get(3));

        System.out.println("-------------------------------");

        bList.add("first");
        bList.add("second");
        bList.add("third");
        bList.add("fourth");

        System.out.println("bList.get(0) : " + bList.get(0));
        System.out.println("bList.get(1) : " + bList.get(1));
        System.out.println("bList.get(2) : " + bList.get(2));
        System.out.println("bList.get(3) : " + bList.get(3));

    }
}
