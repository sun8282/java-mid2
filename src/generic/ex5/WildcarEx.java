package generic.ex5;

import generic.animal.Animal;

public class WildcarEx {

    static <T> void printGenericV1(Box<T> box) {
        System.out.println("box = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }
}
