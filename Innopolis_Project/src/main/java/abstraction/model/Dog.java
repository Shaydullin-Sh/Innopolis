package abstraction.model;

import abstraction.Animal;
import abstraction.AnimalAction;

import java.util.Objects;

public class Dog extends Animal implements AnimalAction {
    private String name;
    private String color;

    public Dog() {
    }

    public Dog(
            String animalClass,
            String animalType,
            String typeFood,
            String habitat,
            int age,
            String name) {
        super(animalClass, animalType, typeFood, habitat, age);
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(color);
        return result;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void sleeping() {
        System.out.println(this.getName() + " спит");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " ест");
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " бежит");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " идёт");
    }
}
