import java.util.Locale;
import java.util.Scanner;

public class uri1065 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, num4, num5, contador = 0;

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		if (num1 % 2 == 0.0) {
			contador += 1;
		}
		if (num2 % 2 == 0.0) {
			contador += 1;
		}
		if (num3 % 2 == 0.0) {
			contador += 1;
		}
		if (num4 % 2 == 0.0) {
			contador += 1;
		}
		if (num5 % 2 == 0.0) {
			contador += 1;
		}

		System.out.println(contador + " valores pares");
		sc.close();

	}

}
