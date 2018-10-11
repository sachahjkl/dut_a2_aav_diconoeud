package tp5;

public class ABR<T extends Comparable<T>> {
	private T val;
	private ABR<T> fg, fd;

	public ABR() {
		this.val = null;
		this.fd = null;
		this.fg = null;
	}

	public ABR(T val) {
		this.val = val;
		this.fd = new ABR<>();
		this.fg = new ABR<>();
	}

	public T getValue() {
		return this.val;
	}

	public void setValue(T val) {
		this.val = val;
	}

	public void ajouter(T val) {
		if (val == null) {
			setValue(val);
			this.fg = new ABR<>();
			this.fd = new ABR<>();
		} else if (val.compareTo(this.val) == 1) {
			fd.ajouter(val);
		} else
			fg.ajouter(val);
	}

	public int hauteur() {
		if (this.val == null)
			return 0;
		return 1 + Math.max(fd.hauteur(), fg.hauteur());
	}

	public boolean estEquilibre() {
		if (this.val == null)
			return true;
		return ((Math.abs(fd.hauteur() - fg.hauteur()) <= 1) && fg.estEquilibre() && fd.estEquilibre());
	}

	public void ajoutEquilibre(T val) {
		ajouter(val);
		if (!this.estEquilibre()) {
			this.rotationDroite();
		}
	}

	public void rotationDroite() {
		T tv = this.getValue();
		this.setValue(fg.getValue());
		this.fg.setValue(tv);
		ABR<T> ta = this.fg;
		this.fg = this.fg.fg;
		ta.fg = ta.fd;
		ta.fd = this.fd;
		this.fd = ta;
	}
	
	public void rotationGauche() {
		T tv = this.getValue();
		this.setValue(fd.getValue());
		this.fd.setValue(tv);
		ABR<T> ta = this.fd;
		this.fd = this.fd.fd;
		ta.fd = ta.fg;
		ta.fg = this.fg;
		this.fg = ta;
	}
}
