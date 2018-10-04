package tp3_e1;

public class BTreeCS extends BTreeCA {
	private BTreeCS uptree;

		
	public BTreeCS(int v) {
		
		this.uptree = this;
	}
	
	public BTreeCS(int v, BTreeCS l, BTreeCS r) {
		super(v, l, r);
		l.uptree = this;
		r.uptree = this;
		this.uptree = this;
	}
	
	public BTreeCS(int v, BTreeCS l, BTreeCS r, BTreeCS uptree) {
		super(v, l, uptree);
		this.uptree = uptree;
	}
	
	@Override
	public BTreeCS getRoot() throws Exception {
		if(this.isEmpty()) throw new Exception();
		return this.isRoot() ? this: this.uptree.getRoot();
	}

	private boolean isRoot() {
		return this.uptree == this;
	}
	
}
