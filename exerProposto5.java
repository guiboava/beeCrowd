import java.util.Locale;
import java.util.Scanner;

public class exerProposto5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] vet = new double[N];
		double parSoma = 0, parTotal = 0;
		
		for (int i = 0; i < N; i++) {
			vet[i] = sc.nextDouble();
		}
		for(int i = 0; i < N; i++) {
			if (vet[i] % 2 == 0) {
				parSoma += vet[i];
				parTotal++;
			}
		}
		System.out.println(parSoma/parTotal);
		sc.close();
	}

}
