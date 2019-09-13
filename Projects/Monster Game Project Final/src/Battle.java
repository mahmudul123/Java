import java.util.Scanner;



	public class Battle {



	  

	   private Player player;

	   private Monster monster;

	  

	   Scanner scnr = new Scanner(System.in);

	   private String input;

	   //constructor

	   public Battle (Player player, Monster monster) {

	   this.player = player;

	   this.monster = monster;

	   }

	   // gets players and monsters info

	   public void run() {

		  

		   System.out.println("Battle begins! " + player.getName() + " vs " + monster.getName());

	     

	       while(monster.getHitPoints()>0  && player.getHitPoints()>0) {

//for ( i=1 ;monster.getHitPoints()>0 && player.getHitPoints()>0;i++) {

	

	            System.out.println("");

	            System.err.println("***********  "+player.getName()+ ": " + player.getHitPoints() + " vs " + monster.getName()+ ": " + monster.getHitPoints()+"  ***********");

	            System.out.println(player.getName()+ "'s turn");

	            System.out.println("Do you want to Attack(a) or Heal(h)? ");

	            System.out.println("");

	          

	            //uses keyboard to check what the user inputs

	            input = scnr.next();

	               if((input.equalsIgnoreCase("a") || input.equalsIgnoreCase("Attack")) && monster.getHitPoints()>0) {

	                   monster.takeDamage(player.getDamage());

	               

	                      if(monster.getHitPoints()>0) {

	                    	  System.out.println();

	                   System.out.println(monster.getName() + "'s turn");

	                   System.out.println();

	                

	                   if(monster.canEnrage()) {

	                     monster.enrage();

	                       player.takeDamage(monster.getDamage());

	                       

	                   }

	                   else {

	                       player.takeDamage(monster.getDamage());

	                   }}

	                  

	             

	       }

	            

	               else if ((input.equalsIgnoreCase("h") || input.equalsIgnoreCase("heal")) && monster.getHitPoints()>0 && player.getHitPoints()>0) {

	                   player.heal();

	                   if(monster.canEnrage()) {

		                     monster.enrage();

		                       player.takeDamage(monster.getDamage());

		                   }

		                   else {

		                       player.takeDamage(monster.getDamage());

		                   }

	               }



	             

	               //makes sure the user inputs the right letters

	               else {

	                 

	                   System.out.println("--------");

	                      System.out.println("Invalid input, try again");

	                   System.out.println("--------");

	                

	                   }

	              //checks if monster is alive         

	        

	               if(monster.isAlive() == false) {

	                   

	                  	System.err.println("");

	                      

	                      System.err.println("You have defeated the MONSTER!");

	                      

	                  	System.err.println("");

	                  }

	                  else if (player.isAlive() == false) {

	                      // if the player loses then print game over

	                  	System.err.println("\n*************");

	                  	System.err.println("Game Over!");

	                   System.err.println("*************\n");

	                   System.out.println(""); 

	                  }

	       

	       }

      

	  

	   }

	}

