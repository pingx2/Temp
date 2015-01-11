import java.util.*;
import java.io.FileNotFoundException;

public class Battleship{
    
    Random rand = new Random();
    
    public static void wait(int n){
	try {
	    Thread.sleep(n);                 
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
    }

    public static Board GenerateBoard(){
	Board player = new Board();
	//Scan for row and col
	//placeShip(r,c)
    }

    public static Board GenerateOpp(){
	Board opponent = new Board();
	//randomly placeShip
    }

    public static void first(Board player, Board opponent){
	Random chance = new Random();
	boolean turn = chance.nextBoolean();
	if(turn){
	    wait(1000);
	    System.out.println("Opponent goes first.");
	    boolean move = chance.nextBoolean();
	    if(move){
		opponent.attack(player);
	    } 
	    else{
		opponent.specialAttack(player);
	    }
	    wait(1500);
	    //print boards
	    
	}
	else{
	    wait(1000);
	    System.out.println("Player goes first.");
	}
	
    }    
   
    public static void combat(Board player, Board other){

    }

    public static void isAlive(Board player){
    }



    
