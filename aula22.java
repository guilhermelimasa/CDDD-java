package fundamentos;
import java.util.Scanner;
public class aula22 {
public static void main(String[] args) {
	Scanner numero = new Scanner(System.in);
	System.out.println("digite um número: ");
	int numeros = numero.nextInt();
	int cont = 0;
	while (cont<numeros) {
		cont = cont + 1;
		if (cont % 2 == 0) {
			System.out.println("numero par: "+cont);
		}
		System.out.println(" ");
		if (cont % 2 != 0) {
			System.out.println("numero impar: "+cont);
		}
			
	}
}
}
