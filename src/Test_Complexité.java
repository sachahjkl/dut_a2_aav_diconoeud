
public class Test_Complexité {
	public static void loops(int n) {
		int calc = 0, calc1 = 0, calc2 = 0;
		for (int i = 1; i <= n - 1; i++) {
			++calc;
			for (int j = i + 1; j <= n; j++) {
				++calc1;
				for (int k = 1; k <= j; k++) {
					++calc2;
					// System.out.print("x");
				}
				// System.out.println("");
			}
		}
		System.out.println("nb de boucles: " + calc + ", " + calc1 + ", " + calc2);
	}

	public static int sumSquare1(int n) {
		int res = 0;
		for (int i = 1; i <= i; i++) {
			for (int j = 1; j <= i; j++) {
				res = res + i;
			}
		}
		return res;
	}

	public static int sumSquare2(int n) {
		int res = 0;
		for (int i = 1; i <= i; i++) {
			res = res + i * i;
		}
		return res;
	}

	public static int sumSquare3(int n) {
		int res = 0;
		res = n * (n + 1) * (2 * n + 1) / 6;
		return res;
	}

	public static void main(String[] args) {
		loops(5000);
	}
}
