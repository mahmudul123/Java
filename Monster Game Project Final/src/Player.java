
public class Player extends Creature{
	private int healAmount;
	

		   // gets parameters from creature
		   public Player(String name, String description, int hitPoints, int damage, int healAmount) {
		       super(name, description, hitPoints, damage);
		       this.healAmount = healAmount;
		   }
		   //increases player health by healAmount
		   public void heal() {
		       hitPoints=hitPoints+this.healAmount;
		       System.out.println(this.name + " is healed by " + this.healAmount);
		   }

}
