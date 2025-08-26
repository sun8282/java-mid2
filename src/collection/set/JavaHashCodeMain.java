package collection.set;

public class JavaHashCodeMain {

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashCode() = " + obj1.hashCode());
        System.out.println("obj2.hashCode() = " + obj2.hashCode());

        Integer i = 10;
        String strA = "A";
        String strAB = "AB";

        System.out.println("i = " + i);
        System.out.println("strA = " + strA);
        System.out.println("strAB = " + strAB);
    }
}
