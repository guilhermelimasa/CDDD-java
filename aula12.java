package fundamentos;
import java.util.Scanner;
public class aula12 {
public static void main(String[] args) {
	Scanner numero = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	int numero_digitado = numero.nextInt();
	System.out.println(numero_digitado >= 0 ? "número positivo" : "número negativo");
}
}
