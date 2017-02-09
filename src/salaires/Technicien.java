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
public class Technicien extends Employe {
    final protected int unitesProduites;
    final protected int coefficient = 5;
    
    public Technicien (String p, String n, int a, String d, int u) {
        super(p, n, a, d);
        this.unitesProduites = u;
        this.calculerSalaire(u);
        this.type = "technicien";
    }
    
    @Override
    public void calculerSalaire(int u) {
        double salaire = u * coefficient;
        
        super.setSalaire(salaire);
    }
}
