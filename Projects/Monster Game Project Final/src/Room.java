
public class Room {
	public int roomIndex;
	public String description;
	Monster monster;
	
	
	public Room(int roomIndex, String description, Monster monster) {
		this.roomIndex = roomIndex;
		this.description = description;
		this.monster = monster;
		
	}
	
	public boolean isComplete() {
	if (monster.isAlive() == false) {
	       return true;
	       }
	       return false;
	       }
	
	public void enter(Player player) {
	       if (monster.isAlive() == true) {
	       System.out.println(player.getName()+", "+player.getDescription() + ". This room is: " + this.description + ". \nInside there is an " + monster.getName()+", "+monster.getDescription()+". \n");
	       }
	   }
	
	public int getRoomIndex() {
	       return this.roomIndex;
	   }
	   public String getDescription() {
	       return this.description;
	   }
	   public Monster getMonster() {
	       return this.monster;
	   }
	  
	   // setters
	   public void setRoomIndex(int roomIndex) {
	       this.roomIndex = roomIndex;
	   }
	   public void setDescription(String description) {
	       this.description = description;
	   }
	   public void setMonster(Monster monster) {
	       this.monster = monster;
	   }
	  
	   
	   public String toString() {
	       return "Room index %2d, description %20s, monster name %20s";
	   }
//public int battleCount() {
//	int i=roomIndex; 
//	
//	return i;
//}

}
