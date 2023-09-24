import java.util.Locale;
import java.util.Scanner;

public class exerProposto_matriz7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int fila, ultimoFila;
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] mat = new int[M][N];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		fila = sc.nextInt();
		fila--;
		ultimoFila = mat[fila][N-1];
		
		for (int i = M -1; i > 0; i--) {
			for (int j = N -1; j > 0; j--) {
				mat[fila][N-1] = mat[i][j];
			}
		}
		mat[fila][0] = ultimoFila;
		System.out.println();
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
