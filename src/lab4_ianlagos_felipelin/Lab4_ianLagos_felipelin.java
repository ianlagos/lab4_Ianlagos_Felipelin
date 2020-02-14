package lab4_ianlagos_felipelin;

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_ianLagos_felipelin {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Gryffindor> grif = new ArrayList();
        ArrayList<Slytherin> slyth = new ArrayList();
        ArrayList<Hufflepuff> huff = new ArrayList();
        ArrayList<Ravenclaw> rave = new ArrayList();
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
                    int contG = 0,
                     contS = 0,
                     contR = 0,
                     contH = 0;
                    System.out.println("Gryffindor");
                    System.out.println("Slytherin");
                    System.out.println("Ravenclaw");
                    System.out.println("Hufflepuff");
                    System.out.print("Ingrese la casa de su equipo: ");
                    String tipo_casa = leer.next();
                    while (!tipo_casa.contains("Gryffindor") && !tipo_casa.contains("Slytherin") && !tipo_casa.contains("Ravenclaw") && !tipo_casa.contains("Hufflepuff")) {
                        System.out.println("Tiene que ser Gryffindor,Slytherin,Ravenclaw,HufflePuff");
                        System.out.print("Ingrese el nombre de la casa: ");
                        tipo_casa = leer.next();
                    }
                    if (contG > 2 || contS > 2 || contR > 2 || contH > 2) {
                        System.out.println("solo pueden aver 1 equipo por casa");
                        break;
                    }
                    if (tipo_casa.contains("Gryffindor")) {
                        contG++;
                        System.out.print("ingrese cantidad de partidos perdidos: ");
                        int partidos_perdidos = leer.nextInt();
                        System.out.print("ingrese cantidad de partidos ganados: ");
                        int partidos_ganados = leer.nextInt();
                        //
                        System.out.print("ingrese el promedio de Agilidad de sus jugadores: ");
                        double agilidad_pr = leer.nextDouble();
                        System.out.print("ingrese el promedio de Velozidad: ");
                        double velozidad_pr = leer.nextInt();
                        //
                        System.out.print("ingrese el promedio de fuerza: ");
                        double fuerza_pr = leer.nextInt();
                        grif.add(new Gryffindor(partidos_ganados, partidos_perdidos, agilidad_pr, velozidad_pr, fuerza_pr, " "));

                    } else if (tipo_casa.contains("Slytherin")) {
                        contS++;
                        System.out.print("ingrese cantidad de partidos perdidos: ");
                        int partidos_perdidos = leer.nextInt();
                        System.out.print("ingrese cantidad de partidos ganados: ");
                        int partidos_ganados = leer.nextInt();
                        System.out.print("ingrese el promedio de Agilidad de sus jugadores");
                        double agilidad_pr = leer.nextDouble();
                        System.out.println("ingrese el promedio de Velozidad ");
                        double velozidad_pr = leer.nextInt();
                        System.out.println("ingrese el promedio de fuerza");
                        double fuerza_pr = leer.nextInt();
                        slyth.add(new Slytherin(partidos_ganados, partidos_perdidos, agilidad_pr, velozidad_pr, fuerza_pr, " "));
                    } else if (tipo_casa.contains("Ravenclaw")) {
                        contR++;
                        System.out.print("ingrese cantidad de partidos perdidos: ");
                        int partidos_perdidos = leer.nextInt();
                        System.out.print("ingrese cantidad de partidos ganados: ");
                        int partidos_ganados = leer.nextInt();
                        System.out.print("ingrese el promedio de Agilidad de sus jugadores");
                        double agilidad_pr = leer.nextDouble();
                        System.out.println("ingrese el promedio de Velozidad ");
                        double velozidad_pr = leer.nextInt();
                        System.out.println("ingrese el promedio de fuerza");
                        double fuerza_pr = leer.nextInt();
                        rave.add(new Ravenclaw(partidos_ganados, partidos_perdidos, agilidad_pr, velozidad_pr, fuerza_pr, " "));
                    } else if (tipo_casa.contains("Hufflepuff")) {
                        contH++;
                        System.out.print("ingrese cantidad de partidos perdidos: ");
                        int partidos_perdidos = leer.nextInt();
                        System.out.print("ingrese cantidad de partidos ganados: ");
                        int partidos_ganados = leer.nextInt();
                        System.out.print("ingrese el promedio de Agilidad de sus jugadores");
                        double agilidad_pr = leer.nextDouble();
                        System.out.println("ingrese el promedio de Velozidad ");
                        double velozidad_pr = leer.nextInt();
                        System.out.println("ingrese el promedio de fuerza");
                        double fuerza_pr = leer.nextInt();
                        huff.add(new Hufflepuff(partidos_ganados, partidos_perdidos, agilidad_pr, velozidad_pr, fuerza_pr, " "));
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
