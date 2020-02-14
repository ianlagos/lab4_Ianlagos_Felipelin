package lab4_ianlagos_felipelin;

public class Golpeadores extends Juagdor{

    private int musculatura;
    private int reflejos;

    public Golpeadores() {
        super();
    }

    public Golpeadores(int musculatura, int reflejos) {
        this.musculatura = musculatura;
        this.reflejos = reflejos;
    }

    public int getMusculatura() {
        return musculatura;
    }

    public void setMusculatura(int musculatura) {
        this.musculatura = musculatura;
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }

    @Override
    public String toString() {
        return "Golpeadores{" + "musculatura=" + musculatura + ", reflejos=" + reflejos + '}';
    }

}
