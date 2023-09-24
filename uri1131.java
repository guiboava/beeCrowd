import java.util.Locale;
import java.util.Scanner;

public class uri1131 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int escolhaNovo = 0, golInter, golGremio, vitInter = 0, vitGremio = 0, empate = 0, totalGrenais = 0;

		while (escolhaNovo != 2) {
			totalGrenais += 1;
			golInter = sc.nextInt();
			golGremio = sc.nextInt();
			if (golInter > golGremio) {
				vitInter += 1;
			} else if (golGremio > golInter) {
				vitGremio += 1;
			} else if (golGremio == golInter) {
				empate += 1;
			}
			System.out.println("Novo grenal (1-sim 2-nao)");
			escolhaNovo = sc.nextInt();
			while (escolhaNovo < 1 && escolhaNovo > 2) {
				System.out.println("Novo grenal (1-sim 2-nao)");
				escolhaNovo = sc.nextInt();
			}
		}
		System.out.println(totalGrenais + " grenais");
		System.out.println("Inter:" + vitInter);
		System.out.println("Gremio:" + vitGremio);
		System.out.println("Empates:" + empate);
		if (vitGremio > vitInter) {
			System.out.println("Gremio venceu mais");
		} else if (vitInter > vitGremio) {
			System.out.println("Inter venceu mais");
		} else {
			System.out.println("empate");
		}
		sc.close();
	}

}
