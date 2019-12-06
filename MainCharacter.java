import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Color;
public class MainCharacter extends Trainer{
	
	
	public MainCharacter(String name, int gender, String pokemon,int hp) {
		this.name = name;
		this.gender = gender;
		this.pokemon = pokemon;
		this.hp = hp;
	}
	public int getPokemon(String pokemon) {
		if(pokemon == "Squirtle")
		return 1;
		if(pokemon == "Charmander")
		return 2;
		if(pokemon == "Bulbasaur")
		return 3;
		else
		return 0;
		
	}
	
	public int getHp(int hp) {hp = 20; return hp;}
	
	public void printName() {
		System.out.println(name);
	}	
	public void printGender() {
		
	}
}