package lab4_ianlagos_felipelin;

import java.util.ArrayList;

public class Equipo {

    protected int partidosG;
    protected int partidosP;
    protected int promedioA;
    protected int promedioV;
    protected int promedioF;
    protected ArrayList Jugadores = new ArrayList();
    protected String capitan;

    public Equipo(int partidosG, int partidosP, int promedioA, int promedioV, int promedioF, String capitan) {
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

    public int getPromedioA() {
        return promedioA;
    }

    public void setPromedioA(int promedioA) {
        this.promedioA = promedioA;
    }

    public int getPromedioV() {
        return promedioV;
    }

    public void setPromedioV(int promedioV) {
        this.promedioV = promedioV;
    }

    public int getPromedioF() {
        return promedioF;
    }

    public void setPromedioF(int promedioF) {
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
