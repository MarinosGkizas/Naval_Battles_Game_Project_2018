
/**
 * Γράψτε μια περιγραφή της κλάσης Player εδώ.
 * 
 * @author (Το όνομά σας) 
 * @version (Αριθμός έκδοσης ή ημερομηνία εδώ)
 */
import java.util.Scanner;
public class Player
{
    String name;
    int statistics;
    int sum_shots,miss_shots,succ_shots,replays;
    int x,y;
    String orient;
    Board b;
    public Player(String name)
    {
        this.name = name;
        this.sum_shots = 0;
        this.miss_shots = 0;
        this.succ_shots = 0;
        this.replays = 0;
    }
    
    public void placeAllShips()
    {
        
    }
    
    public void placeShip(Ship c)
    {
      c.placeShip(x,y,orient,b);
    }
    
    public void fire(Board b,int[] c )
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Give the x and the y");
        c[0] = reader.nextInt();
        c[1] = reader.nextInt();
        reader.close();
        if(b.array[c[0]][c[1]].type == Cell.Ship) 
        {
            b.array[c[0]][c[1]].type = Cell.Hit;
            System.out.println("The player "+name+" just hit a ship! :D");
            sum_shots++;
            succ_shots++;
        }
        else if(b.array[c[0]][c[1]].type == Cell.Sea)
        {
            b.array[c[0]][c[1]].type = Cell.Miss;
            System.out.println("Ooo! :( The player "+name+" just miss.");
            sum_shots++;
            miss_shots++;
        }
        else
        {
            b.array[c[0]][c[1]].type = Cell.Miss;
            System.out.println("Oops, the player "+name+" has already hit this tile. :/");
            sum_shots++;
            replays++;
        }
       
    }

    public void getStats()
    {
        System.out.println("The sum of shots was "+sum_shots+", the succ. shots was "+succ_shots+", the miss shots was "+miss_shots+" and the replays was "+replays); 
    }
}