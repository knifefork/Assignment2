import java.util.*;
public class ShipList{
   private ArrayList<Ship>ships;
   
   public ShipList(){
       ships = new ArrayList<Ship>();
   }
   
   public ShipList(Ship ship){
        ships = new ArrayList<Ship>();
        setShips(ships);
   }
   
   public void addship(Ship ship){
       ships.add(ship);
   }
   //getship
   public void setShips(ArrayList<Ship> ships){
       this.ships = ships;
   }
}