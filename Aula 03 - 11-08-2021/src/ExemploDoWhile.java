
public class ExemploDoWhile {
	public static void main(String[] args) {
		int i=1;
		do {
			if (i % 2 == 0) {
				System.out.printf("i � par =%d\n", i);
			} else {
				System.out.printf("i � �mpar =%d\n", i);
			}
			i++;
		} while (i < 11) ;
	}
}
