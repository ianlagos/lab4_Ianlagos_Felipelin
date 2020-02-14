package lab4_ianlagos_felipelin;

public class Cazadores extends Juagdor {

    private int peso;
    private int reflejos;

    public Cazadores() {
        super();
    }

    public Cazadores(int peso, int reflejos) {
        this.peso = peso;
        this.reflejos = reflejos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getReflejos() {
        return reflejos;
    }

    public void setReflejos(int reflejos) {
        this.reflejos = reflejos;
    }

    @Override
    public String toString() {
        return "Cazadores{" + "peso=" + peso + ", reflejos=" + reflejos + '}';
    }

}
