import java.util.ArrayList;
import java.util.List;

public class Board
{
    private static final Integer ROW_LENGTH = 3;
    private static final Integer COLUMN_LENGTH = 3;

    private final List<Tile> tiles = new ArrayList<>();

    public Board()
    {
        for (int i = 0; i < ROW_LENGTH; i++)
        {
            for (int j = 0; j < COLUMN_LENGTH; j++)
            {
                Tile tile = new Tile(i, j);
                tiles.add(tile);
            }
        }
    }

    public Tile TileAt(int x, int y)
    {
        return tiles.stream()
                .filter(tile -> tile.getX() == x && tile.getY() == y)
                .findFirst()
                .orElse(null);
    }

    public void AddTileAt(char symbol, int x, int y)
    {
        TileAt(x,y).setSymbol(symbol);
    }
}