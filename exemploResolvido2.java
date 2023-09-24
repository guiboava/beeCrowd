import java.util.Locale;
import java.util.Scanner;

public class exemploResolvido2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		double[][] mat = new double[M][N];
		double[] vetSoma = new double [M];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N;j++) {
				mat[i][j] = sc.nextDouble();
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				vetSoma [i] += mat[i][j];
			}
		}
		for (int i = 0; i < M; i++) {
			System.out.println(vetSoma[i]);
		}
		sc.close();
	}

}
