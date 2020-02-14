package lab4_ianlagos_felipelin;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab4_ianLagos_felipelin {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            System.out.println("1 = Cree su Equipo");
            System.out.println("2 = Cree sus Juagadores");
            System.out.println("3 = sumulacions");
            System.out.print("Ingrese su opcion");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    try {
                        System.out.println("1 = Gryfindor");
                        System.out.println("2 = Slytherin");
                        System.out.println("3 = Ravenclaw");
                        System.out.println("4 = Hufflepuff");
                        System.out.print("Ingrese la casa de su equipo: ");
                        int opcion_casa = leer.nextInt();
                        
                    } catch (InputMismatchException e) {
                        System.out.println("er");
                    }

                    break;
                case 2:

                    break;
                case 3:

                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }
}
