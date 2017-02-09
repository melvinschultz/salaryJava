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
public class Vendeur extends Employe implements ObtientPourcentage {
    final private int chiffreDAffaire;
    final private double pourcentage = POURCENTAGE;
    final private int prime = 400;
    
    public Vendeur (String p, String n, int a, String d, int ca) {
        super(p, n, a, d);
        this.chiffreDAffaire = ca;
        this.calculerSalaire(ca);
        this.type = "vendeur";
    }
    
    @Override
    public void calculerSalaire(int ca) {
        double salaire = ca * pourcentage + prime;
        
        super.setSalaire(salaire);
    }
}
