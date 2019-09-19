import java.util.Scanner ;

public class Salutation {

    public static void main (String[] args)
    {

        Scanner sc = new Scanner(System.in);

        String nom;

        // Question a l'utilisateur
        System.out.print("Quel est ton nom?");

        // reponse
        nom = sc.next();
        System.out.print("Bonjour " + nom);

        sc.close();
    }



}
