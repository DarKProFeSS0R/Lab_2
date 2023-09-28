package com.main;
import com.abiturient.Abiturient;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Abiturient[] abiturients = createAbiturients();

        printAbiturientsByFirstName(abiturients, "Іван");
        printAbiturientsByAverageGrade(abiturients, 78.0);
        printTopNAbiturientsByAverageGrade(abiturients, 3);
    }

    public static Abiturient[] createAbiturients() {
        Abiturient[] abiturients = new Abiturient[5];

        abiturients[0] = new Abiturient(1, "Іванов", "Іван","Іванович", "Київ", 98.5);
        abiturients[1] = new Abiturient(2, "Петров", "Петро", "Петрович", "Львів", 59.0);
        abiturients[2] = new Abiturient(3, "Сидоров", "Сидор", "Сидорович", "Харків", 81.8);
        abiturients[3] = new Abiturient(4, "", "Марія", "Іванівна", "Одеса", 49.7);
        abiturients[4] = new Abiturient(5, "Павленко", "Павло", "Павлович", "Дніпро", 72.2);

        return abiturients;
    }

    public static void printAbiturientsByFirstName(Abiturient[] abiturients, String firstName) {
        System.out.println("\nAbiturients with first name: " + firstName);
        for (Abiturient abiturient : abiturients) {
            if (abiturient.getFirstName().equals(firstName)) {
                System.out.println(abiturient);
            }
        }
    }

    public static void printAbiturientsByAverageGrade(Abiturient[] abiturients, double minAverageGrade) {
        System.out.println("\nAbiturients with average grade higher than " + minAverageGrade);
        for (Abiturient abiturient : abiturients) {
            if (abiturient.getAverageGrade() > minAverageGrade) {
                System.out.println(abiturient);
            }
        }
    }

    public static void printTopNAbiturientsByAverageGrade(Abiturient[] abiturients, int n) {
        System.out.println("\nTop " + n + " Abiturients with the highest average grade");
        Arrays.sort(abiturients, Comparator.comparingDouble(Abiturient::getAverageGrade).reversed());
        for (int i = 0; i < n && i < abiturients.length; i++) {
            System.out.println(abiturients[i]);
        }
    }
}