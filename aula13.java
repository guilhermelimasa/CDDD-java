package fundamentos;
import java.util.Scanner;
public class aula13 {
public static void main(String[] args) {
	Scanner numero = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	int numero_um = numero.nextInt();
	System.out.println("digite o segundo número: ");
	int numero_dois = numero.nextInt();
	System.out.println("digite o terceiro número: ");
	int numero_tres = numero.nextInt();
	if (numero_tres > numero_um){
		if (numero_tres>numero_dois) {
			System.out.println(numero_tres);
			System.out.println("é o maior número e o menor número é: ");
			System.out.println(numero_um);
			
		
		}else {
			System.out.println(numero_um);
			System.out.println("é o maior número e o menor é:");
			System.out.println(numero_dois);
		}
		}
		
	if (numero_dois > numero_tres) {
		if(numero_dois > numero_um) {
			System.out.println(numero_dois);
			System.out.println("é o maior número e o menor é: ");
			System.out.println(numero_tres);
		}else {
			System.out.println(numero_um);
			System.out.println("é o maior número e o menor é: ");
			System.out.println(numero_tres);
		}
	}
	
}
}
