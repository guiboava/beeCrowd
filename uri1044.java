import java.util.Locale;
import java.util.Scanner;

public class uri1044 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		double resto;
		
		if (a<b) {
			resto = (double)b % a;
		}else {
			resto = (double)a % b;
		}
		
		if (resto ==0.0){
			System.out.println("Sao Multiplos");
		}else {
			System.out.println("Nao sao Multiplos");
		}
		
		sc.close();
	}
}