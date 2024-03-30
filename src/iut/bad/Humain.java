package iut.bad;

import java.util.ArrayList;
import java.util.List;

public class Humain {
	private String nom; 
	private String prenom; 
	private int age;
	
	private List<Humain> amis;
	
	public Humain(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.amis = new = ArrayList<>();
	} 
	
	public void details() {
		System.out.print(nom + " " + prenom + " " + age);
	}
	public String toString() {
		return nom + " " + prenom + " " + age;
	}

	public void manger() {
		System.out.print("mangez!!");
		
	}
	public void boire() {
		System.out.print("buvez!!");
		
	}
	public void ami(Humain ami, int dureeAmitie) {
        if (!this.amis.contains(ami)) {
            this.amis.add(new Ami(ami, dureeAmitie));
            ami.ami(this, dureeAmitie);s
            System.out.println(this.prenom + " est desormais ami avec " + ami.prenom + " depuis " + dureeAmitie + " jours.");
        } else {
            System.out.println(this.prenom + " est déjà ami avec " + ami.prenom + ".");
        }
    }
	
	public List<Humain> getAmis() {
        return amis;
    }
    
    public void setAmis(List<Humain> amis) {
        this.amis = amis;
    }
}


