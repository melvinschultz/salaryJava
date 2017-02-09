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
public abstract class Employe {
    
    private String prenom;
    private String nom;
    final private int age;
    final private String anneeEntree;
    protected String type;
    private double salaire;
    
    public Employe (String p, String n, int a, String d) {
        this.prenom = p;
        this.nom = n;
        this.age = a;
        this.anneeEntree = d;
    }
    
    public abstract void calculerSalaire(int val);
    
    public String getNom() {
        return prenom+" "+nom;
    }
    
    public void setNom(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public double getSalaire() {
        return salaire;
    }
    
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }
}
