package Heranca;
//import java.util.Date;
import java.util.Date;
import java.util.Scanner;
public class Escola {
	public static void main(String[] args) {
		Aluno i = new Aluno("Aldaberto Ferreira", "789.456.123.21",new Date());
			System.out.println("Veja como os atributos foram preenchidos \n\nNome: "+ i.nome);
			System.out.println("CPF: "+ i.cpf);
			i.matricula = "01";
			System.out.println("matricula: "+i.matricula);
			System.out.println("data de nascimento: " + i.data_nascimento.toString());
		Professor a = new Professor("william ferreira", "321.654.987.78",new Date());
			a.disciplina = "Biologia";
			a.salario = 1320;
			System.out.println("Os atributos foram preenchidos assim \n\nNome: "+a.nome);
			System.out.println("CPF: "+a.cpf);
			System.out.println("A sua disciplina: "+a.disciplina);
			System.out.println("O seu salario: "+a.salario+"R$");
			System.out.println("data de nascimento: " + a.data_nascimento.toString());
	}

}
