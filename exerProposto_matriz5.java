import java.util.Locale;
import java.util.Scanner;

public class exerProposto_matriz5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] mat1 = new int[N][M];
		int[][] mat2 = new int[N][M];
		int[][] matSoma = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				matSoma[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(matSoma[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
