import java.util.Locale;
import java.util.Scanner;

public class exerProposto2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] vet = new double[N];
		double pares = 0;
		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}
		for (int i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print((int)vet[i] + " ");
				pares++;
			}
		}
		System.out.println();
		System.out.println((int)pares);
		sc.close();
	}

}
