package array_02;

public class stringArray01 {
    public static void main(String[] args) {
        String[] strArr = new String[]{"1","2","3","4"};

        for(String s : strArr){
            System.out.print(s + "\t");
        }

        System.out.println();

        String[] strArr2 = new String[5];

        strArr2[0] = "one";
        strArr2[1] = "two";
        strArr2[2] = "three";
        strArr2[3] = "four";
        strArr2[4] = "five";
        // 기존 one에서 six로 스트링이 바뀌면서 에러 발생 안하는 거 같은데 성준님이 쓴거에는 에러 발생이라고 되어 있음
        strArr2[0] = "six";

        for(String s : strArr2){
            System.out.print(s + "\t");
        }

    }
}
