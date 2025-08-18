package collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("MyArrayList 추가");
        addFirst(new MyArrayList<>(), size);
        addFirst(new MyLinkedList<>(), size);
    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTiem = System.currentTimeMillis();
        System.out.println(endTiem - startTime);
    }
}
