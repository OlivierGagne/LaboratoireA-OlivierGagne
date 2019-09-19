import java.util.Scanner;

public class Vecteur {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        //variables
        double xa,ya,za,xb,yb,zb,distance;

        //question a l'utilisateur
        System.out.println("Quels sont les coordonnées du point A?");
        System.out.println("xa :");
        xa = sc.nextDouble();
        System.out.println("ya :");
        ya = sc.nextDouble();
        System.out.println("za :");
        za = sc.nextDouble();
        System.out.println("Le point A (" + xa + ","+ ya +","+ za +")");
        System.out.println("Quels sont les coordonnées du point B?");
        System.out.println(" xb :");
        xb = sc.nextDouble();
        System.out.println(" yb :");
        yb = sc.nextDouble();
        System.out.println("zb :");
        zb = sc.nextDouble();
        System.out.println("Le point B (" + xb + "," + yb + "," + zb + ")");

        //formule
         distance = Math.sqrt((Math.pow(xb-xa,2)) + (Math.pow(yb-ya,2)) + (Math.pow(zb-za,2)));

         System.out.println("La distance est : " + distance);

         sc.close();




    }
}
