import java.util.Locale;
import java.util.Scanner;

public class uri1101 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int min = 0, max = 0;
		int M = sc.nextInt();
		int N = sc.nextInt();

		while (M > 0 && N > 0) {
			int soma = 0;
			if (M > N) {
				max = M;
				min = N;
			} else {
				max = N;
				min = M;
			}
			for (int i = min; i <= max; i++) {
				System.out.print(i+" ");
				soma += i;
			}
			System.out.println("Sum="+soma);
			M = sc.nextInt();
			N = sc.nextInt();
		}

		sc.close();
	}

}
