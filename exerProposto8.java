import java.util.Locale;
import java.util.Scanner;

public class exerProposto8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double[] vetAlt = new double[N];
		char[] vetSexo = new char[N];
		double maior = 0, menor = '0', contMul = 0, somaMul = 0, contHom = 0;

		for (int i = 0; i < N; i++) {
			vetAlt[i] = sc.nextDouble();
			vetSexo[i] = sc.next().charAt(0);
		}
		for (int i = 0; i < N; i++) {
			if (vetAlt[i] > maior) {
				maior = vetAlt[i];
			}
			if (vetAlt[i] < menor) {
				menor = vetAlt[i];
			}
		}
		for (int i = 0; i < N; i++) {
			if (vetSexo[i] == 'F') {
			somaMul += vetAlt[i];
			contMul++;
			} else {
				contHom++;
			}
		}
		System.out.println("Menor altura = " + menor);
		System.out.println("Maior altura = " + maior);
		System.out.printf("Media das alturas das mulheres = %.2f%n", (somaMul / contMul));
		System.out.println("Numero de homens = " + (int)contHom);
		sc.close();
	}

}
