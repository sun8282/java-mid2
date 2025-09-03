package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmptyListMain {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        List<Integer> list3 = Collections.emptyList();
        List<Integer> list4 = List.of();

        System.out.println("list3 = " + list3.getClass());
        System.out.println("list4 = " + list4.getClass());
    }
}
