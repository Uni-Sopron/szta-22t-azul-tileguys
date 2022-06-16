
public abstract class Container {
    /**
     * Tile has an EMPTY value to fill the objects with it for the init. Those objects are: Wall, SampleTileRow, BrokenTiles
     */
    public enum Tile{
        BLACK,
        BLUE,
        BLUESTAR,
        RED,
        YELLOW,
        EMPTY,
        FIRST_PLAYER
    }
    public Tile[] container;

    protected Container(){
    }
}
