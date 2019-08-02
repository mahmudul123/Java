
import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.io.PrintWriter;

	
	public class Game {

	   private static boolean active = true;
	   public static Player player;
	   public static Battle fight1;
	   public static Battle fight2;
	   public static Battle fight3;
	   public static Room[] dungeon;
	   private static Monster monster1;
	   private static Monster monster2;
	   private static Monster monster3;
	   private static Room room1;
	   private static Room room2;
	   private static TreasureRoom treasureRoom;

	  
	  
	   //checks if file exists
	   public Game() {
	      
	     
	File playerInfo = new File("PlayerInfo.txt");
	      
	       if(playerInfo.exists()) {
	          
	           System.out.println("File exists");
	       } else {
	           System.out.println("File doesn't exist");
	       }
	      
	       playerInfo.canRead();
	      
	      
	       try {
	           BufferedReader br = new BufferedReader( new FileReader(playerInfo));
	          
	           //String line;
	           try {

	              //reads each line and assigns each line from the text file to player instance variables
	               String name = br.readLine();
	               String description = br.readLine();
	               int hitPoints = Integer.parseInt(br.readLine());
	               int damage = Integer.parseInt(br.readLine());
	               int healAmount = Integer.parseInt(br.readLine());
	               //System.out.println(description);
	              
	               player = new Player(name,description,hitPoints,damage,healAmount);
	              
	              
	              
	           } catch (IOException e) {
	               e.printStackTrace();
	           }
	          
	       } catch (FileNotFoundException e) {
	           e.printStackTrace();
	       }
	       //player = new Player("Jackie", "Afraid", 100, 15, 25);
	       monster1 = new Monster("Orc","covered with green blood", 20,5,0);
	       fight1 = new Battle(player, monster1);
	       room1 = new Room(1,"a room with an unbearable smell",monster1);
	       monster2 = new Monster("Skeleton","funny how it moves", 40,10,10);
	       fight2 = new Battle(player, monster2);
	       room2 = new Room(2,"dark and cold",monster2);
	       monster3 = new Monster("Fire dragon","spout fire with each breath", 100,20,40);
	       fight3 = new Battle(player, monster3);
	       treasureRoom = new TreasureRoom(3,"a giant hall with something shiny on the other end",monster3,"A LARGE pile of gold!");
	       
	          
	       dungeon = new Room[] {room1,room2,treasureRoom};
	   }
	  
	   public void play() {
	      
	       while(active) {
	           if(monster1.isAlive()) {
	       room1.enter(player);
	       fight1.run();
	     
	      
	           }
	           if(monster2.isAlive()) {
	       room2.enter(player);
	       fight2.run();
	  
	           }
	           if(monster3.isAlive()) {
	       treasureRoom.enter(player);
	       fight3.run();
	    

	           }
	      
	       if(!(monster1.isAlive() && monster2.isAlive() && monster3.isAlive()) || !player.isAlive() ) {
	           this.active = false;
	       }
	       }
	       System.out.println("");
	       System.out.println("");
	       treasureRoom.enter(player);
	       ////call something here
	       
	       
	       System.out.println("THE END");
	   }
//	   public void writeToNewFile(String fileName, String fileContent){
//	       PrintWriter outStream =null;//use the PrintWriter to create our output stream
//	       try {
//	           outStream = new PrintWriter(fileName);//create & connect the output stream to the file using the String fileName
//	           outStream.println(fileContent);//write the String to the file
//	           System.out.println("Successfully wrote to the file "+fileName);      
//	       } catch (FileNotFoundException e) {
//	           e.printStackTrace();
//
//	           System.out.println("Inside writeToNewFile method problem creating/write the file "+fileName);
//	       }
//	       finally{
//	           if(outStream != null){//if not closed
//	               outStream.close(); //close it
//	           }
//	           System.out.println("All done with writeToNewFile method");
//	       }
//	   }
	  
	   public static void main(String[] args) {
		  
		   
	       Game game = new Game();
	      
	      
	       game.play();
	       
	   }
	
	}
