

import com.mycompany.prjfantasygame.Dungeon;
import com.mycompany.prjfantasygame.Player;
import com.mycompany.prjfantasygame.TreasureChamber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

 
public class FantasyGameTest 
        
{
    private Player player;
    private Dungeon dungeon;
    private TreasureChamber treasureChamber;
    
    
   
    
    @Test
    public void testPlayerInitialisation() 
    {
         player = new Player("Test Player");
        //testing to see if the player character was successfully created
        assertEquals("Test Player", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(0, player.getScore());
    }

    @Test
    public void testPlayerTakeDamage() 
    {
        player = new Player("Test Player"); 
        //testing to see if the player's health went down from the damage
        player.takeDamage(30);
        assertEquals(70, player.getHealth());
        
        player.takeDamage(100);
        assertEquals(0, player.getHealth());

    }

    @Test
    public void testPlayerAddScore() 
    {
         player = new Player("Test Player"); 
        //testing to see if the score was successfully added to the players score total
        player.addScore(50);
        assertEquals(50, player.getScore());
    }

    @Test
    public void testDungeonDescription() 
    {
        dungeon = new Dungeon("A dark dungeon.");
        //testing to see if the dungeon description matches
        assertEquals("A dark dungeon.", dungeon.getDescription());
    }

    @Test
    public void testTreasureChamberInheritance() 
    {
         treasureChamber = new TreasureChamber("A chamber with treasure.", "Silver Shield");
        //testing to see if the treasurechamberinheritance works
        assertEquals("A chamber with treasure.", treasureChamber.getDescription());
        assertEquals("Silver Shield", treasureChamber.getTreasure());
    }

    @Test
    public void testTreasureChamberDescribe() 
    {
         treasureChamber = new TreasureChamber("A chamber with treasure.", "Magic Shield");
        //testing to see if the treasurechamber mathces the description
        treasureChamber.describe();
        assertEquals("A chamber with treasure.", treasureChamber.getDescription());
        assertEquals("Magic Shield", treasureChamber.getTreasure());
    }

    
}
