package org.example.variable;

public class Variable {
    public static void getVariable(){


        byte b = 127;
        short s;
        s = 2;

        int i = 4;

        // b=i; ne compile pas
        // i=b: ok
        System.out.println("la valeur de i est " +i);
        i = b;
        System.out.println("la valeur de i est " +i);

        char c = 'j';

        boolean bool = true;
        int i2 = 350;
        float f = 1.45F;

        long l = 5645645546655487L;

        double d = 1.3;

        d = f;

        l = i;

        byte bb = 1;

        bb = (byte) i2;

        System.out.println("la valeur de bb est :" +bb);

        long number = 455_645_487_871_123_132L;


    }
}
