
public class ExemploWhile {
	public static void main(String[] args) {
		int i=1;
		while (i < 11) {
			if (i % 2 == 0) {
				System.out.printf("i � par =%d\n", i);
			} else {
				System.out.printf("i � �mpar =%d\n", i);
			}
			i++;
		}
	}
}
