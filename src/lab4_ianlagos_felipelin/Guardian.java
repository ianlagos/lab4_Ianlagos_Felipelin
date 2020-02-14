package lab4_ianlagos_felipelin;

public class Guardian extends Juagdor {

    private int reflejo;

    public Guardian() {
        super();
    }

    public Guardian(int reflejo, String nombre, int tiempo_cursado, String casa, int numero_uni) {
        super(nombre, tiempo_cursado, casa, numero_uni);
        this.reflejo = reflejo;
    }

    public int getReflejo() {
        return reflejo;
    }

    public void setReflejo(int reflejo) {
        this.reflejo = reflejo;
    }

    @Override
    public String toString() {
        return "Guardian{" + "reflejo=" + reflejo + '}';
    }

    @Override
    public int VelocidadInicial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
