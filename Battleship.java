import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Battleship{
    
    private char[][] Board1; 
    private char[][] Board2;
    private char rows, cols;
    Random rand = new Random();
    String ships = "SS,SSS,SSS,SSS,SSSS,SSSS";
    
    public Battleship(){
	Board1 = new char[15][15];
	Board2 = new char[15][15];
	this.rows = 15;
	this.cols = 15;	
	clear(Board1);
	clear(Board2);
  
    }

    private void clear(char[][] b){
	for(int h = 0; h < b.length; h++){
	    for(int w = 0; w < b[h].length; w++){
		b[h][w]='_';
	    }
	}
    }

    public String toString(char[][] b){
	String result = "";
	for(int h = 0; h < b.length; h++){
	    result += "{";
	    for(int w = 0; w < b[h].length; w++){
		result += b[h][w];
		result += " ";
	    }
	    result += "}";
	    result += "\n";
	}
	return result;
    }

    public boolean addShip(char[][] b, String ship,int row, int col){
	if(row < b.length && col < b[row].length){
	    if(b[row].length-col >= ship.length()){
		for(int i = 0; i < ship.length(); i++){
		    if(b[row][col+i]!='_' && b[row][col+i]!=ship.charAt(i)){
			return false;
		    }
		}
		for(int i = 0; i < ship.length(); i++){
		    b[row][col+i]=ship.charAt(i);

		}
		return true;
	    }
	}
	return false;
    }
}
