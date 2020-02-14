package lab4_ianlagos_felipelin;

public class Cazadores extends Juagdor {

    private int peso;
    private int reflejos;

    public Cazadores() {
        super();
    }

    public Cazadores(int peso, int reflejos, String nombre, int tiempo_cursado, String casa, int numero_uni) {
        super(nombre, tiempo_cursado, casa, numero_uni);
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

    @Override
    public int VelocidadInicial() {
        return (200 / peso) * 7;
    }

    @Override
    public int Agilidad() {
        return reflejos + 7;
    }

    @Override
    public int Fuerza() {
        return 0;
    }

}
