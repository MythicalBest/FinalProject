public class Diologe{
	
	public static void startingN() {
		System.out.println("Hello Trainer");
		try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
		System.out.println("My name is Professor Dex");
		try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
		System.out.println("I'll be here to help you on your journey.");
		System.out.println("Now tell me, what is your name");
		try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}	
	}
	
	public static void startingG(String name) {
	System.out.println("Ahh so your name is " + name + ". I like that name");	
	System.out.println("Tell me " + name + ", what is your gender(1 for Male or 2 for Female)"); 
	}
	
	public static void startingCheck(String name, int gender){
		System.out.println("So, your name is " + name + "?");
		try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
		String gen = null;
		if(gender == 1)
			gen = "Male";
		if(gender == 2)
			gen = "Female";
		System.out.println("And your gender is " + gen + "!");
		System.out.println("Nice to meet you!");
	}
	public static void redoN() {System.out.println("Okay then, what is your name?");}
	public static void redoG() {System.out.println("And what is your gender?");}
	public static void wrong(){System.out.println("Hey Buddy, you chose wrong. Try again.");}
	
	public static void pokeStarter(String name){System.out.println("So now it's time for you to pick your pokemon.");
	try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
	System.out.println("We have 3 different type of pokemon for you to chose from.");
	try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
	System.out.println("1. Squirtle - The Tiny Turtle Pokemon. (Water Type)");
	try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
	System.out.println("2. Charmander - The Lizard Pokemon (Fire Type)");
	try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
	System.out.println("3. Bulbasaur - The Seed Pokemon (Grass Type)");
	try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
	System.out.println("Go ahead, its time to pick, " + name);}
	
	public static void gridMoving() {System.out.println("Now you'll have to move thoughout the lands in order to fight wild pokemon.");
	try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
	System.out.println("In order to do so, you'll want to use 1, 2, 3, or 4.");
	try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
	System.out.println("1 will move you up, 2 will move you up, 3 will move you left, and 4 will move you right.");
	try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
	}
	public static void battleStart() {System.out.println("You've encountered a wild pokemon! Now, you have 2 moves. 1 for a plain scrath, or 2 to heal 3 hp");
	try{Thread.sleep(1000);}catch(InterruptedException E){Thread.currentThread().interrupt();}
	}
}