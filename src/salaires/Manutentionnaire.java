/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaires;

/**
 *
 * @author melvin
 */
public class Manutentionnaire extends Employe {
    final protected int nbHeures;
    final protected int coefficient = 65;
    
    public Manutentionnaire (String p, String n, int a, String d, int h) {
        super(p, n, a, d);
        this.nbHeures = h;
        this.calculerSalaire(h);
        this.type = "manutentionnaire";
    }
    
    @Override
    public void calculerSalaire(int h) {
        double salaire = h * coefficient;
        
        super.setSalaire(salaire);
    }
}
