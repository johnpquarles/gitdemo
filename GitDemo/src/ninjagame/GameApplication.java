package ninjagame;

public class GameApplication {

	public static void main(String[] args) {
		Ninja ryu = new Ninja();
		ryu.setKatanaSkill(10);
		ryu.setLife(100);
		
		System.out.println("****Ryu Slash****\n" + ryu.slash());
		
		Ninja fodder = new Ninja();
		Ninja fodder2 = new Ninja();

	}

}
