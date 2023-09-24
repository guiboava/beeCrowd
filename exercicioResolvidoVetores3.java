import java.util.Locale;
import java.util.Scanner;

public class exercicioResolvidoVetores3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vetAltura = new double[N];
		double[] vetIdade = new double[N];
		String[] nomes = new String[N];
		double somaIda = 0, somaAlt = 0;
		for (int i = 0; i < N; i++) {
			nomes[i] = sc.next();
			vetIdade[i] = sc.nextDouble();
			vetAltura[i] = sc.nextDouble();
		}
		for (int i = 0; i < N; i++) {
			somaAlt += vetAltura[i];
			if (vetIdade[i] < 16) {
				somaIda +=1;
			}
		}
		somaIda = (somaIda/N)*100;
		System.out.printf("Altura média: %.2f%n", somaAlt/N);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", somaIda);
		
		sc.close();
	}

}
