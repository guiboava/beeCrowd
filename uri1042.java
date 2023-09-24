import java.util.Locale;
import java.util.Scanner;

public class uri1042 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3;

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();

		if (num1 <= num2 && num1 <= num3) {
			if (num2 <= num3) {
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);
				System.out.println();
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);
			} else if (num3 <= num2) {
				System.out.println(num1);
				System.out.println(num3);
				System.out.println(num2);
				System.out.println();
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);
			}
		} else if (num2 <= num1 && num2 <= num3) {
			if (num1 <= num3) {
				System.out.println(num2);
				System.out.println(num1);
				System.out.println(num3);
				System.out.println();
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);
			} else if (num3 <= num1) {
				System.out.println(num2);
				System.out.println(num3);
				System.out.println(num1);
				System.out.println();
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);
			}
		} else if (num3 <= num1 && num3 <= num2) {
			if (num2 <= num1) {
				System.out.println(num3);
				System.out.println(num2);
				System.out.println(num1);
				System.out.println();
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);
			} else if (num3 <= num1) {
				System.out.println(num3);
				System.out.println(num1);
				System.out.println(num2);
				System.out.println();
				System.out.println(num1);
				System.out.println(num2);
				System.out.println(num3);
			}
		}

		sc.close();
	}

}
