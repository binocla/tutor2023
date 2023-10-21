package tutor2;

import java.util.StringTokenizer;

public class Dog extends Animal {
    public boolean isBlack;
    @Override // Аннотация
    public void voice() {
        System.out.println("Bark");
    }

    public Dog(boolean isBlack, String name, int age) {
        this.isBlack = isBlack; // this. -> обратись к полю ДАННОГО объекта
        this.age = age;
        this.name = name;
    }
}
