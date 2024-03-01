package com.teachmeskills.lesson15.task2;

import com.teachmeskills.lesson15.task2.entity.*;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        double sum = 0;
        List<Figure> figureList = new ArrayList<>();

        figureList.add(new Triangle(5.13, 5.86));
        figureList.add(new Rectangle(6.12, 8.4));
        figureList.add(new Circle(10));
        figureList.add(new Square(12.52));
        figureList.add(new Rhombus(4, 7.5));

        System.out.println("Area :");
        for (Figure figure : figureList) {
            System.out.println(figure.getName() + " " + figure.calculationOfArea());
        }
        System.out.println("\nPyrimeter :");
        for (Figure figure : figureList) {
            System.out.println(figure.getName() + " " + figure.calculationOfPyrimeter());
        }
        System.out.print("\n");
        for (Figure figure : figureList) {
            sum += figure.calculationOfPyrimeter();
        }
        System.out.println("Sum - " + sum);
    }
}
