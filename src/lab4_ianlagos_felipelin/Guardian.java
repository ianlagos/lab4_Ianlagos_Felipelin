package lab4_ianlagos_felipelin;

public class Guardian extends Juagdor {

    private int reflejo;
    private String nombreG;
    private int tiempo_cursadoG;
    private String casaG;
    private int numero_uniG;

    public Guardian() {
        super();
    }

    public Guardian(int reflejo, String nombre, int tiempo_cursado, String casa, int numero_uni) {
        super(nombre, tiempo_cursado, casa, numero_uni);
        this.reflejo = reflejo;
        this.nombreG = nombre;
        this.tiempo_cursadoG = tiempo_cursado;
        this.casaG = casa;
        this.numero_uniG = numero_uni;

    }

    public int getReflejo() {
        return reflejo;
    }

    public void setReflejo(int reflejo) {
        this.reflejo = reflejo;
    }

    @Override
    public String toString() {
        return "Guardian{" + "reflejo = " + reflejo + ", nombre = " + nombreG + ", tiempo cursado = " + tiempo_cursadoG + ", casa = " + casaG + ", numero_uni = " + numero_uniG + '}';
    }

    @Override
    public int VelocidadInicial() {
        return 0;
    }

    @Override
    public int Agilidad() {
        return reflejo + 7;
    }

    @Override
    public int Fuerza() {
        return 0;
    }

}
