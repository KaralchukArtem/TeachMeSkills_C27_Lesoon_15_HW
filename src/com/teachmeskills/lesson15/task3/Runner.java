package com.teachmeskills.lesson15.task3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int sum = 0;
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        try {
            size = scanner.nextInt();
            List<Integer> list = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                list.add((int) (Math.random() * 8));
                sum += list.get(i);
            }
            System.out.println(list + "\n" + sum / size);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Введенный размер должен содержать только положительное целое число.\nПроверте введеную вами строку.\n"+ e);
        }catch(InputMismatchException e){
            System.out.println("Введенная вами строка не должна содержать буквы или иные символы.\nТолько положительное целое число.\n"+ e);
        }
    }
}
