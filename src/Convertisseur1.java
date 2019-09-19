import java.util.Scanner ;

public class Convertisseur1 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

        // Variables
        double rad ;
        int deg ;

        // Question a l'utilisateur
        System.out.print(" Quel est l'angle en radian?");
        rad = sc.nextDouble() ;

        //Valeur en degré
        deg = (int)(180 *(rad / Math.PI));
        System.out.println(" la valeur en degre : " + deg);
        sc.close();






    }





}

