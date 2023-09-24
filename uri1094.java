import java.util.Locale;
import java.util.Scanner;

public class uri1094 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int C = 0, R = 0, S = 0;
		double totalCobais = 0, quantidadeCobais = 0;
		char escolha = ' ';

		for (int i = 0; i < N; i++) {
			quantidadeCobais = sc.nextInt();
			escolha = sc.next().charAt(0);
			totalCobais += quantidadeCobais;
			if (escolha == 'C' || escolha == 'c') {
				C += quantidadeCobais;
			} else if (escolha == 'R' || escolha == 'r') {
				R += quantidadeCobais;
			} else if (escolha == 'S' || escolha == 's') {
				S += quantidadeCobais;
			} else {
				System.out.println("caracter digitado de modo incorreto, digite novamente.");
			}
		}
		System.out.println("Total: " + (int)totalCobais + " cobaias");
		System.out.println("Total de coelhos: " + C);
		System.out.println("Total de ratos: " + R);
		System.out.println("Total de sapos: " + S);
		System.out.printf("Percentual de coelhos: %.2f %%%n", (C / totalCobais) * 100);
		System.out.printf("Percentual de ratos: %.2f %%%n", (R / totalCobais) * 100);
		System.out.printf("Percentual de sapos: %.2f %%%n", (S / totalCobais) * 100);
		sc.close();
	}

}
