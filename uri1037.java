import java.util.Locale;
import java.util.Scanner;

public class uri1037 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double numInserido = sc.nextDouble();
		String intervalo = "";

		if (numInserido >= 0 && numInserido <= 25) {
			intervalo = "[0,25]";
			System.out.println("Intervalo "+intervalo);
		} else if (numInserido > 25 && numInserido <= 50) {
			intervalo = "(25,50]";
			System.out.println("Intervalo "+intervalo);
		} else if (numInserido > 50 && numInserido <= 75) {
			intervalo = "(50,75]";
			System.out.println("Intervalo "+intervalo);
		} else if (numInserido > 75 && numInserido <= 100) {
			intervalo = "(75,100]";
			System.out.println("Intervalo "+intervalo);
		} else {
			System.out.println("Fora de intervalo");
		}

		sc.close();
	}

}
