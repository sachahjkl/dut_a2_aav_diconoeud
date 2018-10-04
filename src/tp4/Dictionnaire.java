package tp4;

public class Dictionnaire {
	private NoeudLettre[] d;
	private final int nbLettres = 26;

	public Dictionnaire() {
		this.d = new NoeudLettre[nbLettres];
		for (NoeudLettre n : d)
			n = null;
	}

	public boolean estPresent(String mot) {
		int index = mot.charAt(0) - 'a';
		if (d[index] == null)
			return false;
		if (mot.length() == 1)
			return d[index].estTerminal();
		return this.d[index].estPresent(mot.substring(1));
	}

	public void ajouterMot(String mot) {
		int index = mot.charAt(0) - 'a';
		if (d[index] == null)
			d[index] = new NoeudLettre(mot.charAt(0));
		if (mot.length() == 1) {
			d[index].setTerminal();
			return;
		}
		d[index].ajouterMot(mot.substring(1));
	}

	public int nombreMots() {
		int nbMots = 0;
		for (NoeudLettre n : d) {
			if (n != null) {
				nbMots += n.estTerminal() ? 1 : 0;
				nbMots += n.nombreMots();
			}
		}
		return nbMots;
	}

	public int nombreLettres() {
		int nbLettres = 0;
		for (NoeudLettre n : d) {
			if (n != null) {
				nbLettres += n.estTerminal() ? 1 + n.nombreLettres() : 1;
			}
		}
		return nbLettres;
	}

	public int nombreLettresPhy() {
		int nbLettres = 0;
		for (NoeudLettre n : d) {
			if (n != null) {
				nbLettres += 1 + n.nombreLettresPhy();
			}
		}
		return nbLettres;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (NoeudLettre n : d) {
			
		}
		return sb.toString();
	}

}
