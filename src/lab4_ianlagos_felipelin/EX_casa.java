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
public class EX_casa extends Exception{

    public EX_casa() {
        super();
    }

    @Override
    public String toString() {
        return "{Usted no puede ser de esa casa" + '}';
    }
    
}
