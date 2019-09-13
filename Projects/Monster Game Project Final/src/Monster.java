
public class Monster extends Creature{
	public boolean isEnraged;
	public int enragedThreshold;
	
	public Monster(String name, String description, int hitPoints, int damage, int enrageThreshold) {
		super(name, description, hitPoints, damage);
		this.enragedThreshold = enrageThreshold;
	       this.isEnraged = false;
	}

	public boolean canEnrage() {
		if(getHitPoints() < this.enragedThreshold && getHitPoints()>0) {
		      
		       return true;
		   }
		  
		       return false;
		     
		   }
	
	public boolean enrage() {
		if(( !isEnraged ) && this.getHitPoints()>0) {
	           setDamage(getDamage() *2);
	           isEnraged = true;
	           System.out.println("The " + getName() + " has enraged ");
	       }
			return false;
	  
	   }
	  

}