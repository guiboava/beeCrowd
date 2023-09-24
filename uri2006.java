import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class uri2006 {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int[] vect = new int[5];

		for (int i = 0; i < vect.length; i++) {
			vect[i] = sc.nextInt();
		}
		int correctPeople = 0;
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] == T) {
				correctPeople += 1;
			}
		}
		System.out.println(correctPeople);
		sc.close();
	}

}