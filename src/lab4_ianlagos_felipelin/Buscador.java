package lab4_ianlagos_felipelin;

public class Buscador extends Juagdor {

    private int peso;

    public Buscador() {
        super();
    }

    public Buscador(int peso, String nombre, int tiempo_cursado, String casa, int numero_uni) {
        super(nombre, tiempo_cursado, casa, numero_uni);
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Buscador{" + "peso=" + peso + '}';
    }

    @Override
    public int VelocidadInicial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
