import java.util.Locale;
import java.util.Scanner;

public class uri1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a, b, c, perimetro, area;

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		if (a < b + c && b < a + c && c < b + a) {
			perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f%n", perimetro);

		} else {
			area = ((a + b) * c) / 2;
			System.out.printf("Area = %.1f%n", area);
		}

		sc.close();

	}

}
