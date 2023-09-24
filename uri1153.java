import java.util.Locale;
import java.util.Scanner;

public class uri1153 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = N -1; i != 0; i--) {
			N *= i;
		}
		System.out.println(N);

		sc.close();
	}

}
