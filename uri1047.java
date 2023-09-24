import java.util.Locale;
import java.util.Scanner;

public class uri1047 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horaInicial, minutoInicial, horaFinal, minutoFinal;
		double totalHora, totalMinuto;

		horaInicial = sc.nextInt();
		minutoInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		minutoFinal = sc.nextInt();

		double minutosTotais = (horaFinal * 60 + minutoFinal) - (horaInicial * 60 + minutoInicial);

		if (minutosTotais <= 0) {
			minutosTotais += 24 * 60;
		}

		totalHora = minutosTotais / 60;
		totalMinuto = minutosTotais % 60;

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)%n", (int) totalHora, (int) totalMinuto);

		sc.close();

	}

}
