import java.util.Locale;
import java.util.Scanner;

public class uri1046 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int horaInicio = sc.nextInt();
		int horaFim = sc.nextInt();
		
		int duracao = horaFim - horaInicio;
		
		if (horaInicio>horaFim) {
			duracao = (24-horaInicio) + horaFim;
		}else if(duracao>24 || horaInicio==horaFim) {
			duracao=24;
		}
		System.out.printf("O JOGO DUROU %d HORAS(S)%n",duracao);
		
		sc.close();

	}

}
