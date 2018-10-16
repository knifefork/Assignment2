import java.util.*;
import java.util.Scanner;
public class Game{
    private ShipList playerShips;
    private ShipList computerShips;
    
    
    public Game(){ //?
        ArrayList<ShipList> playerShips = new ArrayList<>();
        ArrayList<ShipList> computerShips = new ArrayList<>();
    }
  
    public void displayMenu(){
        System.out.println("+====================================================================+");
        System.out.println("|                                                                    |");
        System.out.println("|            Eelcome to the Battleship Game - - With a Twist         |");
        System.out.println("|                                                                    |");
        System.out.println("+====================================================================+");
        System.out.println("The game will use the grid size defined in the settings file.\n" + 
        "Playing grid size set as (15 x 15)\n" + "Maximum number of ships allowed as 3\n"
         + "Mutiple his allowed per ships set as true\n" + "Computer ship Visible: ON\n"
          + "Press any key to continue...");
        
    }
    

    public static void createGrid(String[] grid, int cols, int rows){
                for(int i = 0; i < rows; i++){
                   for(int j = 0; j < cols; j++){
                        grid = (i-1)+(j-1)*14;
                
            }
        }
    }
    
     public void guessShipLocation(String playerGuess){
        int guess = Integer.parseInt(playerGuess);
        String result = "PLAYER MISSSSS!!!!";
        
        CoordinateGenerator rand = new CoordinateGenerator(0,0);
        Ship ship = new Ship();
        int noOfHitsMade;
        if(guess == rand.getRandom(1,5)){
            result = "PLAYER HITTTTT!!!!";
            noOfHitsMade = ship.getNoOfHitsMade()+ 1;
        }
        
        if(ship.getNoOfHitsMade() == ship.getNoOfHitsNeeded()){
            result = "Unfortunately, Comp Ship " + ship.getShipName() + " has been destoryed!";
        }
        System.out.println(result);

    }
    
        public static void Main(String[] args){
            String [] grid = new String();
            grid = new cols * rows;
            
    }
    
}
    
