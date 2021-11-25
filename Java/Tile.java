
/**
 * Γράψτε μια περιγραφή της κλάσης Tile εδώ.
 * 
 * @author (Το όνομά σας) 
 * @version (Αριθμός έκδοσης ή ημερομηνία εδώ)
 */
public class Tile
{
    public int x,y;
    public Cell type;
    
    public Tile(int x, int y, Cell type)
    {
        this.x = x;
        this.y = y;
        this.type = type;
    }
    
    public String draw(boolean hidden)
    {
        switch(type)
        {
            case Sea:
                return ("~");
            case Ship:
                if(hidden==false){
                return ("s");
                }
                else return ("~");
                
            case Hit:
                return ("x");                
            case Miss:
                return ("o");
            default:
                return("Λάθος καταχώρηση!");
        }
    }
    
}

enum Cell
{
        Sea,Ship,Hit,Miss
};