import java.util.Locale;
import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codItem = sc.nextInt();
		int quantItem = sc.nextInt();
		double valor;

		valor = 0;
		switch (codItem) {
		case 1:
			valor = quantItem * 4.00;
			break;
		case 2:
			valor = quantItem * 4.50;
			break;
		case 3:
			valor = quantItem * 5.00;
			break;
		case 4:
			valor = quantItem * 2.00;
			break;
		case 5:
			valor = quantItem * 1.50;
			break;
		}
		System.out.printf("Total: R$ %.2f%n", valor);

		sc.close();

	}

}
