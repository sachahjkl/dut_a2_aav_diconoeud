package tp3_e1;

public class BTreeCA implements BTree {
	private Integer value;
	private BTree l, r;

	protected BTreeCA() {
		this.value = null;
		this.l = null;
		this.r = null;
	}

	public BTreeCA(int v) {
		this(v, new BTreeCA(), new BTreeCA());
	}

	public BTreeCA(int v, BTree l, BTree r) {
		this.value = v;
		this.l = l;
		this.r = r;
	}

	@Override
	public boolean isEmpty() {
		return this.value == null;
	}

	@Override
	public BTree getRoot() throws Exception {
		return this;
	}

	@Override
	public int getValue() throws Exception {
		if (this.isEmpty())
			throw new Exception();
		return this.value;
	}

	@Override
	public BTree getLeftTree() throws Exception {
		if (this.isEmpty())
			throw new Exception();
		return this.l;
	}

	@Override
	public BTree getRightTree() throws Exception {
		if (this.isEmpty())
			throw new Exception();
		return this.r;
	}

	@Override
	public int getLeftValue() throws Exception {
		if (this.isEmpty())
			throw new Exception();
		if (this.l.isEmpty())
			throw new Exception();
		return this.l.getValue();
	}

	@Override
	public int getRightValue() throws Exception {
		if (this.isEmpty())
			throw new Exception();
		if (this.r.isEmpty())
			throw new Exception();
		return this.r.getValue();
	}

	@Override
	public void setLeftTree(BTree leftTree) throws Exception {
		assert (leftTree != null);
		if (this.isEmpty())
			throw new Exception();
		this.l = leftTree;

	}

	@Override
	public void setRightTree(BTree rightTree) throws Exception {
		assert (rightTree != null);
		if (this.isEmpty())
			throw new Exception();
		this.l = rightTree;

	}

	@Override
	public void setLeftValue(int leftSubRoot) throws Exception {
		this.setLeftTree(new BTreeCA(leftSubRoot));
	}

	@Override
	public void setRightValue(int rightSubRoot) throws Exception {
		this.setRightTree(new BTreeCA(rightSubRoot));

	}

	public String toString() {
		return this.isEmpty() ? "" : this.l.toString() + " - " + this.value + " - " + this.r.toString();
	}

}
