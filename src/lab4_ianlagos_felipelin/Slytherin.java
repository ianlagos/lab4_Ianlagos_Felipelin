package lab4_ianlagos_felipelin;

public class Slytherin extends Equipo {

    protected int pa;
    protected int pp;
    protected double prA;
    protected double pv;
    protected double pf;
    protected Juagdor cap;

    public Slytherin(int partidosG, int partidosP, double promedioA, double promedioV, double promedioF, Juagdor capitan) {
        super(partidosG, partidosP, promedioA, promedioV, promedioF, capitan);
        this.pa = partidosG;
        this.pp = partidosP;
        this.prA = promedioA;
        this.pv = promedioV;
        this.pf = promedioF;
        this.cap = capitan;
    }

    @Override
    public String toString() {
        return "Slytherin{" + "Partidos Ganados=" + pa + ", Partidos perdidos=" + pp + ", Promedio aguilidad=" + prA + ", Promedio velozidad=" + pv + ", Promedio fuerza=" + pf + ", capitan=" + cap + '}';
    }

}
