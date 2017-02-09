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
public class Representant extends Employe implements ObtientPourcentage {
    final private int chiffreDAffaire;
    final private double pourcentage = POURCENTAGE;
    final private int prime = 800;
    
    public Representant (String p, String n, int a, String d, int ca) {
        super(p, n, a, d);
        this.chiffreDAffaire = ca;
        this.calculerSalaire(ca);
        this.type = "représentant";
    }
    
    @Override
    public void calculerSalaire(int ca) {
        double salaire = ca * pourcentage + prime;
        
        super.setSalaire(salaire);
    }
}
