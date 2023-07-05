package fundamentos;
import java.util.Scanner;
public class aula31 {
public static void main(String[] args) {
	int[] a = new int [10];
	int[] b = new int [11];
	int[] c = new int [10];
	int[] d = new int [10];
	
	for(int i = 0; i<a.length; i++) {
		Scanner input= new Scanner(System.in);
		System.out.println("digite um numero para a lista A: ");
		a[i] = input.nextInt();
		
	}
	for(int z = 0; z<b.length; z++) {
		Scanner input= new Scanner(System.in);
		System.out.println("digite um numero para a lista B: ");
		b[z] = input.nextInt();
		
	}
	
	for(int h = 0; h<a.length; h++) {
		Scanner input= new Scanner(System.in);
		System.out.println("digite um numero para a lista C: ");
		c[h] = input.nextInt();
		
	}
	for(int h = 0; h<d.length; h++) {
		Scanner input= new Scanner(System.in);
		System.out.println("digite um numero para a lista D: ");
		d[h] = input.nextInt();
		
	}for (int k = 0; k < a.length; k++) {
		System.out.print("Lista A:");
		System.out.print(a[k]+" ");
	}for (int h = 0; h < b.length;h++) {
		System.out.print("Lista B:");
		System.out.print(b[h]+ " ");
	}for (int p = 0; p < a.length;p++) {
		System.out.print("Lista C:");
		System.out.print(c[p]+" ");
	}for (int f = 0; f < d.length; f++) {
		System.out.print("Lista D:");
		System.out.print(d[f]+" ");
	}

}
}
