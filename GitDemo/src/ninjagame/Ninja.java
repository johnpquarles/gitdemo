package ninjagame;

public class Ninja {

	private int life;
	private int katanaSkill;
	/**
	 * The ninja slashes with a katana.
	 * @return the amount of damage
	 */
	public int slash(){
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
	}
}
