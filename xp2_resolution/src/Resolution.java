import java.util.Scanner;

public class Resolution {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //variables
        double A,B,C;
        double discriminant;
        double X1,X2;

        // equation
        System.out.println(" Entrée des valeurs :");

        System.out.println(" a > ");
        A = sc.nextDouble();

        System.out.println(" b > ");
        B = sc.nextDouble();

        System.out.println(" c > ");
        C = sc.nextDouble();

        discriminant = (Math.pow(B,2))- 4*A*C;

        System.out.println("discriminant : "  + discriminant);

        X1 = (B*-1 + Math.sqrt(discriminant))/(2 * A);
        System.out.println(" X1 : " + X1);

        X2 = (B*-1 - Math.sqrt(discriminant))/(2 * A);
        System.out.println(" X2 : " + X2);

        sc.close();











    }
}

