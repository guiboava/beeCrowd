import java.util.Locale;
import java.util.Scanner;

public class uri1048 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salarioInicial = sc.nextDouble();
		double porcentagemAumentada, salarioAtualizado;

		if (salarioInicial <= 400.00) {
			salarioAtualizado = salarioInicial+(salarioInicial * 0.15);
			porcentagemAumentada = 0.15 * 100;
		} else if (salarioInicial > 400.00 && salarioInicial <= 800.00) {
			salarioAtualizado = salarioInicial+(salarioInicial * 0.12);
			porcentagemAumentada = 0.12 * 100;
		} else if (salarioInicial > 800.00 && salarioInicial <= 1200.00) {
			salarioAtualizado = salarioInicial+(salarioInicial * 0.10);
			porcentagemAumentada = 0.10 * 100;
		} else if (salarioInicial > 1200.00 && salarioInicial <= 2000.00) {
			salarioAtualizado = salarioInicial+(salarioInicial * 0.07);
			porcentagemAumentada = 0.07 * 100;
		} else {
			salarioAtualizado = salarioInicial+(salarioInicial * 0.04);
			porcentagemAumentada = 0.04 * 100;
		}
		double reajusteGanho= salarioAtualizado - salarioInicial;
		System.out.printf("Novo salario: %.2f%n",salarioAtualizado);
		System.out.printf("Reajuste ganho: %.2f%n",reajusteGanho);
		System.out.println("Em percentual: "+(int)porcentagemAumentada+" %");

		sc.close();
	}
}
