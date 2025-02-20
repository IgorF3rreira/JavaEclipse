package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class worker {
 public static Object a;
private String name;
 private WorkerLevel level;
 private Double baseSalary;
 
 
 //CHAMAR AS ASSOCIAÇÕES QUE O WORKER POSSUI
 private Departament department;
 
 //JA INSTANCIAR O ARRAY
 private List<HourContract> contracts = new ArrayList<>();
 
 
 public worker() {
	 
 }


public worker(String name, WorkerLevel level, Double baseSalary, Departament department) {
	this.name = name;
	this.level = level;
	this.baseSalary = baseSalary;
	this.department = department;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public WorkerLevel getLevel() {
	return level;
}


public void setLevel(WorkerLevel level) {
	this.level = level;
}


public Double getBaseSalary() {
	return baseSalary;
}


public void setBaseSalary(Double baseSalary) {
	this.baseSalary = baseSalary;
}


public Departament getDepartment() {
	return department;
}


public void setDepartment(Departament department) {
	this.department = department;
}


public List<HourContract> getContracts() {
	return contracts;
}



 

//metodo para add um contrato para tal trabalhador
public void addContract(HourContract contract) {
	contracts.add(contract);
	
}

public void removeContract(HourContract contract) {
	contracts.remove(contract);       
}


public double income(int year, int month) {
	Double sum = baseSalary;
	
	//
	Calendar cal = Calendar.getInstance();
	
	for(HourContract c : contracts) {
		//PARA CADA CONTRATO C VAMOS SETAR ELE NO CALENDAR
		cal.setTime(c.getDate());
		//VARIAVEIS PARA EXTRAIR O MES E O ANO DO "C" QUE ESTAS NO FOREACH
		int c_year = cal.get(Calendar.YEAR );
		//LEMBRAR QUE O MÊS SEMPRE COMEÇA DO ZERO
		int c_month = 1 + cal.get(Calendar.MONTH);
		if(year == c_year && month == c_month) {
		sum += c.totalValue();
	}
		
	}
	
	return sum;
}


}
