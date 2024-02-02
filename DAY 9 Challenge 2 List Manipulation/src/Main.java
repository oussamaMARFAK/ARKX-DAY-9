import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        Collections.sort(list);
        list.add(0,"cd");
        list.add(1,"ab");
        list.add(2,"bc");
        Collections.sort(list);
        for (String h: list){
            System.out.println(h+" ");
        }
        System.out.println("-------------------------");
        list.set(0,"AB");

        for (String h: list){
            System.out.println(h+" ");
        }
        System.out.println("------------------------");

        list.get(0);
        System.out.println("u want to get "+list.get(0));

    }
}