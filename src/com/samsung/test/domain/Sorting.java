package com.samsung.test.domain;

import java.util.Objects;

public class Sorting {
    public static int[] bubbleSorting(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas[i] < mas[j]) {
                    int a = mas[i];
                    mas[i] = mas[j];
                    mas[j] = a;
                }
            }
        }
        return mas;
    }

    public static int[] SortingByInserts(int[] mas) {
        for (int i = 1; i < mas.length; i++) {
            int j = i;
            while (j >= 1 && mas[j] < mas[j - 1]) {
                int a = mas[j - 1];
                mas[j - 1] = mas[j];
                mas[j] = a;
                j--;
            }
        }
        return mas;
    }

    public static void quickSorting(int[] mas, int low, int high) {
        if (mas.length == 0 || low >= high) return;

        int mid = low + (high - low) / 2;
        int i = low, j = high;
        while (i <= j) {
            while (mas[i] < mas[mid]) {
                i++;
            }
            while (mas[j] > mas[mid]) {
                j--;
            }
            if (i <= j) {
                int temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSorting(mas, low, j);
        if (high > i)
            quickSorting(mas, i, high);
    }

    public static long deltaTime(String key, int[] mas) {
        if (Objects.equals(key, "bubbleSorting"))  {
            long start = System.currentTimeMillis();
            bubbleSorting(mas);
            long end = System.currentTimeMillis();
            return end - start;
        } else if (Objects.equals(key, "SortingByInserts")) {
            long start = System.currentTimeMillis();
            SortingByInserts(mas);
            long end = System.currentTimeMillis();
            return end - start;
        } else if (Objects.equals(key, "quickSorting")) {
            long start = System.currentTimeMillis();
            quickSorting(mas, 0, mas.length - 1);
            long end = System.currentTimeMillis();
            return end - start;
        }
        return -1;
    }
}
