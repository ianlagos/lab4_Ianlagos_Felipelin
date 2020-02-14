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
public class Casa_validacion {

    private String casa;

    public Casa_validacion() {
    }

    public Casa_validacion(String casa) throws EX_casa  {
        this.setCasa(casa);
    }

    public String getCasa() {
        return casa;
    }

    public void setCasa(String casa) throws EX_casa {
        if (!casa.contains("Gryffindor") && !casa.contains("Slytherin") && !casa.contains("Ravenclaw") && !casa.contains("Hufflepuff")) {
            System.out.println("Tiene que ser Gryffindor,Slytherin,Ravenclaw,HufflePuff");          
            throw new EX_casa();
        } else {
            
            this.casa = casa;
        }
        
    }

}
