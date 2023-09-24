import java.util.Locale;
import java.util.Scanner;

public class uri1073 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "^2 = " + (int)Math.pow(i , 2));
			}
		}
		
		sc.close();
	}

}
