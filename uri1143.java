import java.util.Locale;
import java.util.Scanner;

public class uri1143 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			double multi = i;
			multi = i * i;
			System.out.print((int) i + " ");
			System.out.print((int) multi + " ");
			System.out.println((int) multi * i);
		}
		sc.close();
	}

}
