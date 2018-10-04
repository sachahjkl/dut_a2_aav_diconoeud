package tp4;

public class NoeudLettre {
	private char val;
	private boolean terminal;
	private Dictionnaire d;
	
	public NoeudLettre(char val, boolean terminal) {
		this.val = val;
		this.terminal = terminal;
		this.d = new Dictionnaire();
	}
	
	public NoeudLettre(char val) {
		this(val, false);
	}
	
	public boolean estTerminal() {
		return this.terminal;
	}
	
	public void setTerminal() {
		this.terminal = true;
	}
	
	public boolean estPresent(String sousmot) {
		return this.d.estPresent(sousmot);
	}
	
	public void ajouterMot(String sousmot) {
		this.d.ajouterMot(sousmot);
	}

}
