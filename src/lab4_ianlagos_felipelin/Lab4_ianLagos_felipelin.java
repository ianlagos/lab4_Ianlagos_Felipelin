package lab4_ianlagos_felipelin;

import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_ianLagos_felipelin {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        int contG = 0, contS = 0, contR = 0, contH = 0;
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
            System.out.print("Ingrese su opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:

                    System.out.println("1 = agregar ");
                    System.out.println("2 = modificar");
                    System.out.println("3 = eliminar");
                    System.out.println("4 = listar");
                    System.out.print("ingrese su opcion: ");
                    int opcion_pr = leer.nextInt();
                    switch (opcion_pr) {
                        case 1:
                            System.out.println("Gryffindor");
                            System.out.println("Slytherin");
                            System.out.println("Ravenclaw");
                            System.out.println("Hufflepuff");
                            System.out.print("Ingrese la casa de su equipo: ");
                            String tipo_casa = leer.next();
                            try {
                                Casa_validacion x = new Casa_validacion(tipo_casa);
                            } catch (EX_casa e) {

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
                                System.out.println("Desea modificar[s/n]: ");
                            }
                            break;
                        case 2:
                            System.out.println("1=Gryffindor");
                            System.out.println("2=Slytherin");
                            System.out.println("3=Ravenclaw");
                            System.out.println("4=Hufflepuff");
                            System.out.println("A quien desea elimnar");
                            int opc_mod = leer.nextInt();
                            switch (opc_mod) {
                                case 1:
                                    System.out.print("ingrese cantidad de partidos perdidos: ");
                                    int partidos_perdidos = leer.nextInt();
                                    grif.get(0).setPartidosP(partidos_perdidos);
                                    //
                                    System.out.print("ingrese cantidad de partidos ganados: ");
                                    int partidos_ganados = leer.nextInt();
                                    grif.get(0).setPartidosG(partidos_ganados);
                                    //
                                    System.out.print("ingrese el promedio de Agilidad de sus jugadores");
                                    double agilidad_pr = leer.nextDouble();
                                    grif.get(0).setPromedioA(agilidad_pr);
                                    //
                                    System.out.println("ingrese el promedio de Velozidad ");
                                    double velozidad_pr = leer.nextInt();
                                    grif.get(0).setPromedioV(velozidad_pr);
                                    //
                                    System.out.println("ingrese el promedio de fuerza");
                                    double fuerza_pr = leer.nextInt();
                                    grif.get(0).setPromedioF(fuerza_pr);
                                    break;
                                case 2:
                                    System.out.print("ingrese cantidad de partidos perdidos: ");
                                    int partidos_perdidosS = leer.nextInt();
                                    slyth.get(0).setPartidosP(partidos_perdidosS);
                                    //
                                    System.out.print("ingrese cantidad de partidos ganados: ");
                                    int partidos_ganadosS = leer.nextInt();
                                    slyth.get(0).setPartidosG(partidos_ganadosS);
                                    //
                                    System.out.print("ingrese el promedio de Agilidad de sus jugadores");
                                    double agilidad_prS = leer.nextDouble();
                                    slyth.get(0).setPromedioA(agilidad_prS);
                                    //
                                    System.out.println("ingrese el promedio de Velozidad ");
                                    double velozidad_prS = leer.nextInt();
                                    slyth.get(0).setPromedioV(velozidad_prS);
                                    //
                                    System.out.println("ingrese el promedio de fuerza");
                                    double fuerza_prS = leer.nextInt();
                                    slyth.get(0).setPromedioF(fuerza_prS);
                                    break;
                                case 3:
                                    System.out.print("ingrese cantidad de partidos perdidos: ");
                                    int partidos_perdidosR = leer.nextInt();
                                    slyth.get(0).setPartidosP(partidos_perdidosR);
                                    //
                                    System.out.print("ingrese cantidad de partidos ganados: ");
                                    int partidos_ganadosR = leer.nextInt();
                                    slyth.get(0).setPartidosG(partidos_ganadosR);
                                    //
                                    System.out.print("ingrese el promedio de Agilidad de sus jugadores");
                                    double agilidad_prR = leer.nextDouble();
                                    slyth.get(0).setPromedioA(agilidad_prR);
                                    //
                                    System.out.println("ingrese el promedio de Velozidad ");
                                    double velozidad_prR = leer.nextInt();
                                    slyth.get(0).setPromedioV(velozidad_prR);
                                    //
                                    System.out.println("ingrese el promedio de fuerza");
                                    double fuerza_prR = leer.nextInt();
                                    slyth.get(0).setPromedioF(fuerza_prR);
                                    break;
                                case 4:
                                    System.out.print("ingrese cantidad de partidos perdidos: ");
                                    int partidos_perdidosH = leer.nextInt();
                                    slyth.get(0).setPartidosP(partidos_perdidosH);
                                    //
                                    System.out.print("ingrese cantidad de partidos ganados: ");
                                    int partidos_ganadosH = leer.nextInt();
                                    slyth.get(0).setPartidosG(partidos_ganadosH);
                                    //
                                    System.out.print("ingrese el promedio de Agilidad de sus jugadores");
                                    double agilidad_prH = leer.nextDouble();
                                    slyth.get(0).setPromedioA(agilidad_prH);
                                    //
                                    System.out.println("ingrese el promedio de Velozidad ");
                                    double velozidad_prH = leer.nextInt();
                                    slyth.get(0).setPromedioV(velozidad_prH);
                                    //
                                    System.out.println("ingrese el promedio de fuerza");
                                    double fuerza_prH = leer.nextInt();
                                    slyth.get(0).setPromedioF(fuerza_prH);
                                    break;
                                default:

                            }
                            break;
                        case 3:
                            System.out.println("1=Gryffindor");
                            System.out.println("2=Slytherin");
                            System.out.println("3=Ravenclaw");
                            System.out.println("4=Hufflepuff");
                            System.out.println("A quien desea elimnar");
                            int opc_elim = leer.nextInt();
                            switch (opc_elim) {
                                case 1:
                                    grif.remove(0);
                                    break;
                                case 2:
                                    slyth.remove(0);
                                    break;
                                case 3:
                                    rave.remove(0);
                                    break;
                                case 4:
                                    huff.remove(0);
                                    break;
                                default:

                            }
                            break;
                        case 4:
                            for (Gryffindor x : grif) {
                                System.out.println(x);
                            }
                            for (Slytherin y : slyth) {
                                System.out.println(y);
                            }
                            for (Hufflepuff z : huff) {
                                System.out.println(z);
                            }
                            for (Ravenclaw w : rave) {
                                System.out.println(w);
                            }
                            break;
                        default:
                            throw new AssertionError();
                    }
                case 2:

                    System.out.println("1. Agregar \n2. Eliminar \n3. Modificar \n4. Listar");
                    int menuJugadores = leer.nextInt();
                    switch (menuJugadores) {

                        case 1: {
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
                        }
                        case 2: {
                            for (Juagdor Jugadore : Jugadores) {
                                System.out.println(Jugadore);
                            }
                            System.out.println("Que posicion quiere eliminar: ");
                            int pos = leer.nextInt();

                            Jugadores.remove(pos);
                            break;
                        }
                        case 3: {
                            for (Juagdor Jugadore : Jugadores) {
                                System.out.println(Jugadore);

                            }
                            System.out.println("Ingrese que posicion quiere modificar");
                            int pos = leer.nextInt();
                            System.out.println("Ingrese el nombre del jugador : ");
                            String nombre = leer.next();
                            Jugadores.get(pos).setNombre(nombre);
                            System.out.println("Ingrese el año que cursa en Hogwarts: ");
                            int año = leer.nextInt();
                            while (año <= 0) {
                                System.out.println("Numero invalido");
                                System.out.println("Ingrese el año que cursa en Hogwarts: ");
                                año = leer.nextInt();
                            }
                            Jugadores.get(pos).setTiempo_cursado(año);
                            System.out.println("Ingrese el numero de Uniforme: ");
                            int uni = leer.nextInt();
                            for (Juagdor x : Jugadores) {
                                while (x.getNumero_uni() == uni) {
                                    System.out.println("Numero de uniforme ya esta tomado: ");
                                    uni = leer.nextInt();
                                }
                            }
                            Jugadores.get(pos).setNumero_uni(uni);
                            System.out.println("Ingrese el nombre de la casa: ");
                            System.out.println("Tiene que ser Gryffindor,Slytherin,Ravenclaw,Hufflepuff");
                            String casa = leer.next();
                            while (!casa.contains("Gryffindor") && !casa.contains("Slytherin") && !casa.contains("Ravenclaw") && !casa.contains("Hufflepuff")) {
                                System.out.println("Tiene que ser Gryffindor,Slytherin,Ravenclaw,HufflePuff");
                                System.out.println("Ingrese el nombre de la casa: ");
                                casa = leer.next();
                            }
                            Jugadores.get(pos).setCasa(casa);

                            break;
                        }
                        case 4: {

                            for (Juagdor Jugadore : Jugadores) {
                                System.out.println(Jugadore);
                            }
                            break;
                        }
                        default:
                            System.out.println("Error! Solo existe opcion 1-3");
                    }

                    break;
                case 3:
                    System.out.println("1=Gryffindor");
                    System.out.println("2=Slytherin");
                    System.out.println("3=Ravenclaw");
                    System.out.println("4Hufflepuff");
                    System.out.print("elija el primer equipo a jugar: ");
                    int primer_equipo = leer.nextInt();
                    System.out.println("elija el segunod equipo a jugar: ");
                    int segundo_equipo = leer.nextInt();
                    if (true) {

                    }
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
    }

}
