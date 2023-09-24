import java.util.Locale;
import java.util.Scanner;

public class uri1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		float num3 = sc.nextFloat();

		float a = 0, b = 0, c = 0;

		if (num1 >= num2 && num1 >= num3) { 
			a = num1;
			b = num2;
			c = num3;
		} else if (num2 >= num1 && num2 >= num3) {
			a = num2;
			b = num1;
			c = num3;
		} else if (num3 >= num1 && num3 >= num2) { 
			a = num3;
			b = num1;
			c = num2;
		}

		if (a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else if (Math.pow(a, 2) == (Math.pow(b, 2) + Math.pow(c, 2))) {
			System.out.println("TRIANGULO RETANGULO");
		} else if (Math.pow(a, 2) > (Math.pow(b, 2) + Math.pow(c, 2))) {
			System.out.println("TRIANGULO OBTUSANGULO");
		} else if (Math.pow(a, 2) < (Math.pow(b, 2) + Math.pow(c, 2))) {
			System.out.println("TRIANGULO ACUTANGULO");
		}

		if (a == b && a == c) {
			System.out.println("TRIANGULO EQUILATERO");
		} else if (a == b || b == c || c == a) {
			System.out.println("TRIANGULO ISOSCELES");
		}


		sc.close();

	}

}
