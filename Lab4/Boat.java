package Lab4;
/*
* Визначити клас морський човен, який складається як мінімум з 5-и полів.
* Створити клас із виконавчим методом, в якому створити масив з об’єктів класу визначеному варіантом (п. 2).
* Відсортувати масив, за одним з полів, за зростанням, а за іншим,
* за спаданням використавши при цьому стандартні засоби сортування.
* Всі змінні повинні бути описані та значення їх задані у виконавчому методі.
*  Код повинен відповідати стандартам JCC та бути детально задокументований.*/

import java.util.Comparator;

public class Boat implements Comparable<Boat>{
    private final int age;
    private int cabins;
    private int weight;
    private String name, produced;

    public Boat(String name, int age, int cabins, int weight, String produced) {
        this.name = name;
        this.age = age;
        this.cabins = cabins;
        this.weight = weight;
        this.produced = produced;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduced() {
        return produced;
    }

    public void setProduced(String produced) {
        this.produced = produced;
    }

    public int getAge() {
        return age;
    }

    public int getCabins() {
        return cabins;
    }

    public void setCabins(int cabins) {
        this.cabins = cabins;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return " Name: " + this.name + ", cabins: " + this.cabins + ", weight: " + this.weight + ", age: " + this.age +
                ", produced in " + this.produced + ".";
    }

    @Override
    public int compareTo(Boat other) {
        if (this.getAge() > other.getAge()) return 1;
        else if (this.getAge() == other.getAge()) return 0;
        return -1;
    }
    public static Comparator<Boat> NameComparator = new Comparator<Boat>() {
        @Override
        public int compare(Boat o1, Boat o2) {
            return (o1.getName().length() - o2.getName().length());
        }
    };
    public static Comparator<Boat> CabinsComparator = new Comparator<Boat>() {
        @Override
        public int compare(Boat o1, Boat o2) {
            return (o2.getCabins() - o1.getCabins());
        }
    };
}
