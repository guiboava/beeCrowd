import java.util.Locale;
import java.util.Scanner;

public class uri1116 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double X, Y, divisao;

		for (int i = 0; i < N; i++) {
			X = sc.nextDouble();
			Y = sc.nextDouble();
			if (Y != 0) {
				divisao = X / Y;
				System.out.printf("%.1f%n", divisao);
			} else {
				System.out.println("divisao impossivel");
			}
		}

		sc.close();
	}

}
