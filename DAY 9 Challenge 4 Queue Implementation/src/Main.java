import java.util.*;
public class Main {
    public static void main(String[] args) {

                Queue<String> list = new LinkedList<String>();

                list.add("R");
                list.add("M");
                list.add("G");
                list.add("N");
                list.add("D");

                System.out.println("Elements in Queue:"+list);
                System.out.println("Removed element: "+list.remove());
                System.out.println("Head: "+list.element());
                System.out.println("poll(): "+list.poll());
                System.out.println("peek(): "+list.peek());
                System.out.println("is the array empty: "+list.isEmpty());
                System.out.println("Elements in Queue:"+list);
            }
        }
