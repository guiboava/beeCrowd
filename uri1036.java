import java.util.Locale;
import java.util.Scanner;

public class uri1036 {
 
    public static void main(String[] args) {
 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c,r1,r2,delta;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		delta = (Math.pow(b, 2))-4.0*a*c;
		
		if (2*a == 0 || delta <1) {
			System.out.println("Impossivel calcular");
		}else {
			r1 = (-b + Math.sqrt(delta))/(2.0*a) ;
			r2 = (-b - Math.sqrt(delta))/(2.0*a) ;
			System.out.printf("R1 = %.5f%n",r1);
			System.out.printf("R2 = %.5f%n",r2);
		}
		
		sc.close();
 
    }
 
}