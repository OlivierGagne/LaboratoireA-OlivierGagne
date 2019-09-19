import java.util.Scanner;

public class Typage {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        // Variables
        int var1=1;
        double var2=1;
        char var3=1;

        // calcul converstion #1
        Integer.toString(var1);

        // calcul conertion #2
        boolean bool = (var1 == 1);  /*C'est impossible car le domaine des resultats boolean(vrai ou faux) n'est pas
        compatible avec celui des int (entiers)*/

       //  calcul convertion #3
        double data = var2;
        int value = (int)data;

        // calcul convertion #4
        String.valueOf(var2);
        Math.round(var2);

        // Calcul convertion #5
        Integer.parseInt(String.valueOf(var3));











    }


}
