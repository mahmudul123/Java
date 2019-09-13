
public class Creature {
	public String name;
	public String description;
	public int hitPoints;
	public int damage;
    Room room = null;
	
	public Creature() {
		name = "Room";
		description = "";
		hitPoints = 0;
		damage = 0;
		room = null;	
	}
	
	public Creature(String name, String description, int hitPoints, int damage) {
		this.name = name;
		this.description = description;
		this.hitPoints = hitPoints;
		this.damage = damage;

	}
	public void setHitPoints(int hitPoints){
		this.hitPoints = hitPoints;
	}
	
	public void setDamage(int damage){
		this.damage = damage;
	}
	
	public void setRoom(Room room){
		this.room = room;
	}
	
	
	public String getDescription(){
		return description;
	}
	
	public int getHitPoints(){
		return hitPoints;
	}
	
	public String getName(){
		return name;
	}

	public int getDamage(){
		return damage;
	}
	
	public Room getRoom(){
		return room;
	}
	
//	public interface Creature {


		public void attack(Creature creature) {
			System.out.println(this.name + "attacks " + creature +" dealing " + damage + " damage.");
		}
		
		public void takeDamage(int damage) {
			hitPoints-= damage;
			if(hitPoints < 0) {
				hitPoints = 0;
			}
			System.out.println(getName() + " has lost " + damage + " health");
			System.out.println("");
			System.out.println("");

		   }
		
		
		public boolean isAlive() {
			if(hitPoints > 0) {
			return true;
		}else {
			return false;
		}
		}
		
		
		public String toString() {
			return "name %15s, description %20s, hitPoints %03d, damage %02d";
		

	}
}
