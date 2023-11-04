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

        Dog dog1 = new Dog(true, "Joy", 12);
        Cat cat = new Cat("Kit", 5);
//        dog1.voice();
//        cat.voice();
//        System.out.println();
//        System.out.println(dog1.name);
//        System.out.println(dog1.isBlack); // OK
//        System.out.println(dog1.age);
//        System.out.println(cat.age);
//        System.out.println(cat.name);


        Car car1 = new Car("BMW", true, 2);
        Car car2 = new Car("GMC", false, 12);
        Car car3 = new Car("BMW", true, 2);

        System.out.println("Equals:");
        System.out.println(car1.equals(car2));
        System.out.println(car2.equals(car3));
        System.out.println(car1.equals(car3));

        System.out.println("Hashcode:");
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }
}
