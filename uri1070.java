import java.util.Locale;
import java.util.Scanner;

public class uri1070 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		if (x % 2 == 0.0) {
			x += 1;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
		} else {
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
			x += 2;
			System.out.println(x);
		}

		sc.close();
	}

}
