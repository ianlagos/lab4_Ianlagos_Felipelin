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
