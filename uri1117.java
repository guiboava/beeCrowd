import java.util.Locale;
import java.util.Scanner;

public class uri1117 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota,soma = 0;
		double contador = 0;
		
		
		while (contador < 2) {
			nota = sc.nextDouble();
			if (nota >= 0.00 && nota <=10.00) {
				soma += nota;
				contador +=1;
			}else {
			System.out.println("nota invalida");
			}
		}
		System.out.printf("media = %.2f%n",soma/2);
		sc.close();
	}

}
