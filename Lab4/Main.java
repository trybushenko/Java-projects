package Lab4;
/*
 * Визначити клас морський човен, який складається як мінімум з 5-и полів.
 * Створити клас із виконавчим методом, в якому створити масив з об’єктів класу визначеному варіантом (п. 2).
 * Відсортувати масив, за одним з полів, за зростанням, а за іншим,
 * за спаданням використавши при цьому стандартні засоби сортування.
 * Всі змінні повинні бути описані та значення їх задані у виконавчому методі.
 *  Код повинен відповідати стандартам JCC та бути детально задокументований.*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Boat[] boat = new Boat[]{
            new Boat("Alaska", 10, 100, 500_000, "USA"),
            new Boat("Sahaydachnyi", 5, 50, 250_000, "Ukraine"),
            new Boat("Victory", 50, 300, 700_000, "Russia"),
            new Boat("Romantic", 3, 1000, 1_000_000, "Swedish"),
            new Boat("Destroyer", 1, 125, 200_000, "Ukraine"),
            new Boat("Titanic", 15, 2000, 1_500_000, "Great Britain")};
        Arrays.sort(boat, Boat.NameComparator);
        System.out.println("\n|-----------------------------Sorting by length of name-----------------------------|\n");
        for (Boat elem: boat) {
            System.out.println(elem);
        }
        System.out.println("\n|-----------------------------Sorting by quantity of cabins-----------------------------|\n");
        Arrays.sort(boat, Boat.CabinsComparator);
        for (Boat elem: boat) {
            System.out.println(elem);
        }
        System.out.println("\n|-----------------------------Sorting by age-----------------------------|\n");
        Arrays.sort(boat);
        for (Boat elem: boat) {
            System.out.println(elem);
        }
    }
}
