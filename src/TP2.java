
public class TP2 {

	public static void main(String[] args) {
		float[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		System.out.println(TP2.dichotomie(tab, 5));
	}

	public static int syracuse(int n) {
		if (n == 1)
			return n;
		if (n % 2 == 0)
			return syracuse(n);
		return n;
	}

	public static boolean dichotomie(float[] t, float x) {
		return dichotomieRec(t, x, 0, t.length - 1);
	}

	//complexite Θ(log(n))
	public static boolean dichotomieRec(float[] t, float x, int d, int f) {
		int mid = (int) Math.ceil((f + d) / 2);
		if (t[mid] == x)
			return true;
		else if (f == d)
			return false;
		else if (t[mid] > x)
			return dichotomieRec(t, x, d, mid - 1);
		else if (t[mid] < x)
			return dichotomieRec(t, x, mid + 1, f);
		return false;
	}
}
