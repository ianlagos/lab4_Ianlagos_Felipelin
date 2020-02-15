package lab4_ianlagos_felipelin;

public class Buscador extends Juagdor {

    private int peso;
    private String nombreG;
    private int tiempo_cursadoG;
    private String casaG;
    private int numero_uniG;

    public Buscador() {
        super();
    }

    public Buscador(int peso, String nombre, int tiempo_cursado, String casa, int numero_uni) {
        super(nombre, tiempo_cursado, casa, numero_uni);
        this.peso = peso;
        this.nombreG = nombre;
        this.tiempo_cursadoG = tiempo_cursado;
        this.casaG = casa;
        this.numero_uniG = numero_uni;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Buscador{" + "peso = " + peso + ", nombre = " + nombreG + ", tiempo cursado = " + tiempo_cursadoG + ", casa = " + casaG + ", numero uni = " + numero_uniG + '}';
    }

    @Override
    public int VelocidadInicial() {
        return (200 / peso) * 7;
    }

    @Override
    public int Agilidad() {
        return 0;
    }

    @Override
    public int Fuerza() {
        return 0;
    }

}
