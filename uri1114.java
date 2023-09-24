import java.util.Locale;
import java.util.Scanner;

public class uri1114 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String senha_digitada = sc.next();
		String senha = "2002";
		
		while (!(senha_digitada.equals(senha))) {
			System.out.println("Senha Invalida");
			senha_digitada = sc.next();
		}
		System.out.println("Acesso Permitido");
		
		sc.close();
	}

}
