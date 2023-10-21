package tutor2;

public class Cat extends Animal {
    @Override
    public void voice() {
        System.out.println("Meow");
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
