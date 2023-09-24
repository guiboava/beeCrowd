import java.util.Locale;
import java.util.Scanner;

public class uri1146 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		while (N != 0) {
			for (int i = 1; i < N; i++) {
				System.out.print(i+" ");
			}
			System.out.println(N);
			N = sc.nextInt();
		}

		sc.close();
	}

}
