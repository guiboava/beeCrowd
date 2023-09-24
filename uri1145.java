import java.util.Locale;
import java.util.Scanner;

public class uri1145 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int cont = 0;

		for (int i = 1; i < Y + 1; i++) {
			if (cont < X) {
				System.out.print(i);
				if (cont < X - 1) {
					System.out.print(" ");
				}
					cont += 1;
			}
			if (cont == X) {
				System.out.println("");
				cont = 0;
			}

		}

		sc.close();
	}

}
