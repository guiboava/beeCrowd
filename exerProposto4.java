import java.util.Locale;
import java.util.Scanner;

public class exerProposto4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] vet = new double[N];
		double media, soma = 0;
		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}
		for (int i = 0; i < N; i++) {
			soma += vet[i];
		}
		media = soma / N;
		System.out.println(media);
		for (int i = 0; i < N; i++) {
			if (vet[i] < media) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}

}
