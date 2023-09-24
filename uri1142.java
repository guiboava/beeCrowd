import java.util.Locale;
import java.util.Scanner;

public class uri1142 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int cont = 0;

		for (int i = 1; i < N *4; i++) {
			if (cont < 3) {
				System.out.print(i + " ");
				cont += 1;
			} 
			if (cont ==3){
				i += 1;
				cont = 0;
				System.out.println("PUM");
			}
		}

		sc.close();
	}

}
