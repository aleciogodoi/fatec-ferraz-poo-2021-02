public class Main {
	public static void main(String[] args) {
		Data d01 = new Data();
		Data d02 = new Data(8, 9, 2021);
		System.out.println(d01);
		System.out.println(d02);
		
		Pessoa p01 = new Pessoa("Pedro", "2109876-09", new Data (23,10,1987));
		System.out.println(p01);
		
		Professor prof01 = new Professor("Ana","3100987-09",new Data(20, 07, 1990),"1010-10");
		System.out.println(prof01);
	}
}
