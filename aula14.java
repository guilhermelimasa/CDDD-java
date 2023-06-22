package fundamentos;
import java.util.Scanner;
public class aula14 {
public static void main(String[] args) {
	Scanner numero = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	int numero_um = numero.nextInt();
	if (numero_um == 1) {
		System.out.println("DOMINGO");
	}if (numero_um == 2) {
		System.out.println("SEGUNDA-FEIRA");
	}if (numero_um == 3) {
		System.out.println("TERÇA-FEIRA");
	}if (numero_um == 4) {
		System.out.println("QUARTA-FEIRA");
	}if (numero_um == 5) {
		System.out.println("QUINTA-FEIRA");
	}if (numero_um == 6) {
		System.out.println("SEXTA-FEIRA");
	}if (numero_um == 7) {
		System.out.println("SÁBADO");
	}if (numero_um > 7 || numero_um < 0) {
		System.out.println("NÚMERO INVÁLIDO");
	}
}
}
