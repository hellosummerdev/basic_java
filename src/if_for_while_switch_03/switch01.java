package if_for_while_switch_03;

/**
 * Swtich loop
 * 1. if else 보다 빠른 성능
 * 2. 코드가 폭포수처럼 위에서 아래로 흐른다.
 * 3. 단 break;를 하지 않으면 멈추지 않고 아래의 코드도 동작한다.
 *    break; 주석해서 테스트 해보기
 * 4. 모든 조건에 맞지 않을 시 반드시 default 분기를 사용한다.
 */

public class switch01 {
    public static void main(String[] args) {
//        v1 조건에 일치하는 게 반드시 있는 경우
        String score = "D";

        switch (score) {
            case "A" :
                System.out.println("A");
//                break;
            case "B" :
                System.out.println("B");
//                break;
            case "C" :
                System.out.println("C");
//                break;
            case "D" :
                System.out.println("D");
//                break;
            case "F" :
                System.out.println("F");
//                break;
        }

        System.out.println("-------------");
//        v2 조건에 일치하는 게 없는 경우 반드시 default 추가
        String score2 = "A++";
        switch (score2) {
            case "A" :
                System.out.println("A");
//                break;
            case "B" :
                System.out.println("B");
//                break;
            case "C" :
                System.out.println("C");
//                break;
            case "D" :
                System.out.println("D");
//                break;

            default:
                System.out.println(score2 + "is a new score!");
//                break;
        }


    }

}
