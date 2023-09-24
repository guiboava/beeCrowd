import java.util.Locale;
import java.util.Scanner;

public class exemploResolvido01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[][] mat = new int[N][N];
		int contNeg = 0;

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		System.out.println();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					contNeg++;
				}
			}
		}
		System.out.println("QUANTIDADE DE NEGATIVOS = " + contNeg);
		sc.close();
	}

}
