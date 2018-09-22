public class EnchancedPlayer {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public EnchancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100)
            this.hitPoints = health;
        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        this.hitPoints -= damage;
        if(this.hitPoints < 1)
        {
            System.out.println("Play knocked out");
            //Reduce # of lives for the player
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
