import java.util.Locale;
import java.util.Scanner;

public class exemploForWhile {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char escolha;

		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			double fahre = 9 * celsius / 5 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahre);
			System.out.println("Deseja repetir (s/n)?");
			escolha = sc.next().charAt(0);
		} while (escolha == 's');

		sc.close();
	}

}
