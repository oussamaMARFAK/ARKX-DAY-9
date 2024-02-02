import java.util.Stack;
import java.util.*;
public class Main {
    public static void main(String[] args) {
                Stack<String> look = new Stack<>();
                look.push("ahmed");
                look.push("Anass");
                look.push("Hamada");
                look.pop();
                look.push("Sara");
                look.push("karim");
                look.pop();
                look.peek();
        System.out.println("the element that u want to peek"+look.peek());
        look.empty();
        System.out.println("is it empty: "+look.empty());
/*
Iterator <String> it = look.iterator();
while (it.hasNext()){
    System.out.println(it.hasNext());
}*/
                System.out.println("Stack elements: ");

                for(String str: look){
                    System.out.println(str);
                }

            }
        }