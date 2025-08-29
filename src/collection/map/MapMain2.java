package collection.map;

import java.util.HashMap;

public class MapMain2 {

    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("A", 90);
        System.out.println("studentMap = " + studentMap);

        studentMap.put("A", 100);
        System.out.println("studentMap = " + studentMap);
    }
}
