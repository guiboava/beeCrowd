import java.util.Locale;
import java.util.Scanner;

public class uri1134 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tipoCombustivel = 0,alcool = 0, gasolina = 0, diesel = 0 ;
		
		
		while (tipoCombustivel != 4) {
			tipoCombustivel = sc.nextInt();
			if (tipoCombustivel >=1 && tipoCombustivel <=4) {
				switch (tipoCombustivel) {
				case 1 :
					alcool += 1;
					break;
				case 2 :
					gasolina += 1;
					break;
				case 3 :
					diesel += 1;
					break;
				}
			}
		
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		sc.close();
	}

}
