import java.util.ArrayList;
import java.util.List;

public class Board
{
    private static final Integer ROW_LENGTH = 3;
    private static final Integer COLUMN_LENGTH = 3;

    private final List<Tile> tiles = new ArrayList<>();

    public Board()
    {
        for (int x = 0; x < ROW_LENGTH; x++)
        {
            for (int y = 0; y < COLUMN_LENGTH; y++)
            {
                tiles.add(new Tile(x, y));
            }
        }
    }

    public Tile TileAt(int x, int y)
    {
        return tiles.stream()
                .filter(tile -> tile.hasPosition(x, y))
                .findFirst()
                .orElse(null);
    }

    public void AddTileAt(char symbol, int x, int y)
    {
        TileAt(x,y).setSymbol(symbol);
    }
}