package if_for_while_switch_03;

public class while01 {
    public static void main(String[] args) {
        int i = 1;

//        1-10 출력
        while (i <= 10){
            System.out.print(i + "\t");
            i++;
        }

        System.out.println();
        System.out.println("--------------------------");

//        1-5 출력
        while(i <= 10){
            System.out.print(i + "\t");
            if (i == 5){
                break;
            }
            i++;
        }

        System.out.println();
        System.out.println("--------------------------");

//        do while에서 do는 무조건 1번 실행

        int a = 1;

        do {
            System.out.print(a + "\t");
            a++;
        } while (a < 10);

        System.out.println();
        System.out.println("--------------------------");

//        시작부터 false지만 do-while에서 do부분은 무조건 1회 실행
        int b = 10;
        do {
            System.out.println(b + "\t");
        } while (b < 1);
    }

}
