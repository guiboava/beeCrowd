import java.util.Locale;
import java.util.Scanner;

public class uri1159 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		while (x != 0) {
			int cont = 0;
			int soma = 0;
			if (x % 2 == 0.00) {
				while (cont < 5) {
					soma += +x;
					x += 2;
					cont += 1;
				}
				System.out.println(soma);
			} else {
				x += 1;
				while (cont < 5) {
					soma += +x;
					x += 2;
					cont += 1;
				}
				System.out.println(soma);
			}

			x = sc.nextInt();
		}

		sc.close();
	}

}
