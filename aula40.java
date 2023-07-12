package fundamentos;
import java.util.StringTokenizer;
import java.util.Scanner;
public class aula40 {
public static void main(String[] args) {
	Scanner texto = new Scanner(System.in);
	System.out.print("digite o texto: ");
	StringTokenizer palavras = new StringTokenizer(texto.nextLine());
	System.out.println(palavras.countTokens());
}
}
