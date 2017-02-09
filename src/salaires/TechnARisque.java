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
public class TechnARisque extends Technicien implements PrendRisques {
    final private int primeMensuelle = PRIME_MENSUELLE;
    
    public TechnARisque (String p, String n, int a, String d, int u) {
        super(p, n, a, d, u);
        this.calculerSalaire(u);
        this.type = "technicien à risque";
    }
    
    @Override
    public void calculerSalaire(int u) {
        double salaire = u * coefficient + primeMensuelle;
        
        super.setSalaire(salaire);
    }
}
