import java.util.Locale;
import java.util.Scanner;

public class uri1080 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int pos = 0;
		int maior = 0;
		int num;
		
		for (int i = 1; i <= 100 ; i++) {
			
			num = sc.nextInt();
			
			if (maior <= num) {
				maior = num;
				pos = i;
			}
		}
		System.out.println(maior);
		System.out.println(pos);
		sc.close();
	}

}
