package tutor2;

import java.util.Objects;

public class Car {
    private String name;
    private boolean isBlack;
    private int age;

    public Car(String name, boolean isBlack, int age) {
        this.name = name;
        this.isBlack = isBlack;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        // Car
        // Animal
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;

        if (age != car.age) {
            return false;
        }
        if (isBlack != car.isBlack) {
            return false;
        }
        if (!name.equals(car.name)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (isBlack ? 1 : 0);
        result = 31 * result + age;
        return result;
    }
}
