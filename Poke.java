import java.security.SecureRandom;
public class Poke{
	int type;
	int hp;
	public Poke(int type,int hp) {
		SecureRandom sc = new SecureRandom();
		//1 - Water
		//2 - Fire
		//3 - Grass
		int x = 0;
		x = sc.nextInt(4) + 1;
		if(x == 1)
			this.type = 1;
		if(x == 2)
			this.type = 2;
		else
			this.type = 3;
		
		
	}
	public int getHp(int hp) {
		SecureRandom sc = new SecureRandom();
		int x = sc.nextInt(2) + 1;
		if (x == 1) {return 10;}
		else 
			return 20;
	}
	public void showHp() {System.out.println(hp);}
	
	public int getType() {return type;}
	public void printType() {System.out.println(type);}

}