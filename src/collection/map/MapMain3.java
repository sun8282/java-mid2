package collection.map;

import java.util.HashMap;

public class MapMain3 {

    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("A", 50);
        System.out.println("studentMap = " + studentMap);

        if (!studentMap.containsKey("A")) {
            studentMap.put("A", 100);
        }
        System.out.println("studentMap = " + studentMap);
    }
}
