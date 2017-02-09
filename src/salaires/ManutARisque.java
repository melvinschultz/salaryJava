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
public class ManutARisque extends Manutentionnaire implements PrendRisques {
    final private int primeMensuelle = PRIME_MENSUELLE;
    
    public ManutARisque (String p, String n, int a, String d, int h) {
        super(p, n, a, d, h);
        this.calculerSalaire(h);
        this.type = "manutentionnaire à risque";
    }
    
    @Override
    public void calculerSalaire(int h) {
        double salaire = h * coefficient + primeMensuelle;
        
        super.setSalaire(salaire);
    }
}
