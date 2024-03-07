package com.samsung.test;

import com.samsung.test.domain.Sorting;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        sortingOptions("bubbleSorting", 10000);
        sortingOptions("SortingByInserts", 10000);
        sortingOptions("quickSorting", 10000);
    }

    public static int[] arrayCreating(int n) {
        int[] mas;
        mas = new int[n];
        for (int i = 0; i < n; i++) {
            mas[i] = (int) (Math.random() * 100000);
        }
        return mas;
    }

    public static void sortingOptions(String key, int n) {
        if (Objects.equals(key, "bubbleSorting")) {
            int[] mas = arrayCreating(n);
            System.out.println("bubbleSorting");
            for (int i : Sorting.bubbleSorting(mas)) {
                System.out.print(i + " ");
            }

            System.out.println();
            System.out.println(Sorting.deltaTime("bubbleSorting", mas));
            System.out.println();
        } else if (Objects.equals(key, "SortingByInserts")) {
            int[] mas = arrayCreating(n);
            System.out.println("SortingByInserts");
            for (int i : Sorting.SortingByInserts(mas)) {
                System.out.print(i + " ");
            }

            System.out.println();
            System.out.println(Sorting.deltaTime("SortingByInserts", mas));
            System.out.println();
        } else if (Objects.equals(key, "quickSorting")) {
            int[] mas = arrayCreating(n);
            System.out.println("quickSorting");
            Sorting.quickSorting(mas, 0, mas.length - 1);
            for (int i : mas) {
                System.out.print(i + " ");
            }

            System.out.println();
            System.out.println(Sorting.deltaTime("quickSorting", mas));
            System.out.println();
        }
    }
}
