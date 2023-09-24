import java.util.Locale;
import java.util.Scanner;

public class uri1074 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X;
		String evenOdd, posNeg;

		for (int i = 0; i < N; i++) {
			X = sc.nextInt();
			if (X != 0) {
				if (X % 2 == 0) {
					evenOdd = "EVEN";
				} else {
					evenOdd = "ODD";
				}
				if (X > 0) {
					posNeg = "POSITIVE";
				} else {
					posNeg = "NEGATIVE";
				}
				System.out.println(evenOdd + " " + posNeg);
			} else {
				System.out.println("NULL");
			}
		}

		sc.close();
	}

}
