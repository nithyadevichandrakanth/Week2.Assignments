package week1.day2;

public class SquareRoot {

	public static int squareRoot(int x) {

		int ans = 0;
		for (int i = 1; i <= x; i++) {

			if (i * i <= x) {
				ans = i;

			}

		}
return ans;
	}
	public static void main(String[] args) {
	System.out.println(squareRoot(8));
	}

}
