
public class Tile
{
    private final int x;
    private final int y;
    private char symbol = ' ';

    public Tile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean hasPosition(int x, int y) {
        return this.x == x && this.y == y;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
}