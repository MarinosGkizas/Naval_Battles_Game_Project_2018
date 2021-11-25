
/**
 * Γράψτε μια περιγραφή της κλάσης Board εδώ.
 * 
 * @author (Το όνομά σας) 
 * @version (Αριθμός έκδοσης ή ημερομηνία εδώ)
 */
import java.util.Random;
public class Board
{
    int count;
    int i,j;
    Cell t = Cell.Sea;
    Tile s;
    Tile[][] array = new Tile[7][7];
    public Board()
    {
        for(i=0;i<7;i++)
        {   
             for(j=0;j<7;j++)
             {
                  array[i][j].x = i;
                  array[i][j].y = j;
                  array[i][j].type = Cell.Sea;
             }
        }
    }
     
    public void drawboard()
    {
        System.out.println("- - Y O U - -   - - O P P O N E N T - -");
        System.out.println(" 0 1 2 3 4 5 6       0 1 2 3 4 5 6");
        for(i=0;i<7;i++)
        {
            System.out.print(i+"");
            for(j=0;j<7;j++)
            {
                System.out.print(array[i][j].draw(false)+"");
            }
            System.out.print("     "+i+"");
            for(j=0;j<7;j++)
            {
                System.out.print(array[i][j].draw(true)+"");
            }
            System.out.println("");
        }
    }
    
    public void getAdjacentTiles(int x,int y)
    {
        System.out.println("The adjacent Tiles are the ("+array[x-1][y].x+","+array[x-1][y].y+"), ("+array[x][y-1].x+","+array[x][y-1].y+"), ("+array[x][y+1].x+","+array[x][y+1].y+") and ("+array[x+1][y].x+","+array[x+1][y].y+")");
    }
    
    public void placeAllShips(Carrier c,Battleship bb,Cruiser cr,Submarine s,Destroyer d)
    {
        String orient;
        int x,y,o;
        Random rand = new Random();
        
            x = rand.nextInt(6) + 0;
            y = rand.nextInt(6) + 0;
            o = rand.nextInt(1) + 0;
            if(o == 0) orient = "k";
            else orient = "o";
            
        
    }
    
    public boolean allShipsSunk()
    {
        for(i=0;i<7;i++)
        {
            for(j=0;j<7;j++)
            {
                if(array[i][j].type== Cell.Ship)
                {
                    count = count++;
                }
            }
        }
        if(count == 0) return true;
        else return false;
    }
}