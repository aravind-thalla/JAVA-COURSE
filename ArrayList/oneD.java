import java.util.ArrayList;
import java.util.Scanner;

public class   oneD {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner sc = new Scanner(System.in);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list.contains(99));
        list.set(0,101);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
//        for (int i = 0; i < 5; i++) {
//            list.add(sc.nextInt());
//        }
//        System.out.println(list);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list.get(i));
//        }
    }
}
