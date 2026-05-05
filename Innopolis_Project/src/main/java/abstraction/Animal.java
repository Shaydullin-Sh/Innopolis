package abstraction;

public abstract class Animal {
    private String animalClass;
    private String animalType;
    private String typeFood;
    private String habitat;
    private int age;


    public Animal(String animalClass, String animalType, String typeFood, String habitat, int age) {
        this.animalClass = animalClass;
        this.animalType = animalType;
        this.typeFood = typeFood;
        this.habitat = habitat;
        this.age = age;
    }

    public Animal() {
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        this.typeFood = typeFood;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
