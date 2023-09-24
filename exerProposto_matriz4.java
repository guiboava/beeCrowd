import java.util.Locale;
import java.util.Scanner;

public class exerProposto_matriz4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] mat = new int[N][N];

		int soma = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				soma += mat[i][j];
			}
		}
		System.out.println(soma);
		sc.close();
	}

}
