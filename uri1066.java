import java.util.Locale;
import java.util.Scanner;

public class uri1066 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, num4, num5, numPar = 0, numImp = 0, numPos = 0, numNeg = 0;

		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		num5 = sc.nextInt();

		if (num1 % 2 == 0.0) {
			numPar += 1;
		} else {
			numImp += 1;
		}
		if (num1 > 0) {
			numPos += 1;
		} else if (num1 < 0) {
			numNeg += 1;
		}

		if (num2 % 2 == 0.0) {
			numPar += 1;
		} else {
			numImp += 1;
		}
		if (num2 > 0) {
			numPos += 1;
		} else if (num2 < 0) {
			numNeg += 1;
		}

		if (num3 % 2 == 0.0) {
			numPar += 1;
		} else {
			numImp += 1;
		}
		if (num3 > 0) {
			numPos += 1;
		} else if (num3 < 0) {
			numNeg += 1;
		}

		if (num4 % 2 == 0.0) {
			numPar += 1;
		} else {
			numImp += 1;
		}
		if (num4 > 0) {
			numPos += 1;
		} else if (num4 < 0) {
			numNeg += 1;
		}

		if (num5 % 2 == 0.0) {
			numPar += 1;
		} else {
			numImp += 1;
		}
		if (num5 > 0) {
			numPos += 1;
		} else if (num5 < 0) {
			numNeg += 1;
		}
		System.out.println(numPar + " valor(es) par(es)");
		System.out.println(numImp + " valor(es) impar(es)");
		System.out.println(numPos + " valor(es) positivo(s)");
		System.out.println(numNeg + " valor(es) negativo(s)");
		sc.close();
	}

}
