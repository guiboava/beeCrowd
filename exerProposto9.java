import java.util.Locale;
import java.util.Scanner;

public class exerProposto9 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		String[] vetProd = new String[N];
		double[] vetComp = new double[N];
		double[] vetVend = new double[N];
		
		int luc10 = 0, luc10_20 = 0, luc20 = 0;
		double totalVenda = 0, totalCompra = 0;
		
		for (int i = 0; i < N; i++) {
			vetProd[i] = sc.next();
			vetComp[i] = sc.nextDouble();
			vetVend[i] = sc.nextDouble();
		}
		for (int i = 0; i < N; i++) {
			if (vetVend[i] - vetComp[i] < 0.10 * vetComp[i]) {
				luc10++;
			} else if (vetVend[i] - vetComp[i] >= 0.10 * vetComp[i] && vetVend[i] - vetComp[i] <= 0.20 * vetComp[i]) {
				luc10_20++;
			} else {
				luc20++;
			}
		}
		for (int i = 0; i < N; i++) {
			totalCompra += vetComp[i];
			totalVenda += vetVend[i];
		}
		System.out.println("Lucro abaixo de 10%: " + luc10);
		System.out.println("Lucro entre 10% e 20%: " + luc10_20);
		System.out.println("Lucro acima de 20%: " + luc20);
		System.out.println("valor total de compra: " + totalCompra);
		System.out.println("valor total de venda: " + totalVenda);
		System.out.println("Lucro total: " + (totalVenda - totalCompra));

		sc.close();
	}

}
