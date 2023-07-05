package fundamentos;
import java.util.Scanner;
public class aula32 {
public static void main(String[] args) {
	double[] nota = new double [5];
	double soma = 0;
	double media = 0;
	for (int x = 0; x < nota.length; x++) {
		Scanner sr= new Scanner(System.in);
		System.out.print("digite a nota: ");
		nota[x] = sr.nextDouble();
		
	}for (double i : nota)
		media= media+i;
	media = media/5;
	System.out.println(media);
		
		
	
}
}
