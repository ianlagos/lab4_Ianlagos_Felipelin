package lab4_ianlagos_felipelin;

public class Ravenclaw extends Equipo {

    protected int pa;
    protected int pp;
    protected double prA;
    protected double pv;
    protected double pf;
    protected Juagdor cap;

    public Ravenclaw(int partidosG, int partidosP, double promedioA, double promedioV, double promedioF, Juagdor capitan) {
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
        return "Ravenclaw{" + "Partidos Ganados=" + pa + ", Partidos perdidos=" + pp + ", Promedio aguilidad=" + prA + ", Promedio velozidad=" + pv + ", Promedio fuerza=" + pf + ", capitan=" + cap + '}';
    }

}
