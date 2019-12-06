public class Trainer{
public String name;
int gender;
String pokemon;
int hp;
public void setTrainer(String name, int gender, String pokemon) {
	this.name = name;
	this.gender = gender;
	this.pokemon = pokemon;
}

public void print() {
	System.out.println("Your name is " + name);
	System.out.println("The pokemon you choose was " + pokemon);
	
}

	

}