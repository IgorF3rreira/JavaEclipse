package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Program {

	public static void main(String[] args) {
		
		
		
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		
		
		//Classe para formatar a data de acordo com oque foi passado no parse do d04 e deixa em formato iso
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		LocalDate d04 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println("d04 = " + d04);
	}

}
