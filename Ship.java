public class Ship{
    private String shipName;
    private int xPos;
    private int yPos;
    private int noOfHitsMade;
    private int noOfHitsNeeded;
    /**
     * default constructor
     */
    public Ship(){
        shipName = "";
        xPos = 0;
        yPos = 0;
        noOfHitsMade = 0;
        noOfHitsNeeded = 0;
    }
    
    /**
     * non-default constructor
     */
    public Ship(String shipName, int x, int y, int hitNo, int hullNo){
        this.shipName = "shipName";
        xPos = x;
        yPos = y;
        noOfHitsMade = hitNo;
        noOfHitsNeeded = hullNo;
    }
    
    //shipName methods
    public void setShipName(String shipName){
        this.shipName = shipName;
    }
    
    public String getShipName(){
       if(this.shipName.length() < 3 || this.shipName.length() > 15){
           System.out.println("Please enter shipname between 3-15 characters.");  
       }
       return this.shipName;
    }
    
    //xPos methods
    public void setXPos(int x){
        xPos = x;
    }
    
    public int getXPos(){
        return xPos;
    }
    
    //yPos methods
    public void setYPos(int y){
        yPos = y;
    }
    
    public int getYPos(){
        return yPos;
    }
    
    //noOfHitsMade methods
     public void setNoOfHitsMade(int hitNo){
       noOfHitsMade = hitNo;
    }
    
    public int getNoOfHitsMade(){
        return noOfHitsMade;
    }
    
    //noOfHitsNeeded methods
    
    public void setNoOfHitsNeeded (int hullNo){
        noOfHitsNeeded = hullNo;
    }
    
    public int getNoOfHitsNeeded(){ 
        return noOfHitsNeeded;
    }
}
        