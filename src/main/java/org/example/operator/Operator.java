package org.example.operator;

import org.example.model.Maison;

import java.util.Arrays;
import java.util.Scanner;

public class Operator {

    public static void getOperators() {
        System.out.println("----------les opérateurs----------");



        int i = 10;
        int i2 = -10;
        int i3 = i++;
        int i4 = ++i; // 12
        int i5 = --i;
        int i6 = i--;

        System.out.println("i : " + i);
        System.out.println("i2 : " + i2);
        System.out.println("i3 : " + i3);
        System.out.println("i4 : " + i4);
        System.out.println("i5 : " + i5);
        System.out.println("i6 : " + i6);

    }

    public static void getExpressionType() {



        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1L;
        float f = 1.0F;
        double d = 1.0;
        char c = 1;

        int express1 = b + b;
        int express2 = s + b;
        int express3 = b + i + c;
        long express4 = i + l;
        float express5 = l + f;
        double express6 = f + d;

        int t1 = 2_000_000_000;
        int t2 = 2_000_000_100;

        int t3 = t1 + t2;
        System.out.println("la valeur de t3 est :" +t3);

    }

    public static void getOperationAndComparaisonType(){

        int int1 = 128;
        int int2 = 128;

        System.out.println("int1 == int2 " + (int1 == int2));


        Integer i = 128;
        Integer i2 = 128;
        System.out.println("65 == A " + (65 == 'A'));

        System.out.println("i == i2 " +  (i == i2));
        System.out.println("int1 == i2 " +  (int1 == i2));



        Integer i3 = 127;
        Integer i4 = 127;

        System.out.println("i3 == i4 " + (i3 == i4));

       /* Integer i5 = Integer.valueOf(i);
        Integer i6 = Integer.valueOf(i2);*/

        System.out.println("i equals i2 " + i.equals(i2));

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};

        System.out.println("arr1 == arr2 " + (arr1 == arr2));
        System.out.println("arr1 equals arr2 " + arr1.equals(arr2));
        System.out.println("Arrays.equals(arr1,arr2) " + Arrays.equals(arr1,arr2));

        arr1 = arr2;

        System.out.println("Arrays.equals(arr1,arr2) " + Arrays.equals(arr1,arr2));


        Maison maison1 = new Maison(12, "Maison1");
        Maison maison2 = new Maison(12, "Maison1");

        System.out.println("maison1 == maison2 " + (maison1 == maison2));
        System.out.println("maison1.nom == maison2.nom " + (maison1.nom == maison2.nom));


    }

    public static void demoSystem(){

        String nom;

        System.out.println("Qui je suis ?");
        Scanner sc = new Scanner(System.in);
        nom = sc.next();
        System.out.println("Je m'appelle " + nom);


    }






}
