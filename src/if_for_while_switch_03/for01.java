package if_for_while_switch_03;

import java.util.ArrayList;
import java.util.List;

public class for01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("i");
        list.add("want");
        list.add("to");
        list.add("go");
        list.add("home");

//        v1 i want to go home
        for(int i = 0; i < list.size(); ++i){
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.println("---------------");

//        v2 want to go home
        for(int i = 0; i < list.size(); ++i){
            if (list.get(i).equals("i")){
                continue;
            }
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
        System.out.println("---------------");

//        v3 home
        for(int i = 0; i < list.size(); ++i){
            if(list.get(i).equals("home")){
                System.out.print(list.get(i));
                break;
            }
        }

        System.out.println();
        System.out.println("---------------");

//        v4 updated for loop
        for(String s : list){
            System.out.print(s + " ");
        }

        System.out.println();
    }

}
