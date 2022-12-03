package org.example;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void createList() {
        List<Integer> list = new ArrayList<Integer>();
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            list.add(++counter);
        }
        System.out.println(list);
        list.remove(0);
        list.remove(0);
        list.remove(7);
        System.out.println(list);
    }
}
