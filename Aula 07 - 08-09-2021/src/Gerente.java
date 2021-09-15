public class Gerente extends Funcionario{
    // Atributos
    private String departamento;
    private Data incioGerencia;
    
    Gerente(String nome, String identidade, Data dtNascimento,
					   Data dtAdmissao, float salario,
					   String departamento, Data inicioGerencia){
		super(nome, identidade, dtNascimento, dtAdmissao, salario);
        this.departamento = departamento;
        this.incioGerencia = inicioGerencia;
    }
    
    @Override
    public String toString(){
        return "Gerente [departamento="+departamento +", incioGerencia="+ incioGerencia+ " - "+super.toString()+"]";
    }
    
}