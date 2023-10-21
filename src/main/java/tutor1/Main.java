package tutor1;

public class Main {
    // Field (поле) - переменная на уровне класса
    int a = 20; // Переменная (Поле)
    public static void main(String[] args) {
//        tutor1.Animal animal = new tutor1.Animal();
//        tutor1.Dog dog = new tutor1.Dog();
//        System.out.println(animal.nose);
//        System.out.println(dog.nose); // tutor1.Animal
//        System.out.println(dog.tail); // tutor1.Dog

//        int a = 20; // Переменная
//        int b = 30;
//        int c = a + b;
//        System.out.println(c);

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1, 2, 3));
        calculator.value = 100;
        System.out.println(calculator.substract(5));
    }
}
