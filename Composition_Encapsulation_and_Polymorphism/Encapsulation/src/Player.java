public class Player {
    public String fullName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health < 1)
        {
            System.out.println("Play knocked out");
            //Reduce # of lives for the player
        }
    }
    public int healthRemaining(){
        return this.health;
    }

}
