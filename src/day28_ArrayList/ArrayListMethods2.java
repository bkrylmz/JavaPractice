package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        Integer num = 2000;
        list.remove(num);

        System.out.println(list);

        System.out.println("-------------------------");

        System.out.println(list.size());
        list.clear();

        System.out.println(list.size());

        System.out.println("----------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');
        int b = characters.lastIndexOf('A');

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        boolean r1 = characters.contains('A');

        boolean r2 = characters.contains('Z');

        System.out.println(r1);

        System.out.println(r2);












    }
}
