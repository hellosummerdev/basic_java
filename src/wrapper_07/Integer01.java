package wrapper_07;

public class Integer01 {
    public static void main(String[] args) {

//        basic int type
        int[] intArr = new int[]{1,2,3,4,5,6,7,8};

//        Wrapper Class인 Integer (null이 들어갈 수 있다)
        Integer[] first = new Integer[2];
        first[0] = 1;
        first[1] = 2;

//        v1
        for (Integer integer: first){
            System.out.println(integer.intValue());
        }

        System.out.println("---------------------");

        Integer[] second = new Integer[]{3,4,5,null};

//        v2
        for (Integer integer : second){
//            System.out.println(integer.intValue()); //Exception in thread "main"
            System.out.println(integer);
        }

        /**
         * String 도 null을 대입할 수 있음
         * 기본 타입은 long  - 랩퍼 클래스 Long
         *          float - 랩퍼 클래스 Float
         *            ....
         *  모든 기본 자료형에 대하여 대문자형태 비슷하게 존재한다
         */


        /**
         * * 다음 두개의 형태의 변환 (형변환)을 박싱/언박싱이라고 말한다 (근데 개발자가 쓸대는 막써도 저절로 알아서 잘 변환된다 "오토박싱" 이 이루어짐)
         * int -> Integer 박싱
         * int <- Integer 언박싱
         */
    }
}
