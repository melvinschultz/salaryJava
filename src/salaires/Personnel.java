/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salaires;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author melvin
 */

public class Personnel {
    protected double salaireMoyen;
    
    List<Employe> list = new ArrayList<>();
    
    public Personnel() {
        
    }
    
    void ajouterEmploye(Employe e) {
        list.add(e);
    }
    
    void afficherSalaires() {
        for (Employe e : list) {
            System.out.println("Le " + e.getType() + " " + e.getNom() + " gagne " + e.getSalaire() + " francs.");
            
            salaireMoyen += e.getSalaire();
        }
    }
    
    public double salaireMoyen() {
        salaireMoyen = salaireMoyen / list.size();
        return salaireMoyen;
    }
}
