import java.util.Scanner;


public class fichapersonal {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("nombre:");
		Scanner ScannerA = new Scanner (System.in);
		String nombre1=ScannerA.next();

		System.out.println("edad:");
		Scanner ScannerB = new Scanner (System.in);
		int edad1=ScannerB.nextInt();

		System.out.println("sexo:");
		Scanner ScannerC = new Scanner (System.in);
		char sexo1=ScannerC.next().charAt(0);

		System.out.println("casado:");
		Scanner ScannerD = new Scanner (System.in);
		boolean casado1=ScannerD.nextBoolean();
		
		System.out.println("Ficha personal");
		System.out.println("nombre:"+nombre1);
		System.out.println("Edad:"+ edad1);
		System.out.println("Sexo:"+sexo1);
		System.out.println("casado:"+casado1);


		}

		}
