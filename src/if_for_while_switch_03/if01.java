package if_for_while_switch_03;

public class if01 {
    public static void main(String[] args) {
        if(true){
            System.out.println("print it when it's true");
        } else {
            System.out.println("won't get here forever");
        }

        System.out.println("------------------");

        if(!false){
            System.out.println("print it when it's true");
        } else {
            System.out.println("won't get here forever");
        }

        System.out.println("------------------");

//        else if
        int a = 1;

        if (a == 2){
            System.out.println("a equals 2");
        } else if (a == 3){
            System.out.println("a equals 3");
        } else if (a == 4) {
            System.out.println("a equals 4");
        } else {
            System.out.println("a is not 2 or 3 or 4");
        }

    }

}
