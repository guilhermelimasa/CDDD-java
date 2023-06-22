package fundamentos;
import java.util.Scanner;
public class aula15 {
public static void main(String[] args) {
	Scanner numero = new Scanner(System.in);
	System.out.println("Digite um numero: ");
	float numero_um = numero.nextInt();
	System.out.println("digite o segundo número: ");
	float numero_dois = numero.nextInt();
	float media = (numero_um + numero_dois) / 2;
	System.out.println("a media do aluno eh: ");
	System.out.println(media);
}
}
