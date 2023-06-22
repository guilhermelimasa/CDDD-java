package fundamentos;
import java.util.Scanner;
public class aula17 {
public static void main(String[] args) {
	int pistas = 0;
	Scanner input= new Scanner(System.in);
	System.out.println("tefenou para a vítima? ");
	char pista = input.next().charAt(0);
	if (pista == 's') {
		pistas = pistas+1;
	}
	System.out.println("vc esteve no local no crime? ");
	char pista_dois = input.next().charAt(0);
	if (pista_dois == 's') {
		pistas = pistas+1;
	}
	System.out.println("mora perto da vítima? ");
	char pista_tres = input.next().charAt(0);
	if (pista_dois == 's') {
		pistas = pistas+1;
	}
	System.out.println("devia para a vítima? ");
	char pista_quatro = input.next().charAt(0);
	if (pista_tres=='s') {
		pistas = pistas+1;
	}
	System.out.println("já trabalhou coma vitima? ");
	char pista_cinco = input.next().charAt(0);
	if(pista_quatro == 's') {
		pistas = pistas+1;		
	}
		if(pistas == 2) {
			System.out.println("vc eh suspeito");
		}else if (pistas >= 3 && pistas <= 4) {
			System.out.println("vc é cumplice");
		}else if (pistas == 5) {
			System.out.println("vc eh assassino");
		}else {
			System.out.println("vc eh inocente");
	}
	

}
}
