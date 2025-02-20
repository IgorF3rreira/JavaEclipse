package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.worker;
import entities.enums.WorkerLevel;



public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Entre com o nome do departamento: ");
		String departamentoNome = sc.nextLine();
		System.out.println("Entre com seus dados");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("nivel: ");
		String workerLevel = sc.nextLine();
		System.out.println("salario Base: ");
		double salarioBase = sc.nextDouble();
		worker Worker = new worker(nome, WorkerLevel.valueOf(workerLevel), salarioBase, new Departament(departamentoNome));
		
		
		System.out.println("Quantos contratos");
		int n = sc.nextInt();
		
		for(int i=1; i <=n; i++) {
			System.out.println("Entre com uma data");
			System.out.print("data: (DD/MM/YYYY): ");
			Date contratoData = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			Double valorHora = sc.nextDouble();
			System.out.print("duração");
			int horas = sc.nextInt();
			
			HourContract contrato = new HourContract(contratoData, valorHora, horas);
			Worker.addContract(contrato);
		}
		
		System.out.println();
		System.out.print("entre com mês e ano para calcular o salario: (MM/YYYY) ");
		//vamos transformar o string da data em um inteiro
		
		String mesEano = sc.next();
		
		//o substring serve para cortar o string a partir de um ponto de inicio ate um ponto final
		//aqui nos argumentos coloquei o ponto de inicio do zero "M" até o 2 "/"
		int mes = Integer.parseInt(mesEano.substring(0, 2));
		
		//aqui fiz do 3 "Y" até onde vai string
		int ano = Integer.parseInt(mesEano.substring(3));
		 
		//imprimir os dados
		System.out.println("nome: " + Worker.getName());
		System.out.println("Departamento: " + Worker.getDepartment().getName());
		System.out.println("ganhou em  " + mesEano + ": " + String.format("%.2f", Worker.income(ano, mes)));
		
		
		sc.close();
	}

}
