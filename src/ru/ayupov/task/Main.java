package ru.ayupov.task;

import java.util.Scanner;

/**
 * Напишите программу которая запрашивает у пользователя строку. Затем программа должна заменить
 * в строке все вхождения слова «бяка» (буквы могут быть в любом регистре) на «вырезано цензурой»
 * и вывести результат обратно в консоль. Если «бяка» является частью слова, то такое вхождение
 * нужно оставить без изменений. Например, слово «кулебяка» должно остаться без изменений.
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст и нажмите \"Enter\"");
        String str = sc.nextLine();

        System.out.println(censor(str));
    }

    public static String censor(String str) {
        str = str.replaceAll("(?iu)\\b(бяка)\\b", "вырезано цензурой");
        return str;
    }

}
