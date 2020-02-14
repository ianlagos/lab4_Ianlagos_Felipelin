package lab4_ianlagos_felipelin;

public class Golpeadores extends Juagdor {

    private int musculatura;
    private int reflejos;

    public Golpeadores() {
        super();
    }

    public Golpeadores(int musculatura, int reflejos, String nombre, int tiempo_cursado, String casa, int numero_uni) {
        super(nombre, tiempo_cursado, casa, numero_uni);
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

    @Override
    public int VelocidadInicial() {
        return 0;
    }

    @Override
    public int Agilidad() {
        return reflejos + 7;
    }

    @Override
    public int Fuerza() {
        return (musculatura * 2) - 7;
    }

}
