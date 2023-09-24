import java.util.Locale;
import java.util.Scanner;

public class uri1060 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double num1, num2, num3, num4, num5, num6,total = 0;

		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		num5 = sc.nextDouble();
		num6 = sc.nextDouble();

		if (num1 > 0) {
			total += 1;
		}
		if (num2 > 0) {
			total += 1;
		}
		if (num3 > 0) {
			total += 1;
		}
		if (num4 > 0) {
			total += 1;
		}
		if (num5 > 0) {
			total += 1;
		}
		if (num6 > 0) {
			total += 1;
		}
		System.out.printf("%d valores positivos%n",(int)total);
		sc.close();
	}

}
