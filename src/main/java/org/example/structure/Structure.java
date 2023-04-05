package org.example.structure;

public class Structure {

   static int montant = 100;

    static int montant2 = 200;

    public static void getIfElse(){
        if(montant>montant2){
            System.out.println("Le montant est supérieur");
        }else{
            System.out.println("Le montant est inférieur");
        }
    }

    public static void getIfElseIfElse() {
        if (montant > montant2) {
            System.out.println("Le montant est supérieur");
        } else if (montant == montant2) {
            System.out.println("Le montant est égal");
        } else {
            System.out.println("Le montant est inférieur");
        }
    }

    public static void getSwitch() {

        String valeur = "toto";
        switch(valeur){
            case "titi":
                System.out.println("c'est titi");
                break;
            case "tata":
                System.out.println("c'est tata");
                break;
            case "tutu":
                System.out.println("c'est tutu");
                break;

        }
    }
}

