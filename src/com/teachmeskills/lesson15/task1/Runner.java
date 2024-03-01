package com.teachmeskills.lesson15.task1;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите массив числе\nДля окончания ввода введите слово \"exit\"");
        try {
            while (true) {
                String a = scanner.nextLine();
                if (a.matches("^-?[0-9]+$")) {
                    int b = Integer.parseInt(a);
                    arrayList.add(b);
                } else if (a.equals("exit")) {
                    break;
                } else {
                    System.out.println("Вы не должны вводить буквы и символы\nДля окончания ввода введите слово \"exit\"");
                }
            }
            System.out.println(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) % 2 == 0 & arrayList.get(i) != 0) {
                    System.out.println(arrayList.get(i));
                }
            }
        } catch (NumberFormatException exception) {
            System.out.println(arrayList);
            System.out.println("Строка не должна быть пустой\nДолжна содержать только челые числа");
        }
    }
}
