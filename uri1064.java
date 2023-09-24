import java.util.Locale;
import java.util.Scanner;

public class uri1064 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double num1, num2, num3, num4, num5, num6,total = 0,soma = 0;

		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		num4 = sc.nextDouble();
		num5 = sc.nextDouble();
		num6 = sc.nextDouble();

		if (num1 > 0) {
			total += 1;
			soma += num1;
		}
		if (num2 > 0) {
			total += 1;
			soma += num2;
		}
		if (num3 > 0) {
			total += 1;
			soma += num3;
		}
		if (num4 > 0) {
			total += 1;
			soma += num4;
		}
		if (num5 > 0) {
			total += 1;
			soma += num5;
		}
		if (num6 > 0) {
			total += 1;
			soma += num6;
		}
		System.out.printf("%d valores positivos%n",(int)total);
		System.out.printf("%.1f%n",soma/total);
		sc.close();
	}

}
