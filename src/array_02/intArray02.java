package array_02;

public class intArray02 {
    public static void main(String[] args) {
        int[] intArr = new int[10]; // 사이즈가 10인 int 배열

        for(int i = 0; i < 10; ++i){
            intArr[i] = i;
            System.out.print(intArr[i] + "\t");
        }

        System.out.println();
        System.out.println("------------------");


        for(int i : intArr){
            System.out.print(intArr[i] + "\t");
        }

        System.out.println();
        System.out.println("------------------");

        intArr[0] = 0;
        intArr[1] = 1;
        intArr[2] = 2;
        intArr[3] = 3;
        intArr[4] = 4;
        intArr[5] = 5;
        intArr[6] = 6;
        intArr[7] = 7;
        intArr[8] = 8;
        intArr[9] = 9;

        for(int i : intArr){
            System.out.print(i + "\t");
        }
    }
}
