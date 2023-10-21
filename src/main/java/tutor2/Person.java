package tutor2;

public class Person { // тайно унаследованы от класса Object
    public static String nameStatic = "John"; // static

    public String nameNonStatic = "Michael"; // non-static

    public void helloNonStatic() {
        System.out.println("Hello Non-Static");
    }

    public static void helloStatic() {
        System.out.println("Hello Static");
    }

    public Person(String name) {
        nameNonStatic = name;
        System.out.println(name + " был изменен");
    }

    public Person() {
    }
}
