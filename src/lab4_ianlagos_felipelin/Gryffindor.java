package lab4_ianlagos_felipelin;

import java.util.ArrayList;

public class Gryffindor extends Equipo {

    protected int arr;
    protected int pp;
    protected double pA;
    protected double pv;
    protected double pf;
    protected Juagdor cap;
    private ArrayList<Juagdor> jugadores = new ArrayList();

    public Gryffindor(int partidosG, int partidosP, double promedioA, double promedioV, double promedioF, Juagdor capitan) {
        super(partidosG, partidosP, promedioA, promedioV, promedioF, capitan);
        this.arr = partidosG;
        this.pp = partidosP;
        this.pA = promedioA;
        this.pv = promedioV;
        this.pf = promedioF;
        this.cap = capitan;
    }

    public ArrayList<Juagdor> getJugadores2() {
        return jugadores;
    }

    public void setJugadores2(ArrayList<Juagdor> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Gryffindor{" + "Partidos ganados=" + arr + ", Partidos perdidos=" + pp + ", Promedio Aguilidad=" + pA + ", Promedio Agilidad=" + pv + ", Promedio fuerza=" + pf + ", Capitan=" + cap + "Jugador = " + jugadores + '}';
    }

}
