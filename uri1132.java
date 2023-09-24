import java.util.Locale;
import java.util.Scanner;

public class uri1132 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int soma = 0, min, max;

		if (x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;
		}

		for (int i = min; i <= max; i++) {

			if (i % 13 != 0) {
				soma += i;
			}
		}
		System.out.println(soma);

		sc.close();
	}

}
