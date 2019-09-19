import java.util.Scanner ;

public class Convertisseur2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        //variables
        int deg;
        double rad;

        //Question a l'utilisateur
        System.out.print("Quel est l'angle en degre?");
        deg = sc.nextInt();
        rad = Math.toRadians(deg);

        //reponse
        System.out.println();
        System.out.print("la valeur en radian :" + rad);
        sc.close();


    }
}
