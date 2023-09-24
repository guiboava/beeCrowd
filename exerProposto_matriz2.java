import java.util.Locale;
import java.util.Scanner;

public class exerProposto_matriz2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[][] mat = new int[N][N];
		int[] vet = new int[N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				vet[i] += mat[i][j]; 
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.println(vet[i]);
		}
		sc.close();
	}

}
