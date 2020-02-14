package lab4_ianlagos_felipelin;

public class Buscador extends Juagdor {

    private int peso;

    public Buscador() {
        super();
    }

    public Buscador(int peso) {
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

}
