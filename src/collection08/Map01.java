package collection08;

import java.util.*;

/**
 * Map 특징
 * Key와 Value 한 쌍으로 이뤄지는 데이터의 집합
 * key에 대한 중복이 없으며 순서를 보장하지 않음
 * 뛰어난 검색 속도
 * 인덱스가 없어 iterator 사용
 */

public class Map01 {
    public static void main(String[] args) {
        // 1. Map
        Map<String, String> aMap = new HashMap<>();

        aMap.put("apple box", "apples");
        aMap.put("snack box", "snacks");
        aMap.put("gold box", "gold");

        System.out.println("apple box : " + aMap.get("apple box"));
        System.out.println("snack box : " + aMap.get("snack box"));
        System.out.println("gold box : " + aMap.get("gold box"));

        System.out.println("-------------------");

        // 2. HashMap
        HashMap<String, String> bMap = new HashMap<>();

        bMap.put("pear box", "pears");
        bMap.put("ice cream box", "ice cream");
        bMap.put("beer box", "beer");

        System.out.println("pear box : " + bMap.get("pear box"));
        System.out.println("ice cream box : " + bMap.get("ice cream box"));
        System.out.println("beer box : " + bMap.get("beer box"));

        System.out.println();
        System.out.println("keySet()과 반복문을 통해서 aMap의 key 값 꺼내기");
        Set<String> keys = aMap.keySet();
        Iterator<String> itr = keys.iterator();

        while (itr.hasNext()){
            String keyA = itr.next();
            System.out.println("key : " + keyA);
//            System.out.println("key : " + keyA + ", value : " + aMap.get(keyA));
        }

        System.out.println();
        System.out.println("entrySet()과 반복문을 통해서 aMap의 key와 value 값 꺼내기");
        Iterator<Map.Entry<String, String>> itrE = aMap.entrySet().iterator();
        while (itrE.hasNext()){
            Map.Entry<String, String> entry = itrE.next();
            String keyE = entry.getKey();
            String valueE = entry.getValue();
//            System.out.println("key : " + keyE + ",  value : " + valueE);
        }

        System.out.println();
        System.out.println("keySet()과 반복문을 통해서 bMap의 key 값 꺼내기");
        Set<String> keyB = bMap.keySet();
        Iterator<String> itrb = keyB.iterator();

//        System.out.println("test"); // Set은 Iterator에 넣지 않고 for문으로 바로 출력 가능
//        for (String s : keyB) {
//            System.out.println(s);
//        }

        while (itrb.hasNext()){
            String keyb = itrb.next();
            System.out.println("key : " + keyb);
            System.out.println("key : " + keyb + ", value : " + bMap.get(keyb));
        }

        System.out.println();
        System.out.println("entrySet()과 반복문을 통해서 bMap의 key와 value 값 꺼내기");
        Iterator<Map.Entry<String, String>> itrbE = bMap.entrySet().iterator();
        while (itrbE.hasNext()){
            Map.Entry<String, String> entry = itrbE.next();
            String keybE = entry.getKey();
            String valuebE = entry.getValue();
            System.out.println("key : " + keybE + ",  value : " + valuebE);
        }

        Collection<String> values = aMap.values();
        Iterator<String> iter = values.iterator();
        System.out.println();
        System.out.println("value만 출력하기");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}
