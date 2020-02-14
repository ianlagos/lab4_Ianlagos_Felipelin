package lab4_ianlagos_felipelin;

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_ianLagos_felipelin {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Juagdor> Jugadores = new ArrayList();
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
                    System.out.println("Ingrese el nombre del jugador : ");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese el año que cursa en Hogwarts: ");
                    int año = leer.nextInt();
                    System.out.println("Ingrese el numero de Uniforme: ");
                    int uni = leer.nextInt();
                    System.out.println("Ingrese el nombre de la casa: ");
                    System.out.println("Tiene que ser Gryffindor,Slytherin,Ravenclaw,HufflePuff");
                    String casa = leer.nextLine();
                    while (!casa.contains("Gryffindor") && !casa.contains("Slytherin") && !casa.contains("Gryffindor") && !casa.contains("Slytherin")) {
                        System.out.println("Tiene que ser Gryffindor,Slytherin,Ravenclaw,HufflePuff");
                        System.out.println("Ingrese el nombre de la casa: ");
                        casa = leer.nextLine();
                    }
                    System.out.println("Ingrese el rol que desempeña: ");
                    System.out.println("1. Guardian \n2. Golpeadores \n3. Cazadores \n4. Buscador");
                    int menu2 = leer.nextInt();
                    switch (menu2) {
                        case 1: {
                            System.out.println("Ingrese el reflejo: ");
                            int reflejo = leer.nextInt();
                            Jugadores.add(new Guardian(reflejo, nombre, año, casa, uni));
                            break;
                        }
                        case 2: {
                            break;
                        }
                        case 3: {
                            break;
                        }
                        case 4: {
                            break;
                        }
                        default:
                    }

                    break;
                case 3:

                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }
}
