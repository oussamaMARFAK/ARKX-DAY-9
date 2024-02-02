import java.util.*;
public class Main {
    public static void main(String[] args) {
                LinkedList<String> characters=new LinkedList<>();
                characters.add("M");
                characters.add("A");
                characters.add("A");
                characters.add("R");
                characters.add("F");
                characters.add("A");
                characters.add(6, "K");
characters.remove(2);
                System.out.println("LinkedList elements: ");

                Iterator<String> it=characters.iterator();
                while(it.hasNext()){
                    System.out.println(it.next());
                }




 String k []= new String[characters.size()];
        int j=characters.size()-1;
        for (int i=0;i<characters.size();i++){
            k[j]=characters.get(i);
            j--;
        }
        System.out.print("the reversed array is: ");
        for (String h: k){
        System.out.print(h+" ");
        }

            }
        }