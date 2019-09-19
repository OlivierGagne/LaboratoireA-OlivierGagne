import java.util.Scanner;

public class Pythagore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // variables
        int A,B;
        double C;

        //Question a l'utilisateur
        System.out.println("Quel est la valeur de A?");
        A = sc.nextInt();
        System.out.println("Quel est la valeur de B?");
        B = sc.nextInt();

        //Formule
        C = Math.pow(A,2) + Math.pow(B,2);
        C = Math.sqrt(C);

         //reponse
         System.out.println("Valeur de pythagore : " + C);
         sc.close();

    }
}
