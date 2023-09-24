import java.util.Locale;
import java.util.Scanner;

public class uri1118 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double escolha = 0, i;
		double nota, total;

		while (escolha != 2 ) {
			i = 0;
			total = 0;
			while (i < 2) {
				nota = sc.nextDouble();
				if (nota >= 0 && nota <= 10) {
					total += nota;
					i += 1;
				} else {
					System.out.println("nota invalida");
				}
			}
			System.out.printf("media = %.2f%n", total / i);
			System.out.println("novo calculo (1-sim 2-nao)");
			escolha = sc.nextInt();
			while (escolha <1 || escolha >2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				escolha = sc.nextInt();
			}
		}

		sc.close();

	}

}
