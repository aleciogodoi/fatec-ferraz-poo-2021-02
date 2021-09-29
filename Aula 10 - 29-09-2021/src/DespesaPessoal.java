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
	
	@Override
	public String toString() {
		return "DespesaPessoal [cpf=" + cpf + ", despesas=" + despesas + "]";
	}
}
