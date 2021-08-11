public class ExemploArray2 {
	public static void main(String[] args) {
		String [][] tabuleiro = {
				{".",".","."},
				{".","X","."},
				{".","O","."},
		};
		System.out.println(tabuleiro[0][0]);	
		System.out.println(tabuleiro[0][1]);
		System.out.println(tabuleiro[2][1]);
		System.out.println(tabuleiro[1][1]);
			
		System.out.println("\nTabuleiro");
		for(int linha=0; linha < tabuleiro.length; linha++) {
			System.out.println(tabuleiro[linha][0]);
			System.out.println(tabuleiro[linha][1]);
			System.out.println(tabuleiro[linha][2]);
		}

		System.out.println("\nTabuleiro");
		for(int linha=0; linha < tabuleiro.length; linha++) {
			for (int coluna=0; coluna < tabuleiro[0].length; coluna++) {
				System.out.println(tabuleiro[linha][coluna]);
			}
		}
		
		System.out.println("\nTabuleiro");
		for(int linha=0; linha < tabuleiro.length; linha++) {
			for (int coluna=0; coluna < tabuleiro[0].length; coluna++) {
				System.out.print(tabuleiro[linha][coluna]);
			}
			System.out.println();
		}
	}
}
