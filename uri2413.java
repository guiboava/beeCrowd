import java.util.Locale;
import java.util.Scanner;

public class uri2413 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int diferenca = 0;
		diferenca = N - M;
		System.out.println(diferenca);
		
		sc.close();
	}

}
