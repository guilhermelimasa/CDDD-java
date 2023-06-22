package fundamentos;
import java.util.Scanner;
public class aula16 {
public static void main(String[] args) {
	Scanner letra = new Scanner(System.in);
	System.out.println("Digite F ou M: ");
	char palavra = letra.next().charAt(0);
	if (palavra == 'F') {
		System.out.println("Feminino");
	}else if (palavra == 'M') {
		System.out.println("Masculino");
	}else {
		System.out.println("palavra inválida");
	}
}
}
