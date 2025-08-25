package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;


    public static void main(String[] args) {

        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);
        int hashCode = hashCode("A");
        System.out.println("hashCode = " + hashCode);
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;
    }
}
