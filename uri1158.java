import java.util.Locale;
import java.util.Scanner;

public class uri1158 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int soma, X, Y;

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			X = sc.nextInt();
			Y = sc.nextInt();
			int cont = 0;
			soma = 0;
			while (cont < Y) {
				
				if (X % 2 !=0) {
					soma += X;
					X += 2;
					cont += 1;
				} else {
					X +=1;
				}
			}
			System.out.println(soma);
			
		}

		sc.close();
	}

}
