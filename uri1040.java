import java.util.Locale;
import java.util.Scanner;

public class uri1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1 = sc.nextFloat();
		float n2 = sc.nextFloat();
		float n3 = sc.nextFloat();
		float n4 = sc.nextFloat();

		float media = (float) (((n1 * 2.00) + (n2 * 3.00) + (n3 * 4.00) + (n4 * 1.00)) / 10.00);

		if (media >= 7.0) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno aprovado.");
		} else if (media >= 5.0 && media <= 6.9) {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno em exame.");
			float notaExame = sc.nextFloat();
			System.out.printf("Nota do exame: %.1f%n", notaExame);
			float mediaFinal = (float) ((media + notaExame) / 2.0);
			if (mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", mediaFinal);
			} else {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n", (double) mediaFinal);
			}
		} else {
			System.out.printf("Media: %.1f%n", media);
			System.out.println("Aluno reprovado.");
		}

		sc.close();
	}

}
