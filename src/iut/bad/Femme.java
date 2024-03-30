package iut.bad;

public class Femme extends Humain {
	
	
	public Femme(String nom, String prenom, int age) {
		super(nom,prenom,age);
		
	} 
	public static void main(String[] arg) {
		Femme asmine = new Femme("rabe", "asmine", 30);
        Homme nicolas = new Homme("kintana", "nicolas", 35);
        
        asmine.ami(nicolas); 
        
        System.out.print("Liste des amis de asmine : " + asmine.getAmis());
        System.out.print("Liste des amis de nicolas : " + nicolas.getAmis());
	}


}
