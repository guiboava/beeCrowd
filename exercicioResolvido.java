import java.util.Locale;
import java.util.Scanner;

public class exercicioResolvido {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double total = 0;
		double x = sc.nextInt();
		double i = 0;

		if (x < 0) {
			System.out.println("impossivel calcular");
		} else {

			while (x >= 0) {
				i += 1;
				total += x;
				x = sc.nextInt();
			}
			System.out.printf("%.2f%n",total / i);
		}
		
		sc.close();

	}

}
