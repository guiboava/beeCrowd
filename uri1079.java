import java.util.Locale;
import java.util.Scanner;

public class uri1079 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double media, nota1, nota2, nota3;

		for (int i = 0; i < N; i++) {
			nota1 = sc.nextDouble();
			nota2 = sc.nextDouble();
			nota3 = sc.nextDouble();
			media = (nota1 * 2.0 + nota2 * 3.0 + nota3 * 5.0) / 10;
			System.out.printf("%.1f%n", media);
		}

		sc.close();
	}

}
