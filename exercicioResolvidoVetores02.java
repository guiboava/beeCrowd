import java.util.Locale;
import java.util.Scanner;

public class exercicioResolvidoVetores02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vetor = new double[N];
		double soma = 0;
		
		for (int i = 0; i < N; i++) {
			vetor[i] = sc.nextDouble();
		}
		for (int i = 0; i < N; i++) {
			System.out.print( vetor[i]+" ");
			soma +=  vetor[i];
		}
		System.out.println();
		System.out.println(soma);
		System.out.println(soma / N);
		sc.close();
	}

}
