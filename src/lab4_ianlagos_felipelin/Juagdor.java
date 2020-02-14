/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_ianlagos_felipelin;

/**
 *
 * @author ian
 */
public class Juagdor {
    private String nombre;
    private int tiempo_cursado;
    private String casa;
    private int numero_uni;

    public Juagdor() {
    }

    public Juagdor(String nombre, int tiempo_cursado, String casa, int numero_uni) {
        this.nombre = nombre;
        this.tiempo_cursado = tiempo_cursado;
        this.casa = casa;
        this.numero_uni = numero_uni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo_cursado() {
        return tiempo_cursado;
    }

    public void setTiempo_cursado(int tiempo_cursado) {
        this.tiempo_cursado = tiempo_cursado;
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) {
        this.casa = casa;
    }

    public int getNumero_uni() {
        return numero_uni;
    }

    public void setNumero_uni(int numero_uni) {
        this.numero_uni = numero_uni;
    }

    @Override
    public String toString() {
        return "Juagdor{" + "nombre=" + nombre + ", tiempo_cursado=" + tiempo_cursado + ", casa=" + casa + ", numero_uni=" + numero_uni + '}';
    }

    

    
    
}
