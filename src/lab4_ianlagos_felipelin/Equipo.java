package lab4_ianlagos_felipelin;

import java.util.ArrayList;

public class Equipo {

    protected String casa;
    protected int partidosG;
    protected int partidosP;
    protected double promedioA;
    protected double promedioV;
    protected double promedioF;
    protected ArrayList Jugadores = new ArrayList();
    protected String capitan;

    public Equipo(int partidosG, int partidosP, double promedioA, double promedioV, double promedioF, String capitan) {
        this.partidosG = partidosG;
        this.partidosP = partidosP;
        this.promedioA = promedioA;
        this.promedioV = promedioV;
        this.promedioF = promedioF;
        this.capitan = capitan;
    }

    public int getPartidosG() {
        return partidosG;
    }

    public void setPartidosG(int partidosG) {
        this.partidosG = partidosG;
    }

    public int getPartidosP() {
        return partidosP;
    }

    public void setPartidosP(int partidosP) {
        this.partidosP = partidosP;
    }

    public double getPromedioA() {
        return promedioA;
    }

    public void setPromedioA(double promedioA) {
        this.promedioA = promedioA;
    }

    public double getPromedioV() {
        return promedioV;
    }

    public void setPromedioV(double promedioV) {
        this.promedioV = promedioV;
    }

    public double getPromedioF() {
        return promedioF;
    }

    public void setPromedioF(double promedioF) {
        this.promedioF = promedioF;
    }

    public ArrayList getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList Jugadores) {
        this.Jugadores = Jugadores;
    }

    public String getCapitan() {
        return capitan;
    }

    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }

    @Override
    public String toString() {
        return "Equipo{" + "partidosG=" + partidosG + ", partidosP=" + partidosP + ", promedioA=" + promedioA + ", promedioV=" + promedioV + ", promedioF=" + promedioF + ", Jugadores=" + Jugadores + ", capitan=" + capitan + '}';
    }

}
