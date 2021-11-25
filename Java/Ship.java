

public abstract class Ship
{
    public String orient;
    public int shipsize;
    public Ship(int shipsize)
    {
        this.shipsize = shipsize;
       
    }
    
    public boolean placeShip(int x,int y, String orient, Board b )
    {
        if(OversizeException(x, y, orient) == false && OverlapTilesException(x,y,orient,b) == false)
        {
            if(orient == "k")
                {
                    for(int i=0;i<shipsize;i++)
                    {
                        b.array[x][y+i].type = Cell.Ship;
                    }
                }
                else if(orient == "o")
                {
                    for(int i=0;i<shipsize;i++)
                    {
                        b.array[x+i][y].type = Cell.Ship;
                    }
                }
                else System.out.println("Wrong letters!");
                return true;
        }
        return false;
    }
    public boolean OversizeException(int x,int y, String orient)
    {
  
            if(x<0 || y<0 || x>6 || y>6) return true;
            else
            {
                if(orient == "k")
                {
                    if((y+shipsize)>7) return true;
                    else return false;
                }
                else
                {
                    if((x+shipsize)>7)return true;
                    else return false;
            }
            
        }
    }
    
    public boolean OverlapTilesException(int x,int y,String orient,Board b)
    {
        int count = 0;
        if(orient == "k")
        {
               for(int i=0;i<shipsize;i++)
               {
                   if(b.array[x][y+i].type == Cell.Ship) count++;
               }
        }
        else
        {
            for(int i=0;i<shipsize;i++)
            {
                if(b.array[x+i][y].type == Cell.Ship) count++;
            }
        } 
        if(count == 0) return false;
        else return true;
    }
}