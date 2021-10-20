
public class Main {

	public static void main(String[] args) {
		//RoboAbstrato robo01 = new RoboAbstrato();
		RoboSimples robo01 = new RoboSimples("Robobo",0,0,(short)180);
		System.out.println(robo01);
		robo01.move(100);
		System.out.println(robo01);
		robo01.move(100);
		System.out.println(robo01);
		robo01.mudaDirecao((short)0);
		System.out.println(robo01);
		robo01.move(100);
		System.out.println(robo01);
		robo01.move(100);
		System.out.println(robo01);

		robo01.mudaDirecao((short)90);
		System.out.println(robo01);
		robo01.move(100);
		System.out.println(robo01);
		robo01.move(100);
		System.out.println(robo01);	
	}
}
