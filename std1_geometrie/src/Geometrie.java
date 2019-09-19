import java.util.Scanner ;

public class Geometrie {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in) ;

        //variables
        double rayon = 10.0, rayoncone = 3, hauteurcone = 7, longueur = 7.0, hauteur = 5.0, apotheme = 7.1589108,
                surface = 0, volume = 0;

        // calcul du Cercle
        surface = Math.PI * Math.pow(rayon,2);
        System.out.print("Le Cercle\n - Rayon    : " + rayon + "\n - Surface  : " + surface );

        // Calcul du Cube
        surface = longueur * 2 * 6;
        volume = Math.pow(longueur,3);
        System.out.print("\nLe Cube\n - Longueur : " + longueur + "\n - Surface  : " + surface + "\n - Volume   : "
                + volume);

        // calcul cylindre
        surface = Math.PI * Math.pow(rayon,2) * 2 + 2 * Math.PI * rayon * hauteur ;
        volume = Math.PI * Math.pow(rayon,2) * hauteur ;
        System.out.print("\nLe Cylindre\n - Rayon  : " + rayon + "\n - Hauteur  : " + hauteur + "\n - Surface  : "
                + surface + "\n - Volume  : " + volume);

        //calcul Cone
        surface = Math.PI * Math.pow(rayoncone,2) + Math.PI * rayoncone * apotheme;
        volume = (Math.PI * Math.pow(rayoncone,2) * hauteurcone) / 3;
        System.out.print("\nLe Cone\n - Rayon  :   " + rayoncone + "\n - Hauteur : " + hauteurcone + "\n - apotheme : "
                + apotheme + "\n - Surface  : " + surface + "\n - Volume : " + volume);

        sc.close();

    }


}
