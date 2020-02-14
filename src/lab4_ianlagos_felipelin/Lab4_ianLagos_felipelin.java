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
                    String nombre = leer.next();
                    System.out.println("Ingrese el año que cursa en Hogwarts: ");
                    int año = leer.nextInt();
                    while (año <= 0) {
                        System.out.println("Numero invalido");
                        System.out.println("Ingrese el año que cursa en Hogwarts: ");
                        año = leer.nextInt();
                    }
                    System.out.println("Ingrese el numero de Uniforme: ");
                    int uni = leer.nextInt();
                    for (Juagdor x : Jugadores) {
                        while (x.getNumero_uni() == uni) {
                            System.out.println("Numero de uniforme ya esta tomado: ");
                            uni = leer.nextInt();
                        }
                    }
                    System.out.println("Ingrese el nombre de la casa: ");
                    System.out.println("Tiene que ser Gryffindor,Slytherin,Ravenclaw,Hufflepuff");
                    String casa = leer.next();
                    while (!casa.contains("Gryffindor") && !casa.contains("Slytherin") && !casa.contains("Ravenclaw") && !casa.contains("Hufflepuff")) {
                        System.out.println("Tiene que ser Gryffindor,Slytherin,Ravenclaw,HufflePuff");
                        System.out.println("Ingrese el nombre de la casa: ");
                        casa = leer.next();
                    }
                    System.out.println("Ingrese el rol que desempeña: ");
                    System.out.println("1. Guardian \n2. Golpeadores \n3. Cazadores \n4. Buscador");
                    int menu2 = leer.nextInt();
                    switch (menu2) {
                        case 1: {
                            System.out.println("Ingrese el reflejo: ");
                            int reflejos = leer.nextInt();
                            while (reflejos < 1 || reflejos > 10) {
                                System.out.println("Ingresado un valor invalido");
                                System.out.println("Ingrese nivel de reflejos 1-10");
                                reflejos = leer.nextInt();
                            }
                            Jugadores.add(new Guardian(reflejos, nombre, año, casa, uni));
                            break;
                        }
                        case 2: {
                            System.out.println("Ingrese nivel de musculatura 1-15: ");
                            int musculatura = leer.nextInt();
                            while (musculatura < 1 || musculatura > 15) {
                                System.out.println("Ingresado un valor invalido");
                                System.out.println("Ingrese nivel de reflejos 1-10");
                                musculatura = leer.nextInt();
                            }
                            System.out.println("Ingrese nivel de reflejos 1-15: ");
                            int reflejos = leer.nextInt();
                            while (reflejos < 1 || reflejos > 10) {
                                System.out.println("Ingresado un valor invalido");
                                System.out.println("Ingrese nivel de reflejos 1-10");
                                reflejos = leer.nextInt();
                            }

                            Jugadores.add(new Golpeadores(musculatura, reflejos, nombre, año, casa, uni));

                            break;
                        }
                        case 3: {
                            System.out.println("Ingrese nivel de reflejos 1-10");
                            int reflejos = leer.nextInt();
                            while (reflejos < 1 || reflejos > 10) {
                                System.out.println("Ingresado un valor invalido");
                                System.out.println("Ingrese nivel de reflejos 1-10");
                                reflejos = leer.nextInt();
                            }
                            System.out.println("Ingrese el peso: ");
                            int peso = leer.nextInt();
                            Jugadores.add(new Cazadores(peso, reflejos, nombre, año, casa, uni));
                            break;
                        }
                        case 4: {
                            System.out.println("Ingrese el peso: ");
                            int peso = leer.nextInt();
                            Jugadores.add(new Buscador(peso, nombre, año, casa, uni));
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
