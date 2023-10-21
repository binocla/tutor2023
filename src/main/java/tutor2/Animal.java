package tutor2;

public abstract class Animal {
    public String name;
    public int age;

    public abstract void voice();

    public void sayMyNameAndAge() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}
