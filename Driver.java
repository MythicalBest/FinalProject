/*
 * Camden Calandirno
 * Due 12/6/2019
 * Pokemon inspired dungeon crawler
 * 
 * */

import java.security.SecureRandom;
import java.util.Scanner;

import javax.swing.JFrame; 
public class Driver{
	

public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	String name = null;
	String gen = null;
	int hp = 0;
	int gender = 0;
	int choice = 0;
	int redo = 0;
	int redo1 = 0;
	int redo2 = 0;
	int redo3 = 0;
	int redo4 = 0;
	int redo5 = 0;
	int redo6 = 0;
	int redo7 = 0;
	int redo8 = 0;
	int redo9 = 0;
	int redo10 = 0;
	int redo11 = 0;
	int redo12 = 0;
	int redo13 = 0;
	int redo14 = 0;
	int redo15 = 0;
	
	String x = null;
	int posx = 0;
	int score = 0;
	int posy = 0;
	String pokemon = null;
	Diologe.startingN();
	name = sc.next();
	Diologe.startingG(name);
	gender = sc.nextInt();
	while(gender < 1 || gender > 2) {
		Diologe.wrong();
		gender = sc.nextInt();
	}
	
	Diologe.startingCheck(name, gender);
	x = "yes";
	// Starts a while loop that begins 
	if(x.toLowerCase().equals("yes")) {
	
	Diologe.pokeStarter(name);
	choice = sc.nextInt();
	while(choice < 1 && choice > 3){
	Diologe.wrong();
	if(choice == 1) {pokemon = "Squirtle";break;}
	if(choice == 2) {pokemon = "Charmander";break;}
	if(choice == 3) {pokemon = "Bulbasaur";break;}}
	
	if(choice == 1) {pokemon = "Squirtle";
	System.out.println("I see, you choose Squirtle! Good Choice");}
	if(choice == 2) {pokemon = "Charmander";
	System.out.println("I see, you choose Charmander! Good Choice");}
	if(choice == 3) {pokemon = "Bulbasaur";
	System.out.println("I see, you choose Bulbasaur! Good Choice");}
	
	
	
	MainCharacter m = new MainCharacter(name,gender,pokemon,hp);
	//MapGen map = new MapGen(posx,posy);
	String ch = null;
	new MapGen(posy,posx);
	int point = 0;
	System.out.println("Your goal is to get to the bottom middle of the map. W A S D to move around from the command line");
	while(posx < 10) {
	
	ch = sc.next();
		if(ch.toLowerCase().equals("w")) {
		posx = posx - 1;
		if(posx == -1){posx = 0;System.out.println("I'm sorry! You can't go that way anymore!");}
		new MapGen(posx,posy);
		}
		if(ch.toLowerCase().equals("s")) {
		posx = posx + 1; 
		if(posx == 10) {posx = 9;System.out.println("I'm sorry! You can't go that way anymore!");}
		
		new MapGen(posx,posy);
		}
		if(ch.toLowerCase().equals("a"))
		{
		posy = posy - 1;
		if(posy == -1) {posy = 0;System.out.println("I'm sorry! You can't go that way anymore!");}
		new MapGen(posy,posx);
		}
		if(ch.toLowerCase().equals("d")) {
		posy = posy + 1;
		if(posy == 7) {posy = 6;System.out.println("I'm sorry! You can't go that way anymore!");}
		new MapGen(posx,posy);
		}
		
		//Determins if they can fight the pokemon or not
		if(posx == 2 && posy == 2) {if(redo  == 0) {redo = PokemonBattle(m,pokemon,hp);} if(redo == 1) {System.out.println("You already got this pokemon"); point += 1;}}
		if(posx == 4 && posy == 2) {if(redo1 == 0) {redo1 = PokemonBattle(m,pokemon,hp);}if(redo1 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 3 && posy == 2) {if(redo2 == 0) {redo2 = PokemonBattle(m,pokemon,hp);}if(redo2 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 1 && posy == 1) {if(redo3 == 0) {redo3 = PokemonBattle(m,pokemon,hp);}if(redo3 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 6 && posy == 3) {if(redo4 == 0) {redo4 = PokemonBattle(m,pokemon,hp);}if(redo4 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 6 && posy == 4) {if(redo5 == 0) {redo5 = PokemonBattle(m,pokemon,hp);}if(redo5 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 9 && posy == 4) {if(redo6 == 0) {redo6 = PokemonBattle(m,pokemon,hp);}if(redo6 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 5 && posy == 3) {if(redo7 == 0) {redo7 = PokemonBattle(m,pokemon,hp);}if(redo7 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 4 && posy == 4) {if(redo8 == 0) {redo8 = PokemonBattle(m,pokemon,hp);}if(redo8 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 5 && posy == 5) {if(redo9 == 0) {redo9 = PokemonBattle(m,pokemon,hp);}if(redo9 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 6 && posy == 6) {if(redo10 == 0) {redo10 = PokemonBattle(m,pokemon,hp);}if(redo10 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 5 && posy == 5) {if(redo11 == 0) {redo11 = PokemonBattle(m,pokemon,hp);}if(redo11 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 6 && posy == 4) {if(redo12 == 0) {redo12 = PokemonBattle(m,pokemon,hp);}if(redo12 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 7 && posy == 3) {if(redo13 == 0) {redo13 = PokemonBattle(m,pokemon,hp);}if(redo13 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 8 && posy == 2) {if(redo14 == 0) {redo14 = PokemonBattle(m,pokemon,hp);}if(redo14 == 1) {System.out.println("You already got this pokemon");point += 1;}}
		if(posx == 9 && posy == 1) {if(redo15 == 0) {redo15 = PokemonBattle(m,pokemon,hp);}if(redo15 == 1) {System.out.println("You already got this pokemon");point += 1;}}
			
		//Wining
		if(posx == 9 && posy == 3) {System.out.println("You finished the game! Congrats! You did it. You score was " + point); 
		System.out.println("Terminate the program to get ride of the window");
		break;}
		
	}
	}
	
}

public static int PokemonBattle(MainCharacter m, String pokemon,int hp) {
	int type = 0;
	int choice = 0;
	Scanner sc = new Scanner(System.in);
	int x = m.getPokemon(pokemon);
	Poke p1 = new Poke(type,hp);
	int y = p1.getType();
	int mainHp = m.getHp(hp);
	int pokeHp = p1.getHp(hp);
	int pokeChoice = 0;
	SecureRandom rand = new SecureRandom();
	Diologe.battleStart();
	
	while(mainHp > 0 && pokeHp > 0) {
		System.out.println("Your pokemons HP is at " + mainHp);
		try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
		System.out.println("The wild pokemon is at " + pokeHp);
		try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
		System.out.println("How do you want to attack?");
		try {
		    choice = sc.nextInt();
			while(choice != 1 && choice != 2 ) {
			System.out.println("Pick 1 or 2!");
			choice = sc.nextInt(); 
			
			}
		}catch(java.util.InputMismatchException E) {System.out.println("1 or 2 only please. You're defaulting to only attacking now.");
		choice = 1;
		}
		if(choice == 1) {
			System.out.println("You dealt 5 damage");
			pokeHp -= 5;
			try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
		}
		if(choice == 2) {
			System.out.println("You healed by 1");
			mainHp += 1;
			try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
		}
		choice = 0;
		System.out.println("It's the pokemon's time to fight");
		try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
		pokeChoice = rand.nextInt(3) + 1;
		if(pokeChoice == 1)
		{
			System.out.println("The pokemon attacks! He deals 2 damage");
			mainHp -= 1;
			try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
		}
		if(pokeChoice == 2) {System.out.println("The Pokemon heals itself by 1!");
			pokeHp += 1;
			try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
		}
		else {System.out.println("The pokemon does 2 damage");
		mainHp -= 1;
		try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}}
	}


return 1;}
}