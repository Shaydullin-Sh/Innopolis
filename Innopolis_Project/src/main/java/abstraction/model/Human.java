package abstraction.model;

import abstraction.Animal;
import abstraction.AnimalAction;

import java.util.Objects;

public class Human extends Animal implements AnimalAction {
    private String name;
    private String lastName;
    private String middleName;
    private String gender;

    public Human(String animalClass,
                 String animalType,
                 String typeFood,
                 String habitat,
                 int age,
                 String name,
                 String lastName,
                 String middleName,
                 String gender) {
        super(animalClass, animalType, typeFood, habitat, age);
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
    }

    public Human(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(lastName, human.lastName) && Objects.equals(middleName, human.middleName) && Objects.equals(gender, human.gender);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + Objects.hashCode(middleName);
        result = 31 * result + Objects.hashCode(gender);
        return result;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", gender='" + gender + '\'' +
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
