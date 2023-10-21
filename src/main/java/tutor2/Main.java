package tutor2;

public class Main {
    public static void main(String[] args) {
//        Person person1 = new Person("Ivan");
//        Person person2 = new Person("Sergey");
//        Person person3 = new Person("Max");
//        Person person4 = new Person();
//        System.out.println(person1.nameNonStatic);
//        System.out.println(person2.nameNonStatic);
//        System.out.println(person3.nameNonStatic);
//        System.out.println(person4.nameNonStatic);

        Dog dog = new Dog(true, "Joy", 12);
        Cat cat = new Cat("Kit", 5);
        dog.voice();
        cat.voice();
        System.out.println();
        System.out.println(dog.name);
        System.out.println(dog.isBlack); // OK
        System.out.println(dog.age);
        System.out.println(cat.age);
        System.out.println(cat.name);
    }
}
