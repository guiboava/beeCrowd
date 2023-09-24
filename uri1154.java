import java.util.Locale;
import java.util.Scanner;

public class uri1154 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		double i = 0,soma = 0;
		
		while (idade >= 0) {
			i += 1;
			soma += idade;
			idade = sc.nextInt();
		}
		System.out.printf("%.2f%n",soma/i);
		sc.close();
	}

}
