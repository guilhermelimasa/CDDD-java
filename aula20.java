package fundamentos;
import java.util.Scanner;
public class aula20 {
public static void main(String[] args) {
	Scanner numero = new Scanner(System.in);
	System.out.println("quantos alunos tem na sala? ");
	int numero_de_alunos = numero.nextInt();
	int cont = 0;
	float soma = 0;
	while (numero_de_alunos != cont) {
		Scanner n = new Scanner(System.in);
		System.out.println("Digite sua nota: ");
		int nota = numero.nextInt();
		soma = soma + nota;
		cont = cont + 1;
	}		
		
	float media = (soma/numero_de_alunos);
	System.out.println(media);

}
}