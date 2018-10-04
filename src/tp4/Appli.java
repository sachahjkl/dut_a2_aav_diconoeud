package tp4;

public class Appli {
	public static Dictionnaire d = new Dictionnaire();
	
	public static void main(String[] args) {
		
		d.ajouterMot("test");
		d.ajouterMot("jambon");
		d.ajouterMot("arbre");
		d.ajouterMot("jambe");
		d.ajouterMot("boudha");
		d.ajouterMot("boudin");
		d.ajouterMot("bodybuilder");
		d.ajouterMot("lit");
		d.ajouterMot("literie");
		d.ajouterMot("litteraire");
		d.ajouterMot("bureau");
		System.out.println(d.estPresent("tes"));
		System.out.println(d.estPresent("jambon"));
		System.out.println("nb mots " + d.nombreMots());
		System.out.println("nb lettres Physiques " + d.nombreLettresPhy());
		System.out.println(d.toString());
	}
}
