package org.example.Method;

public class MethodParam {

    public static void changeValue(int i) {
        i += 100;
        System.out.println(i);
    }

    public static int changeInt(int i) {
        i += 100;
        return i;

    }

    int valeur = changeInt(5);

    public static void changeArray(int[] array) {
        array[1] = 200;
    }

    public static void changeArray(int[] array, int val) {
        array[1] = 200;
    }

    public int sum(int i, int j, int l) {
        return i + j + l;
    }

    public int sum2(int... ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;

    }

    public int[] optab() {
        return null;
    }
}