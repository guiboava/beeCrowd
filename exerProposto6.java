import java.util.Locale;
import java.util.Scanner;

public class exerProposto6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String[] vetA = new String[N];
		int[] vetB = new int[N];
		int U = 0, maisVelho = 0;
		
		for (int i = 0; i < N; i++) {
			vetA[i] = sc.next();
			vetB[i] = sc.nextInt();
		}
		for (int i = 0; i < N; i++) {
			if (vetB[i] > maisVelho) {
				U = i;
				maisVelho = vetB[i];
			}
		}
		System.out.println("Pessoa mais velha: "+ vetA[U]);
		sc.close();
	}

}
