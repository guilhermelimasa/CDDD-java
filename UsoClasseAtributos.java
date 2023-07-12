package javapoo;

public class UsoClasseAtributos {
	public static void main(String[] args) {
		AtributosClasse cliente01 = new AtributosClasse();
		System.out.println(cliente01.fnome);
		System.out.println(cliente01.lnome);
		System.out.println(cliente01.idade);
		System.out.printf("O aluno %s %s tem %d anos", cliente01.fnome,cliente01.lnome,cliente01.idade);
	}
	int idade() {
		return 25;
		
}
	double valor() {
		return 25.50;
}

String nome(){
	return"Wellington";
	
}
boolean estado() {
	return true;
}
}