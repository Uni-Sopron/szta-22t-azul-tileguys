import java.lang.reflect.Array;

/**
 * <pre>
 * This is the main class for the Game.
 * THis class contains all the information about the PlayerBoards and the usage of Tiles from the Container and other objects like Bag, DiscardPile, Disc, Centerpool.
 * </pre>
 */
public class Game {

    Bag bag = new Bag();
    DiscardPile discardPile = new DiscardPile();
    Disc disc = new Disc();
    CenterPool centerPool = new CenterPool();
    
    /**
     * You should instantinate a PlayerBoard for each player at the startGame method.
     */
    PlayerBoard[] playerBoard;

    public void startGame(){};
    

    public void endGame(){};

    
}