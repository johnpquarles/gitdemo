package ninjagame;
/**
 * Represents a ninja
 * @author John
 *
 */
public class Ninja {

	private int life =100;
	private int katanaSkill =10;
	/**
	 * The ninja slashes with a katana.
	 * @return the amount of damage
	 */
	public int slash(){
		System.out.print("HIEEYAHH!! Attack=" +(int) (katanaSkill*.5));
		return (int) (katanaSkill*.5);
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	
	public int getKatanaSkill(){
		return katanaSkill;
	}
	
	public void setKatanaSkill(int skill){
		katanaSkill = skill;
	}
	
	public void hit(int attack){
		life-=attack;
		System.out.println("OUCH! Life= "+life);
	}
}
