package abstraction.model;

import abstraction.Animal;
import abstraction.AnimalAction;

import java.util.Objects;

public class Cat extends Animal implements AnimalAction {
    private String nameCat;
    private String color;
    public Cat() {}

    public Cat(
            String animalClass,
            String animalType,
            String typeFood,
            String habitat,
            int age,
            String nameCat,
            String color) {
        super(animalClass, animalType, typeFood, habitat, age);
        this.nameCat = nameCat;
        this.color = color;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
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

        Cat cat = (Cat) o;
        return Objects.equals(nameCat, cat.nameCat) && Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(nameCat);
        result = 31 * result + Objects.hashCode(color);
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nameCat='" + nameCat + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void sleeping() {
        System.out.println(this.getNameCat() + " спит");
    }

    @Override
    public void eat() {
        System.out.println(getNameCat() + " ест");
    }

    @Override
    public void run() {
        System.out.println(this.getNameCat() + " бежит");
    }

    @Override
    public void walk() {
        System.out.println(this.getNameCat() + " идёт");
    }
}
