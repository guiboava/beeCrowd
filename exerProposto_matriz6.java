import java.util.Locale;
import java.util.Scanner;

public class exerProposto_matriz6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double somaPos = 0;
		int escoLinha, escoColuna;

		int N = sc.nextInt();
		double[][] mat = new double[N][N];
		double[][] matAo2 = new double[N][N];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] > 0) {
					somaPos += mat[i][j];
				}
			}
		}
		escoLinha = sc.nextInt();
		escoColuna = sc.nextInt();
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", somaPos);
		System.out.print("LINHA ESCOLHIDA: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (escoLinha == i) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.print("COLUNA ESCOLHIDA: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (escoColuna == j) {
					System.out.print(mat[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					matAo2[i][j] = Math.pow(mat[i][j], 2);
				} else {
					matAo2[i][j] = mat[i][j];
				}
			}
		}
		System.out.println("MATRIZ ALTERADA: ");
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(matAo2[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
