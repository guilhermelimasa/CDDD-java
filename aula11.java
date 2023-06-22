package fundamentos;
import java.util.Scanner;
public class aula11 {
public static void main(String[] args) {
	Scanner numero = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	int numero_digitado = numero.nextInt();
	if (numero_digitado >= 0) {
		System.out.println("número positivo");
	}else {
		System.out.println("número negativo");
	}
			
}
}
