public class Main {

    public static void main(String[] args) {

	  /*  Player player = new Player();
	    player.name = "Tim";
	    player.health = 20;
	    player.weapon = "Sword";

	    int damage = 10;
	    player.loseHealth(damage);
	    System.out.println("Health: " + player.healthRemaining());

	    damage = 11;
	    player.health = 200;
		player.loseHealth(damage);
		System.out.println("Health: " + player.healthRemaining());

		Problems: User can change health to circumvent 'game' mechanics.
				  User can forget to intialize every field with a value.
				  Certain changes in the class's means updates have to happen in others.

	*/
	  EnchancedPlayer player2 = new EnchancedPlayer("Chris", 200, "Sword");
	  EnchancedPlayer player = new EnchancedPlayer("Tim", 50, "Sword");
	  System.out.println("Initial health: " + player.getHitPoints());
	  System.out.println("Initial health: " + player2.getHitPoints()); // Notice how health gets printed as 100 instead of 200.





	}
}
