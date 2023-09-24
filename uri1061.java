import java.util.Locale;
import java.util.Scanner;

public class uri1061 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int diaInicio,diaFim;
		int horaInicio, minutoInicio, segundoInicio, horaFim, minutoFim, segundoFim;
		double segundosCorridos,diasTotais,horasTotais,minutosTotais,segundosTotais,resto;
		
		sc.next();
		diaInicio = sc.nextInt();
		horaInicio = sc.nextInt();
		sc.next();
		minutoInicio = sc.nextInt();
		sc.next();
		segundoInicio = sc.nextInt();
		sc.next();
		diaFim = sc.nextInt();
		horaFim = sc.nextInt();
		sc.next();
		minutoFim = sc.nextInt();
		sc.next();
		segundoFim = sc.nextInt();
		
		segundosCorridos =Math.abs(((diaInicio-diaFim)*86400)+((horaInicio-horaFim)*3600)+((minutoInicio-minutoFim)*60)+(segundoInicio-segundoFim)) ; 
		
		diasTotais =segundosCorridos / 86400;
		resto = segundosCorridos % 86400;
		horasTotais = resto / 3600;
		resto = resto % 3600;
		minutosTotais = resto / 60;
		resto = resto % 60;
		segundosTotais = resto;
		
		System.out.printf("%d dia(s)%n",(int)diasTotais);
		System.out.printf("%d hora(s)%n",(int)horasTotais);
		System.out.printf("%d minuto(s)%n",(int)minutosTotais);
		System.out.printf("%d segundo(s)%n",(int)segundosTotais);
		
	    sc.close();
	}

}

