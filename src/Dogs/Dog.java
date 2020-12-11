package Dogs;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;
    private int weight;
    private String breed;

    public Dog(String name, int age, int weight, String breed) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }


    public void setBreed(int age) {
        this.breed = breed;
    }


    public void document() {
        System.out.println("Кличка - " + getName() + ".");
        System.out.println("Возраст - " + getAge() + ".");
        System.out.println("Вес - " + getWeight() + ".");
        System.out.println("Порода - " + getBreed() + ".");

    }

      public boolean equals(Dog dog) {
        if (this.getAge() == dog.getAge() && this.getWeight() == dog.getWeight()) {
            System.out.println("Возраст одинаковый и Вес одинаковый");
            return true;
        } else {
            System.out.println("Одинаково что-то одно или ничего");
            return false;
        }


    }

}



