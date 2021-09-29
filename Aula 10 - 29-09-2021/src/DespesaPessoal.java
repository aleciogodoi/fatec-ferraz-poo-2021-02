import java.time.LocalDate;
import java.util.ArrayList;

public class DespesaPessoal {
	private String cpf;
	private ArrayList<Despesa> despesas;
	
	DespesaPessoal(String cpf) {
		this.cpf = cpf;
		despesas = new ArrayList<Despesa>();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Despesa> getDespesas() {
		return despesas;
	}

	public void setDespesas(ArrayList<Despesa> despesas) {
		this.despesas = despesas;
	}

	public double getTotal() {
		double total=0;
		for (Despesa despesa: this.getDespesas()) {
			total += despesa.getValor();
		}
		return total;
	}
	
	public double getTotal(int mes, int ano) {
		double total=0;
		for (Despesa despesa: this.getDespesas()) {
			if (despesa.getData().getMonthValue() == mes && despesa.getData().getYear() == ano)
				total += despesa.getValor();
		}
		return total;
	}
	
	public double getTotal(LocalDate data) {
		double total=0;
		for (Despesa despesa: this.getDespesas()) {
			if (despesa.getData().equals(data))
				total += despesa.getValor();
		}
		return total;		
	}

	public void imprime() {
	    System.out.println("\n-----------------------------------------------------");
	    System.out.println("Despesas (Total) - CPF: "+this.getCpf());
	    System.out.println("-----------------------------------------------------");
	    for (Despesa despesa: this.getDespesas()) {
	        System.out.println(despesa.getData()+" "+despesa.getDescDespesa()+ " "+ despesa.getValor());
	    }
	    System.out.println("-----------------------------------------------------");
	    System.out.println("Total: "+this.getTotal());
	}
	
	public void imprime(int mes, int ano) {
	    System.out.println("\n-----------------------------------------------------");
	    System.out.println("Despesas ("+mes+"/"+ano+") - CPF: "+this.getCpf());
	    System.out.println("-----------------------------------------------------");
	    for (Despesa despesa: this.getDespesas()) {
	    	if (despesa.getData().getMonthValue() == mes && despesa.getData().getYear() == ano) 
	    		System.out.println(despesa.getData()+" "+despesa.getDescDespesa()+ " "+ despesa.getValor());
	    }
	    System.out.println("-----------------------------------------------------");
	    System.out.println("Total: "+this.getTotal(mes, ano));
	}
	
	@Override
	public String toString() {
		return "DespesaPessoal [cpf=" + cpf + ", despesas=" + despesas + "]";
	}
}
