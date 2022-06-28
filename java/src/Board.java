import java.util.ArrayList;
import java.util.List;

public class Board
{
    private List<Tile> _plays = new ArrayList<>();

    public Board()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                Tile tile = new Tile();
                tile.X = i;
                tile.Y = j;
                tile.Symbol = ' ';
                _plays.add(tile);
            }
        }
    }

    public Tile TileAt(int x, int y) //primitive obsession, data clumps
    {
        for (Tile t : _plays) {
            if (t.X == x && t.Y == y){
                return t;
            }
        }
        return null;
    }

    public void AddTileAt(char symbol, int x, int y) //primitive obsession, data clumps
    {
        Tile newTile = new Tile();//dead code
        newTile.X = x;
        newTile.Y = y;
        newTile.Symbol = symbol;

        TileAt(x,y).Symbol = symbol; //inapropariate intimacy
    }
}