package tp4;

public class Appli {
	public static Dictionnaire d = new Dictionnaire();
	
	public static void main(String[] args) {
		
		d.ajouterMot("test");
		d.ajouterMot("tes");
		System.out.println(d.estPresent("tes"));
	}
}
