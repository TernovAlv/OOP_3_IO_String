package ex_2_domashka;

import java.util.Arrays;

public class StringSplitExample {
    public static void main(String[] args) {
        //клас обгортки String для текстових данних 'text`.
        String text="Необхідно створити рядок із текстом (текст взяти будь-який з інтернету). Розбити цей рядок на 2 підрядки рівної довжині та вивести на екран кожну речення з нового рядка.";

        //Будемо  великий текст розбивати на 2 рядки рівної довжини.
        int textLength=text.length();  // Визначаємо довжину тексту методом 'length`класу String.
        int middleIndex=textLength/2;  // Визначаємо середню точку для розбиття тексту на 2 рядки.

        String firstHalf=text.substring(0, middleIndex);
        String secondHalf=text.substring(middleIndex);

        // Виводимо обидва рядки з нового рядка.
        System.out.println("Перший рядок ( перша половина тексту):");
        System.out.println(firstHalf);
        System.out.println("\n Друга половина тексту:");
        System.out.println(secondHalf);

    }
}
