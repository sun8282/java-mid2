package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("MyArrayList 추가");
        addFirst(new ArrayList<>(), size);
        addFirst(new LinkedList<>(), size);
    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTiem = System.currentTimeMillis();
        System.out.println(endTiem - startTime);
    }
}
